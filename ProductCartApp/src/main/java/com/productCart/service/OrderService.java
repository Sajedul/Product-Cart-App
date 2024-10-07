package com.productCart.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.productCart.model.OrderRequest;
import com.productCart.model.ProductOrder;

public interface OrderService {
	public void saveOrder(Integer userid, OrderRequest orderRequest) throws Exception;

	public List<ProductOrder> getOrdersByUser(Integer userId);

	public ProductOrder updateOrderStatus(Integer id, String status);

	public List<ProductOrder> getAllOrders();

	public ProductOrder getOrdersByOrderId(String orderId);
	
	public Page<ProductOrder> getAllOrdersPagination(Integer pageNo,Integer pageSize);
}
