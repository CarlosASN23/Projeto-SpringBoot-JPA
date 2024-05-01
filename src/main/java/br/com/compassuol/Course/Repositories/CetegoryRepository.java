package br.com.compassuol.Course.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.compassuol.Course.Entity.Category;
import br.com.compassuol.Course.Entity.User;

@Repository
public interface CetegoryRepository extends JpaRepository<Category, Long>{

}

