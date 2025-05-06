package psu.edu.ch06.crud04.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import psu.edu.ch06.crud04.model.Product;
import psu.edu.ch06.crud04.model.ProductRepository;

@RestController
@RequestMapping("/v1/products")
public class ProductController {
	
	private final ProductRepository productRepository;

	private ProductController(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	@SuppressWarnings("unused")
	@GetMapping("/{requestedId}")
	private ResponseEntity<Product> findById(@PathVariable Integer requestedId) {
		//Product productA = new Product(5, "3d printer A", "A beginner friendly 3d printert", 2500.0);
		Optional<Product> productA = productRepository.findById(requestedId);
		
		// Response code = 200 (ok)
		if(productA.isPresent()) {
			return ResponseEntity.ok(productA.get()) ;
		}
		else {
            return ResponseEntity.notFound().build();
        }
	}
	
	@PostMapping
	private ResponseEntity<Void> createProduct(@RequestBody Product newProductRequest, UriComponentsBuilder ucb) {
		Product newProduct = productRepository.save(newProductRequest);
		URI locationOfNewProduct = ucb.path("/v1/products/{id}")
										.buildAndExpand(newProduct.id())
										.toUri();
		return ResponseEntity.created(locationOfNewProduct).build();
	}
	
	@GetMapping
	private ResponseEntity<Iterable<Product>> findAll() {
	   return ResponseEntity.ok(productRepository.findAll());
	}
	
//	@GetMapping
//	private ResponseEntity<List<Product>> findAll(Pageable pageable) {
//	   Page<Product> page = productRepository.findAll(
//	           PageRequest.of(
//	                   pageable.getPageNumber(),
//	                   pageable.getPageSize(),
//	                   pageable.getSortOr(Sort.by(Sort.Direction.DESC, "price"))));
//	   return ResponseEntity.ok(page.getContent());
//	}
//	
	@PutMapping("/{requestedId}")
	private ResponseEntity<Void> putProduct(@PathVariable Integer requestedId, @RequestBody Product productUpdate) {
		Optional<Product> product = productRepository.findById(requestedId);
		if (product.isPresent()) {
			Product updatedProduct = new Product(product.get().id(), productUpdate.name(), productUpdate.description(), productUpdate.price());
			productRepository.save(updatedProduct);
	    } else {
	    	return ResponseEntity.notFound().build();
	    }
	    return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping("/{requestedId}")
	private ResponseEntity<Void> deleteProduct(@PathVariable Integer requestedId) {
		Optional<Product> product = productRepository.findById(requestedId);
		if (product.isPresent()) {
			productRepository.delete(product.get());
	    } else {
	    	return ResponseEntity.notFound().build();
	    }
	    return ResponseEntity.noContent().build();
	}
	
}
