package com.sana.cart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sana.cart.model.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {

}
