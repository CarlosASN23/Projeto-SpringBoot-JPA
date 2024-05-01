package br.com.compassuol.Course.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.compassuol.Course.Entity.Category;
import br.com.compassuol.Course.Repositories.CetegoryRepository;

@Service
public class CategoryServices {

	@Autowired
	private CetegoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category>obj = repository.findById(id);
		return obj.get();
	}
}
