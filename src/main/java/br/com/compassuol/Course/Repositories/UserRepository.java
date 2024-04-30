package br.com.compassuol.Course.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.compassuol.Course.Entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
