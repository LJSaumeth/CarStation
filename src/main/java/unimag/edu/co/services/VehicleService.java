package unimag.edu.co.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import unimag.edu.co.model.Vehicle;
import unimag.edu.co.repository.VehicleRepository;

public class VehicleService {
private final VehicleRepository vehicleRepository;
	
	public VehicleService(VehicleRepository vehicleRepository) {
		this.vehicleRepository = vehicleRepository;
	}
	
	@Transactional
	public Vehicle saveVehicle(Vehicle vehicle) {
		return vehicleRepository.save(vehicle);
	}
	
	@Transactional
	public List<Vehicle> saveAllVehicles(List<Vehicle> vehicles){
		return vehicleRepository.saveAll(vehicles);
	} 
	
	public Vehicle findVehicleById(Long id) {
		return vehicleRepository.findById(id).orElse(null);
	}
	
	public List<Vehicle> findAllVehicles(){
		return vehicleRepository.findAll();
	}
	
	@Transactional
	public void deleteVehicleById(Long id) {
		vehicleRepository.deleteById(id);
		vehicleRepository.flush();
	}
	
	@Transactional
	public void deleteAllVehicles() {
		vehicleRepository.deleteAll();
		vehicleRepository.flush();
	}
}
