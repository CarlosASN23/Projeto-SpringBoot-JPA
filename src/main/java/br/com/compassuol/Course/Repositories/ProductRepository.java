package br.com.compassuol.Course.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.compassuol.Course.Entity.Product;
import br.com.compassuol.Course.Entity.User;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}

