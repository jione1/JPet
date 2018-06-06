package com.example.jpetstore.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.example.jpetstore.domain.Item;
import com.example.jpetstore.domain.Order;

public interface ItemDao {

  public void updateQuantity(Order order) throws DataAccessException;

  boolean isItemInStock(String itemId) throws DataAccessException;

  List<Item> getItemListByProduct(String productId) throws DataAccessException;

  Item getItem(String itemId) throws DataAccessException;
  
  void updateQuantity(int itemId) throws DataAccessException;
  //�ֹ� ��ҷ� ���� ���� ��ȭ�� �߻��Ͽ��� �� ����ϴ� �޼ҵ� 

  void insertInventoryQuantity(Item item);
  
  void insertItem(Item item);
  //�Ǹ��ڰ� �ø� �������� �����Ѵ�. 
  
  Item getItem(String itemId, String userId);
  //�Ǹ����� id�� ���� �������� �����´�. 
  
  void deletePost(String itemId);
}
