package unimag.edu.co.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import unimag.edu.co.model.Station;
import unimag.edu.co.repository.StationRepository;

public class StationService {
private final StationRepository stationRepository;
	
	public StationService(StationRepository stationRepository) {
		this.stationRepository = stationRepository;
	}
	
	@Transactional
	public Station saveStation(Station station) {
		return stationRepository.save(station);
	}
	
	@Transactional
	public List<Station> saveAllStations(List<Station> stations){
		return stationRepository.saveAll(stations);
	} 
	
	public Station findStationById(Long id) {
		return stationRepository.findById(id).orElse(null);
	}
	
	public List<Station> findAllStations(){
		return stationRepository.findAll();
	}
	
	@Transactional
	public void deleteStationById(Long id) {
		stationRepository.deleteById(id);
		stationRepository.flush();
	}
	
	@Transactional
	public void deleteAllStations() {
		stationRepository.deleteAll();
		stationRepository.flush();
	}
}
