package unimag.edu.co.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "stations")
@NoArgsConstructor
@AllArgsConstructor
public class Station {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false, name = "NAME")
	private String name;
	
	@Column(nullable = false, name = "CITY")
	private String city;
	
	@Column(nullable = false, name = "ADDRESS")
	private String address;
	
	@OneToMany(mappedBy = "station")
	private Set<Vehicle> vehicles;
	
	private void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
		vehicle.setStation(this);;
	}
}
