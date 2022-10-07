/*SeatsAvailable.Java
SeatsAvailable Entity
Author: Erin Rowan (215271157)
 */

package za.ac.cput.flightmanagementsystem.domain;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
@Entity
public class SeatsAvailable implements Serializable {
    public SeatsAvailable() {

    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private long id;
    @Column
    private String numberSeat;
    @Column
    private String bookedSeat;
    @Column
    private int reservedSeat;

    private SeatsAvailable (Builder builder){
        this.id= builder.id;
        this.numberSeat= builder.numberSeat;
        this.bookedSeat= builder.bookedSeat;
        this.reservedSeat= builder.reservedSeat;
    }

    public long getSeatId() {
        return id;
    }

    public void setSeatId(long id) {
        this.id = id;
    }

    public String getNumberSeat() {
        return numberSeat;
    }

    public void setNumberSeat(String numberSeat) {
        this.numberSeat = numberSeat;
    }

    public String getBookedSeat() {
        return bookedSeat;
    }

    public void setBookedSeat(String bookedSeat) {
        this.bookedSeat = bookedSeat;
    }

    public int getReservedSeat() {
        return reservedSeat;
    }

    public void setReservedSeat(int reservedSeats) {
        this.reservedSeat = reservedSeats;
    }

    @Override
    public String toString() {
        return "SeatsAvailable{" +
                "seat Id='" + id + '\'' +
                ", numberSeat=" + numberSeat +
                ", bookedSeat='" + bookedSeat + '\'' +
                ", reservedSeat=" + reservedSeat +
                '}';
    }


    public static class Builder{
        private long id;
        private String numberSeat;
        private String bookedSeat;
        private int reservedSeat;

        public Builder setSeatId(long id) {
            this.id = id;
            return this;
        }
        public Builder setNumberSeat(String numberSeat) {
            this.numberSeat = numberSeat;
            return this;
        }

        public Builder setBookedSeat(String bookedSeat) {
            this.bookedSeat = bookedSeat;
            return this;
        }

        public Builder setReservedSeat(int reservedSeat) {
            this.reservedSeat = reservedSeat;
            return this;
        }
        public Builder copy(SeatsAvailable seatsAvailable) {
            this.id= seatsAvailable.id;
            this.numberSeat = seatsAvailable.numberSeat;
            this.bookedSeat = seatsAvailable.bookedSeat;
            this.reservedSeat = seatsAvailable.reservedSeat;
            return this;
        }
        public SeatsAvailable build(){
            return new SeatsAvailable(this);
        }



    }
}
