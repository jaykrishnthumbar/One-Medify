package com.pharmacystore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharmacystore.controller.Pharmacist;
import com.pharmacystore.dto.PharmacistDto;
import com.pharmacystore.repo.PharmacistRepo;
@Service
public class PharmacistServiceImpl implements PharmacistService {

	@Autowired
	private PharmacistRepo pharmacistrepo;

	@Override
	public PharmacistDto userToUserDto(Pharmacist pharmacist) {
		PharmacistDto ph = new PharmacistDto();
		ph.setName(pharmacist.getName());
		ph.setEmail(pharmacist.getEmail());
		ph.setPassword(pharmacist.getPassword());
		ph.setDate(pharmacist.getDate());
		ph.setMobile(pharmacist.getMobile());
		ph.setAddress(pharmacist.getAddress());
		ph.setState(pharmacist.getState());
		ph.setCity(pharmacist.getCity());

		return ph;
	}

	@Override
	public Pharmacist pharmacistDtoToPharmacist(PharmacistDto pharmacistdto) {
		Pharmacist ph = new Pharmacist();
		ph.setName(pharmacistdto.getName());
		ph.setEmail(pharmacistdto.getEmail());
		ph.setPassword(pharmacistdto.getPassword());
		ph.setDate(pharmacistdto.getDate());
		ph.setMobile(pharmacistdto.getMobile());
		ph.setAddress(pharmacistdto.getAddress());
		ph.setState(pharmacistdto.getState());
		ph.setCity(pharmacistdto.getCity());

		return ph;
	}

	@Override
	public String savePharmacist(PharmacistDto pharmacistdto) {
		
		Pharmacist pharmacist = pharmacistDtoToPharmacist(pharmacistdto);
		System.out.println(pharmacist);
		pharmacistrepo.save(pharmacist);
		return "Saved Successfully...";
	}

	@Override
	public List<Pharmacist> getAllPharmacist(Pharmacist pharmacist) {
		return pharmacistrepo.findAll();
	}

	@Override
	public Pharmacist getPharmacist(int id) {
		return pharmacistrepo.findById(id).get();
	}

	@Override
	public String deletePharmacist(int id) {
		Pharmacist ph = pharmacistrepo.findById(id).get();
		if (ph == null) {
			return "Not found..";
		}
		pharmacistrepo.delete(ph);
		return "Delete successfully...";
	}

	@Override
	public String updatePharmacist(Pharmacist pharmacist, int id) {
		Pharmacist ph = pharmacistrepo.findById(id).get();
		if (ph == null) {
			return "User Not Found...";
		}
		ph.setName(pharmacist.getName());
		ph.setEmail(pharmacist.getEmail());
		ph.setPassword(pharmacist.getPassword());
		ph.setDate(pharmacist.getDate());
		ph.setMobile(pharmacist.getMobile());
		ph.setAddress(pharmacist.getAddress());
		ph.setState(pharmacist.getState());
		ph.setCity(pharmacist.getCity());
		pharmacistrepo.save(ph);
		return "Updated Successfully....";
	}

	@Override
	public Pharmacist getPharmacistByEmail(String email) {
		return pharmacistrepo.findByEmail(email);
	}

	@Override
	public List<Pharmacist> findPharmacistByName(String name) {
		// TODO Auto-generated method stub
		return pharmacistrepo.findByName(name);
	}

}
