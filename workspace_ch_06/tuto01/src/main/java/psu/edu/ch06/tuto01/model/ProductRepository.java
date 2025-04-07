package psu.edu.ch06.tuto01.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import psu.edu.ch06.tuto01.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>,
											PagingAndSortingRepository<Product, Integer>{

}
