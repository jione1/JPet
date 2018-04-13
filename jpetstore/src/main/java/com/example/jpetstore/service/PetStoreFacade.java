package com.example.jpetstore.service;

import java.util.List;

import com.example.jpetstore.domain.Account;
import com.example.jpetstore.domain.Category;
import com.example.jpetstore.domain.Item;
import com.example.jpetstore.domain.Order;
import com.example.jpetstore.domain.Product;

/**
 * JPetStore's central business interface.
 *
 * @author Juergen Hoeller
 * @since 30.11.2003
 */
public interface PetStoreFacade {

	Account getAccount(String username);

	Account getAccount(String username, String password);

	void insertAccount(Account account);

	void updateAccount(Account account);

	List<String> getUsernameList();


	List<Category> getCategoryList();

	Category getCategory(String categoryId);
	

	List<Product> getProductListByCategory(String categoryId);

	List<Product> searchProductList(String keywords);

	Product getProduct(String productId);


	List<Item> getItemListByProduct(String productId);

	Item getItem(String itemId);

	boolean isItemInStock(String itemId);


	void insertOrder(Order order);

	Order getOrder(int orderId);

	List<Order> getOrdersByUsername(String username);
	
	/*	�߰��� �޼ҵ� ���� */
	//��� �����ϱ� 
	
	void partiAuc(int aucNum, int inputPrice, String userID);
	//����ڰ� ���ǿ� �����ϸ鼭 ���ϴ� ������ ���� -> AucParti�� ������ ����
	
	void updateAucStatus(boolean aucStatus);
	//�������� �����ڰ� �ֹ��� ���� ��� aucstatus�� true�� �����Ͽ� ���� �����ϰ� �ִ� ���ǰ� �����Ѵ�.
	
	void updateOrderStatus(boolean orderStatus);
	//�������� �����ڰ� �ֹ��� ���� ��� orderStatus�� true�� �����Ͽ� ���� �����ϰ� �ִ� ���ǰ� �����Ѵ�.
	
	List<AucItem> getAucList();
	//��� ����Ʈ�� ��� �ҷ��´�. �������->aucstatus�� true / �������� ��� -> aucstatus�� false
	
	void deleteMaxInputPrice(int aucNum);
	//�������� ����ڰ� ������ �������� ��� inputprice�� ���� ���� ������ delete�� �Ŀ� maxprice�� �����Ѵ�.
	
	Auction getAuctionPost(int aucNum);
	//���ǹ�ȣ�� ���� ���� ����Ʈ�� ��ȯ�Ѵ�. 
	
	String findAucUserID(int maxPrice);
	//ū ���� �Է��� ������� ���̵� �޾ƿ´�. 
	
	
	//p2p
	
	void insertItem(Item item);
	//�Ǹ��ڰ� �ۼ��� p2p�� �ִ� item ������ �����Ѵ�. 
	
	void insertP2P(P2P p2p);
	//����ڰ� �Է��� p2p post�� ������ �����Ѵ�. 
	
	//void updateQuantity(int itemId, int quantity);
	//����ڰ� �ֹ�/ �ֹ���� ���� ��� item�� ������ �����Ѵ�. 
	
	P2P getP2PList(String userId);
	//userId�� �´� p2p����Ʈ�� �޾ƿͼ� �Ǹ����������� �����Ѵ�. 
	
	Item getItem(String itemId, String userId); 
	//userId�� ������ �Ǹ��� �������� �����´�. 
	
	void deleteItem(int itemId);
	//cascade�� �̿��ؼ� ����� p2p�� �����. 
	
	void updateP2P(Item itemId);
	//�Ǹ��ڰ� ������ ������ �����Ͽ��� ��� ȣ��ȴ�. 
	
	
	//����м��ϱ� 
	
	void insertTendencyResult(Tendency tendency);
	//���� �м� ����� �Է��Ѵ�. 
	
	void updateTendency(Tendency tendency);
	//����ڰ� ���� ����� �ٽ� ���� ��� tendency�� ������Ʈ�Ѵ�. 
	
	String getTendencyResult(String userId);
	//������� ���� ����� �����ͼ� �����ش�. 
	
	
	//�����ϱ� 
	
	void insertQA(Q_A qa);
	//����ڰ� �ۼ��� ���Ǳ��� �����Ѵ�. 
	
	void updateQA(Q_A qa);
	//����ڰ� ���Ǳ��� �����Ͽ��� �� ���
	
	void updateQA(String QAnswer);
	//�����ڳ� �Ǹ��ڰ� �亯�� �޾��� �� ���
	
	void deleteQA(int QNUM);
	//����ڰ� ���Ǳ��� ������ �� ���
	
	List<Q_A> getQAList();
	//���Ǳ� ���θ� �ҷ��� �� ���
	
	Q_A getQA(int itemId);
	//�Ǹ����� item�� ���� ���Ǳ��� ������ �� ���
	
	Q_A getQA(String adId);
	//�����ڿ��� �ۼ��� ���Ǳ��� ������ �� ��

}