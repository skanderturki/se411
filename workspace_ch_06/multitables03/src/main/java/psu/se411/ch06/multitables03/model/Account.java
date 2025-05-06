package psu.se411.ch06.multitables03.model;

import org.springframework.data.annotation.Id;

public record Account (
	@Id Integer id,
	String number,
	String name
) {}
