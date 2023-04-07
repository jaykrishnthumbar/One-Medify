package com.pharmacystore.controller;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "pharmacist")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Pharmacist {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
