package za.ac.cput.flightmanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.flightmanagementsystem.domain.SeatsAvailable;
import za.ac.cput.flightmanagementsystem.exception.UserNotFoundException;
import za.ac.cput.flightmanagementsystem.repository.ISeatsAvailableRepository;

import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class SeatsAvailableService {
    private final ISeatsAvailableRepository seatsAvailableRepository;

    @Autowired
    public SeatsAvailableService(ISeatsAvailableRepository seatsAvailableRepository) {
        this.seatsAvailableRepository = seatsAvailableRepository;
    }

    public SeatsAvailable addSeatsAvailable(SeatsAvailable seatsAvailable) {
        return seatsAvailableRepository.save(seatsAvailable);
    }

    public List<SeatsAvailable> findAllSeatsAvailable() {
        return seatsAvailableRepository.findAll();
    }

    public SeatsAvailable updateSeatsAvailable(SeatsAvailable seatsAvailable) {
        return seatsAvailableRepository.save(seatsAvailable);
    }

    public SeatsAvailable findSeatsAvailableById(Long id) {
        return seatsAvailableRepository.findSeatsAvailableById(id)
                .orElseThrow(() -> new UserNotFoundException("Seat by id " + id + " was not available"));
    }

    public void deleteSeatsAvailable(Long id){
        seatsAvailableRepository.deleteSeatsAvailableById(id);
    }
}
