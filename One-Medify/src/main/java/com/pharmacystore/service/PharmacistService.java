package com.pharmacystore.service;

import java.util.List;

import com.pharmacystore.controller.Pharmacist;
import com.pharmacystore.dto.PharmacistDto;

public interface PharmacistService {
	public String savePharmacist(PharmacistDto pharmacistdto);

	public List<Pharmacist> getAllPharmacist(Pharmacist pharmacist);

	public Pharmacist getPharmacist(int id);

	public String deletePharmacist(int id);

	public String updatePharmacist(Pharmacist pharmacist, int id);

	PharmacistDto userToUserDto(Pharmacist pharmacist);

	Pharmacist pharmacistDtoToPharmacist(PharmacistDto pharmacistdto);

	public Pharmacist getPharmacistByEmail(String email);

	public List<Pharmacist> findPharmacistByName(String name);

}
