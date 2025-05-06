package psu.edu.ch06.crud04.model;

import org.springframework.data.annotation.Id;

public record Product (
		@Id Integer id,
		String name,
		String description,
		Double price
) {
	
}
