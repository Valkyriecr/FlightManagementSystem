package za.ac.cput.flightmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.flightmanagementsystem.domain.Luggage;

import java.util.Optional;
@Repository
public interface ILuggageRepository extends JpaRepository<Luggage, Long> {
    void deleteLuggageById(Long id);

    Optional<Luggage> findLuggageById(Long id);
}
