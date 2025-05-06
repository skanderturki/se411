package psu.se411.ch06.multitables03.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;

public record CreditCard (
		@Id Integer id,
		String number,
		Integer account_id
) {}
