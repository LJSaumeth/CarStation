package unimag.edu.co.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import unimag.edu.co.model.Station;

@Repository
public interface StationRepository extends JpaRepository<Station, Long> {
	List<Station> findByCity(String city);
}
