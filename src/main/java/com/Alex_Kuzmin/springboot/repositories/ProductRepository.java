package com.Alex_Kuzmin.springboot.repositories;


import com.Alex_Kuzmin.springboot.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
