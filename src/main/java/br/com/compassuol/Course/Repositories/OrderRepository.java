package br.com.compassuol.Course.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.compassuol.Course.Entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
