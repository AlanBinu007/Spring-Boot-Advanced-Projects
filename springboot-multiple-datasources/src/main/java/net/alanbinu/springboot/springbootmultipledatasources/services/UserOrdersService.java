
package net.alanbinu.springboot.springbootmultipledatasources.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.alanbinu.springboot.springbootmultipledatasources.orders.entities.Order;
import net.alanbinu.springboot.springbootmultipledatasources.orders.repositories.OrderRepository;
import net.alanbinu.springboot.springbootmultipledatasources.security.entities.User;
import net.alanbinu.springboot.springbootmultipledatasources.security.repositories.UserRepository;

@Service
public class UserOrdersService
{
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Transactional(transactionManager="securityTransactionManager")
	public List<User> getUsers()
	{
		return userRepository.findAll();
	}
	
	@Transactional(transactionManager="ordersTransactionManager")
	public List<Order> getOrders()
	{
		return orderRepository.findAll();
	}
}
