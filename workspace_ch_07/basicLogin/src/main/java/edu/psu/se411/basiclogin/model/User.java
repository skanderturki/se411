package edu.psu.se411.basiclogin.model;

import org.springframework.data.annotation.Id;

public record User(
		@Id Integer id,
		String username,
		String password) {

}
