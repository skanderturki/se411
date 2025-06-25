package edu.psu.se411.basiclogin.model;

import org.springframework.data.annotation.Id;

public record Employee(
		@Id Integer id,
		String name,
		String lastname) {

}
