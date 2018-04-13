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
	
	/*	추가한 메소드 선언 */
	//경매 참여하기 
	
	void partiAuc(int aucNum, int inputPrice, String userID);
	//사용자가 옥션에 참가하면서 원하는 가격을 적음 -> AucParti에 데이터 삽입
	
	void updateAucStatus(boolean aucStatus);
	//낙찰받은 참여자가 주문을 했을 경우 aucstatus를 true로 설정하여 현재 진행하고 있는 옥션과 구별한다.
	
	void updateOrderStatus(boolean orderStatus);
	//낙찰받은 참여자가 주문을 했을 경우 orderStatus를 true로 설정하여 현재 진행하고 있는 옥션과 구별한다.
	
	List<AucItem> getAucList();
	//경매 리스트를 모두 불러온다. 지난경매->aucstatus가 true / 진행중인 경매 -> aucstatus가 false
	
	void deleteMaxInputPrice(int aucNum);
	//낙찰받은 사용자가 낙찰을 포기했을 경우 inputprice중 가장 높은 가격을 delete한 후에 maxprice를 변경한다.
	
	Auction getAuctionPost(int aucNum);
	//옥션번호에 따른 옥션 포스트를 반환한다. 
	
	String findAucUserID(int maxPrice);
	//큰 값을 입력한 사용자의 아이디를 받아온다. 
	
	
	//p2p
	
	void insertItem(Item item);
	//판매자가 작성한 p2p에 있는 item 정보를 저장한다. 
	
	void insertP2P(P2P p2p);
	//사용자가 입력한 p2p post의 정보를 삽입한다. 
	
	//void updateQuantity(int itemId, int quantity);
	//사용자가 주문/ 주문취소 했을 경우 item의 수량을 변경한다. 
	
	P2P getP2PList(String userId);
	//userId에 맞는 p2p리스트를 받아와서 판매자페이지를 구성한다. 
	
	Item getItem(String itemId, String userId); 
	//userId가 있으면 판매자 아이템을 가져온다. 
	
	void deleteItem(int itemId);
	//cascade를 이용해서 연계된 p2p도 지운다. 
	
	void updateP2P(Item itemId);
	//판매자가 아이템 정보를 수정하였을 경우 호출된다. 
	
	
	//성향분석하기 
	
	void insertTendencyResult(Tendency tendency);
	//성향 분석 결과를 입력한다. 
	
	void updateTendency(Tendency tendency);
	//사용자가 성향 결과를 다시 했을 경우 tendency를 업데이트한다. 
	
	String getTendencyResult(String userId);
	//사용자의 성향 결과를 가져와서 보여준다. 
	
	
	//문의하기 
	
	void insertQA(Q_A qa);
	//사용자가 작성한 문의글을 저장한다. 
	
	void updateQA(Q_A qa);
	//사용자가 문의글을 변경하였을 때 사용
	
	void updateQA(String QAnswer);
	//관리자나 판매자가 답변을 달았을 때 사용
	
	void deleteQA(int QNUM);
	//사용자가 문의글을 삭제할 때 사용
	
	List<Q_A> getQAList();
	//문의글 전부를 불러올 때 사용
	
	Q_A getQA(int itemId);
	//판매자의 item에 따른 문의글을 가져올 때 사용
	
	Q_A getQA(String adId);
	//관리자에게 작성한 문의글을 가져올 때 사

}