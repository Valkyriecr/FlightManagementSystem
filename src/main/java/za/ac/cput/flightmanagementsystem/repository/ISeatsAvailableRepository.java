package za.ac.cput.flightmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.flightmanagementsystem.domain.SeatsAvailable;

import java.util.Optional;
@Repository
public interface ISeatsAvailableRepository extends JpaRepository<SeatsAvailable, Long> {
    void deleteSeatsAvailableById(Long id);

    Optional<SeatsAvailable> findSeatsAvailableById(Long id);
}
