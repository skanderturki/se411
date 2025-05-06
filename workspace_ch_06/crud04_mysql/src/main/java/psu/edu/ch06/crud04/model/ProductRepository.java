package psu.edu.ch06.crud04.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>,
											PagingAndSortingRepository<Product, Integer>{

}
