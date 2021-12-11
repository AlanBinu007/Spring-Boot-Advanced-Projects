/**
 * 
 */
package net.alanbinu.springboot.springbootmultipledatasources.orders.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import net.alanbinu.springboot.springbootmultipledatasources.orders.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Integer>{

}
