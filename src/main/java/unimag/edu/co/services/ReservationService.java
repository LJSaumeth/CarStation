package unimag.edu.co.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import unimag.edu.co.model.Reservation;
import unimag.edu.co.repository.ReservationRepository;

public class ReservationService {
private final ReservationRepository reservationRepository;
	
	public ReservationService(ReservationRepository reservationRepository) {
		this.reservationRepository = reservationRepository;
	}
	
	@Transactional
	public Reservation saveReservation(Reservation reservation) {
		return reservationRepository.save(reservation);
	}
	
	@Transactional
	public List<Reservation> saveAllReservations(List<Reservation> reservations){
		return reservationRepository.saveAll(reservations);
	} 
	
	public Reservation findReservationById(Long id) {
		return reservationRepository.findById(id).orElse(null);
	}
	
	public List<Reservation> findAllReservations(){
		return reservationRepository.findAll();
	}
	
	@Transactional
	public void deleteReservationById(Long id) {
		reservationRepository.deleteById(id);
		reservationRepository.flush();
	}
	
	@Transactional
	public void deleteAllReservations() {
		reservationRepository.deleteAll();
		reservationRepository.flush();
	}
}
