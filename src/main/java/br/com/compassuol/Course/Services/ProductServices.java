package br.com.compassuol.Course.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.compassuol.Course.Entity.Product;
import br.com.compassuol.Course.Repositories.ProductRepository;

@Service
public class ProductServices {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product>obj = repository.findById(id);
		return obj.get();
	}
}
