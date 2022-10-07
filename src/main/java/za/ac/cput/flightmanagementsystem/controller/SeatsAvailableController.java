
package za.ac.cput.flightmanagementsystem.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.flightmanagementsystem.domain.SeatsAvailable;
import za.ac.cput.flightmanagementsystem.service.SeatsAvailableService;

import java.util.List;

@RestController
@RequestMapping("/seatsavailable")
public class SeatsAvailableController {
    private final SeatsAvailableService seatsAvailableService;

    public SeatsAvailableController(SeatsAvailableService seatsAvailableService) {
        this.seatsAvailableService = seatsAvailableService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<SeatsAvailable>> getAllSeatsAvailable () {
        List<SeatsAvailable> seatsAvailable = seatsAvailableService.findAllSeatsAvailable();
        return new ResponseEntity<>(seatsAvailable, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<SeatsAvailable> getSeatsAvailable (@PathVariable("id") Long id) {
        SeatsAvailable seatsAvailable = seatsAvailableService.findSeatsAvailableById(id);
        return new ResponseEntity<>(seatsAvailable, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<SeatsAvailable> addSeatsAvailable(@RequestBody SeatsAvailable seatsAvailable) {
        SeatsAvailable newSeatAvailable = seatsAvailableService.addSeatsAvailable(seatsAvailable);
        return new ResponseEntity<>(newSeatAvailable, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<SeatsAvailable> updateSeatsAvailable(@RequestBody SeatsAvailable seatsAvailable) {
        SeatsAvailable updateSeatsAvailable = seatsAvailableService.updateSeatsAvailable(seatsAvailable);
        return new ResponseEntity<>(updateSeatsAvailable, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteSeatsAvailable(@PathVariable("id") Long id) {
        seatsAvailableService.deleteSeatsAvailable(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
