package com.example.optic_store.repositories;

import com.example.optic_store.models.Order;
import com.example.optic_store.models.Person;
import org.aspectj.weaver.ast.Or;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

    List<Order> findByPerson(Person person);
}
