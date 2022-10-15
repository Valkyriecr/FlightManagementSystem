package za.ac.cput.flightmanagementsystem.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Seat implements Serializable {
    @Id
    private long id;
    private int rowNum;
    private String seatLetter;
    private int seatPreference;

    public void seatMaker(){
        for (int i=0; i<20;i++){
            rowNum = i;
            for( int k=0;k<6;k++){
                switch (k){
                    case 0:
                        seatLetter="A";
                        break;
                    case 1:
                        seatLetter="B";
                        break;
                    case 2:
                        seatLetter="C";
                        break;
                    case 3:
                        seatLetter="D";
                        break;
                    case 4:
                        seatLetter="E";
                        break;
                    case 5:
                        seatLetter="F";
                        break;
                }
                System.out.println(rowNum+seatLetter);
            }
        }
    }


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
