package za.ac.cput.flightmanagementsystem.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Seats implements Serializable {
    @Id
    private long id;
    private int row;
    private int seatPreferance;


    public int isleOrWindow(int seatPref){
        switch(seatPref){
            case 1:
                seatPreferance=1;
                break;
            case 2:
                seatPreferance=2;
                break;
            case 3:
                seatPreferance=3;
                break;

        }
        return seatPreferance;
    }
}
