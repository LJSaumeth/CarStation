package unimag.edu.co.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import unimag.edu.co.model.DriverLicense;

@Repository
public interface DriverLicenseRepository extends JpaRepository<DriverLicense, Long> {
    Optional<DriverLicense> findByUserId(Long userId);
}
