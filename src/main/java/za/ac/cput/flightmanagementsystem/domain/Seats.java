package za.ac.cput.flightmanagementsystem.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Seats implements Serializable {
    @Id
    private long id;
    private int row;
    private int seatPreference;


    public int isleOrWindow(int seatPref){
        switch(seatPref){
            case 1:
                seatPreference =1;
                break;
            case 2:
                seatPreference =2;
                break;
            case 3:
                seatPreference =3;
                break;

        }
        return seatPreference;
    }
}
