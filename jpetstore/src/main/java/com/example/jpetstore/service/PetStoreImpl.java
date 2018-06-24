package com.example.jpetstore.service;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.jpetstore.dao.AccountDao;
import com.example.jpetstore.dao.AuctionItemDao;
import com.example.jpetstore.dao.CategoryDao;
import com.example.jpetstore.dao.ItemDao;
import com.example.jpetstore.dao.OrderDao;
import com.example.jpetstore.dao.ProductDao;
import com.example.jpetstore.dao.SequenceDao;
import com.example.jpetstore.dao.mybatis.OracleSequenceDao;
import com.example.jpetstore.domain.Account;
import com.example.jpetstore.domain.Category;
import com.example.jpetstore.domain.Item;
import com.example.jpetstore.domain.Order;
import com.example.jpetstore.domain.Product;

/**
 * JPetStore primary business object.
 * 
 * <p>This object makes use of five DAO objects, decoupling it
 * from the details of working with persistence APIs. So
 * although this application uses iBATIS for data access,
 * a different persistence tool could be dropped in without
 * breaking this class.
 *
 * <p>The DAOs are made available to the instance of this object
 * using Dependency Injection. (The DAOs are in turn configured using
 * Dependency Injection themselves.) We use Setter Injection here,
 * exposing JavaBean setter methods for each DAO. This means there is
 * a JavaBean property for each DAO. In the present case, the properties
 * are write-only: there are no corresponding getter methods. Getter
 * methods for configuration properties are optional: Implement them
 * only if you want to expose those properties to other business objects.
 *
 * <p>There is one instance of this class in the JPetStore application.
 * In Spring terminology, it is a "singleton", referring to a
 * per-Application Context singleton. The factory creates a single
 * instance; there is no need for a private constructor, static
 * factory method etc as in the traditional implementation of
 * the Singleton Design Pattern. 
 *
 * <p>This is a POJO. It does not depend on any Spring APIs.
 * It's usable outside a Spring container, and can be instantiated
 * using new in a JUnit test. However, we can still apply declarative
 * transaction management to it using Spring AOP.
 *
 * <p>This class defines a default transaction annotation for all methods.
 *
 * @author Juergen Hoeller
 * @since 30.11.2003
 * @modified by Changsup Park
 */
@Service
@Transactional
public class PetStoreImpl implements PetStoreFacade { 
	

	@Autowired	// @Qualifier("mybatisAccountDao")
	private AccountDao accountDao;
	
	@Autowired  
	@Qualifier("jdbcTemplateCategoryDao") // �Ǵ�  
	// @Qualifier("namedParameterJdbcTemplateCategoryDao")  // �Ǵ� 
	// @Qualifier("jdbcDaoSupportCategoryDao")  // �Ǵ�
	// @Qualifier("PureJdbcCategoryDao")
	private CategoryDao categoryDao;
	
	@Autowired  // @Qualifier("mybatisProductDao")
	private ProductDao productDao;
	
	@Autowired	// @Qualifier("mybatisItemDao")
	private ItemDao itemDao;
	
	@Autowired	// @Qualifier("mybatisOrderDao")
	private OrderDao orderDao;

	@Autowired
	private SequenceDao oracleSequenceDao;
	
	@Autowired
	private AuctionItemDao aucItemDao;

	//-------------------------------------------------------------------------
	// Operation methods, implementing the PetStoreFacade interface
	//-------------------------------------------------------------------------

	public Account getAccount(String username) {
		return accountDao.getAccount(username);
	}

	public Account getAccount(String username, String password) {
		return accountDao.getAccount(username, password);
	}

	public void insertAccount(Account account) {
		accountDao.insertAccount(account);
	}

	public void updateAccount(Account account) {
		accountDao.updateAccount(account);
	}

	public void kakaoLogin(Account account) {
		accountDao.kakaoLogin(account);
	}
	
	public List<String> getUsernameList() {
		return accountDao.getUsernameList();
	}

	public List<Category> getCategoryList() {
		return categoryDao.getCategoryList();
	}

	public Category getCategory(String categoryId) {
		return categoryDao.getCategory(categoryId);
	}

	public List<Product> getProductListByCategory(String categoryId) {
		return productDao.getProductListByCategory(categoryId);
	}

	public List<Product> searchProductList(String keywords) {
		return productDao.searchProductList(keywords);
	}

	public Product getProduct(String productId) {
		return productDao.getProduct(productId);
	}
	
	public void insertProduct(Product product) {
		productDao.insertProduct(product);
	}
	
	public List<Item> getItemListByProduct(String productId) {
		return itemDao.getItemListByProduct(productId);
	}

	public Item getItem(String itemId) {
		return itemDao.getItem(itemId);
	}
	
	public void insertInventoryQuantity(Item item) {
		itemDao.insertInventoryQuantity(item);
	}
	
	public void insertItem(Item item) {
		 itemDao.insertItem(item);
	}

	public boolean isItemInStock(String itemId) {
		return itemDao.isItemInStock(itemId);
	}

	public void insertOrder(Order order) {
		itemDao.updateQuantity(order);	    
		orderDao.insertOrder(order);
	}
	
	public Order getOrder(int orderId) {
		return orderDao.getOrder(orderId);
	}

	public List<Order> getOrdersByUsername(String username) {
		return orderDao.getOrdersByUsername(username);
	}
	
	public int getOracleSequence(String name) {
		return oracleSequenceDao.getNextId(name);
	}
	
	@Override
	public void deletePost(String itemId) {
		// TODO Auto-generated method stub
		itemDao.deletePost(itemId);
	}
	
	@Override
	public void updatePost(Item item) {
		itemDao.updatePost(item);
	}
	
	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.updateProduct(product);
	}

	@Override
	public void updateQuantity(Item item) {
		// TODO Auto-generated method stub
		itemDao.updateQuantity(item);
	}
	
	@Autowired
	private ThreadPoolTaskScheduler scheduler;
	
	public void testScheduler(Date endTime) {
		Runnable updateStatus = new Runnable() {
			@Override
			public void run() {
				Date curTime = new Date();
				aucItemDao.closeAuction(curTime);
				System.out.println("====================================");
				System.out.println("curTime " + curTime);
			}
		};
		
		scheduler.schedule(updateStatus, endTime);
		
		System.out.println("======================================");
		System.out.println("endTime" + endTime);
	}

}