package unimag.edu.co.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Builder;

@Entity
@Builder
@Table(name = "vehicles")
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false, name = "PLATE")
	private String plate;
	
	@Column(nullable = false, name = "BRAND")
	private String brand;
	
	@Column(nullable = false, name = "MODEL")
	private String model;
	
	@Column(nullable = false, name = "YEAR")
	private Integer year;
	
	@Column(nullable = false, name = "STATUS")
	private String status;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "station_id")
	private Station station;
	
	@OneToMany(mappedBy = "vehicle")
	private Set<Reservation> reservations;
}
