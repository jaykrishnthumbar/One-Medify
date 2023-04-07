package com.pharmacystore.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PharmacistDto {
	
	private int id;
	private String name;
	private String email;
	private String password;
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate date;
	private Long mobile;
	private String address;
	private String state;
	private String city;
	
}
