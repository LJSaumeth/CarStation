package unimag.edu.co.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Builder;

@Builder
@Entity
@Table(name = "driverlicenses")
public class DriverLicense {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false, name = "LICENSE_NUMBER")
	private String licenseNumber;
	
	@Column(nullable = false, name = "CATEGORY")
	private String category;
	
	@Column(nullable = false, name = "ISSUED_AT")
	private java.time.LocalDate issuedAt;
	
	@Column(nullable = false, name = "EXPERIES_AT")
	private java.time.LocalDate experiesAt;
	
	@OneToOne(mappedBy = "driverlicense", fetch =FetchType.LAZY )
	private User user;

}
