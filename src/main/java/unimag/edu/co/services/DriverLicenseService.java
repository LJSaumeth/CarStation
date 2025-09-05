package unimag.edu.co.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import unimag.edu.co.model.DriverLicense;
import unimag.edu.co.repository.DriverLicenseRepository;

public class DriverLicenseService {
private final DriverLicenseRepository driverLicenseRepository;
	
	public DriverLicenseService(DriverLicenseRepository driverLicenseRepository) {
		this.driverLicenseRepository = driverLicenseRepository;
	}
	
	@Transactional
	public DriverLicense saveDriverLicense(DriverLicense driverLicense) {
		return driverLicenseRepository.save(driverLicense);
	}
	
	@Transactional
	public List<DriverLicense> saveAllDriverLicenses(List<DriverLicense> driverLicenses){
		return driverLicenseRepository.saveAll(driverLicenses);
	} 
	
	public DriverLicense findDriverLicenseById(Long id) {
		return driverLicenseRepository.findById(id).orElse(null);
	}
	
	public List<DriverLicense> findAllDriverLicenses(){
		return driverLicenseRepository.findAll();
	}
	
	@Transactional
	public void deleteDriverLicenseById(Long id) {
		driverLicenseRepository.deleteById(id);
		driverLicenseRepository.flush();
	}
	
	@Transactional
	public void deleteAllDriverLicenses() {
		driverLicenseRepository.deleteAll();
		driverLicenseRepository.flush();
	}
}
