/*Luggage.Java
Luggage Entity
Author: Erin Rowan (215271157)
 */
package za.ac.cput.flightmanagementsystem.domain;



import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;


@Entity
public class Luggage implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private long id;
    private String luggageOwner; //luggageOwner.getID();

    private float weight;

    private String luggageType;
    private final float weightLimit = 20;
    private boolean isOverWeight;

    protected Luggage() {

    }

    private Luggage (Builder builder){
        this.id=builder.id;
        this.luggageOwner=builder.luggageOwner;
        this.weight=builder.weight;
        this.luggageType=builder.luggageType;
        this.isOverWeight=builder.isOverWeight;

    }


    public long getLuggageId() {
        return id;
    }

    public String getLuggageOwner() {
        return luggageOwner;
    }

    public float getWeight() {
        return weight;

    }

    public String getLuggageType() {
        return luggageType;
    }



    public void setLuggageId(long luggageId) {
        this.id = luggageId;
    }

    public void setLuggageOwner(String luggageOwner) {
        this.luggageOwner = luggageOwner;
    }
    public void setWeight(float weight) {
        this.weight = weight;
        isOverWeight(weight);
    }

    public void setLuggageType(String luggageType) {
        this.luggageType = luggageType;
    }

    public boolean isOverWeight(float weight) {
        if (weight > weightLimit) {
            this.isOverWeight = true;
        } else {
            this.isOverWeight = false;
        }
        return isOverWeight;
    }



    public static class Builder{
        private long id;
        private String luggageOwner;
        private float weight;

        private String luggageType;

        private boolean isOverWeight;


        public Builder setLuggageId(long id) {
            this.id = id;
            return this;
        }

        public Builder setLuggageOwner(String luggageOwner) {
            this.luggageOwner = luggageOwner;
            return this;
        }

        public Builder setWeight(float weight) {
            this.weight = weight;
            isOverWeight(weight);
            return this;
        }

        public Builder setLuggageType(String luggageType) {
            this.luggageType = luggageType;
            return this;
        }

        public Builder isOverWeight(float weight) {
            float weightLimit = 20;
            if (weight > weightLimit){
                this.isOverWeight = true;
        }else{ this.isOverWeight=false;}
            return this;
        }
        public Builder copy(Luggage luggage){
            this.id=luggage.id;
            this.luggageOwner=luggage.luggageOwner;
            this.weight=luggage.weight;
            this.luggageType=luggage.luggageType;
            this.isOverWeight=luggage.isOverWeight;
            return this;
        }

        public Luggage build(){
            return new Luggage(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Luggage luggage = (Luggage) o;
        return id == luggage.id && Float.compare(luggage.weight, weight) == 0 && isOverWeight == luggage.isOverWeight && Objects.equals(luggageOwner, luggage.luggageOwner) && Objects.equals(luggageType, luggage.luggageType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, luggageOwner, weight, luggageType, weightLimit, isOverWeight);
    }

    @Override
    public String toString() {
        return "Luggage{" +
                "luggageId='" + id + '\'' +
                ", luggageOwner='" + luggageOwner + '\'' +
                ", weight=" + weight +
                ", luggageType=" + luggageType +
                ", isOverWeight=" + isOverWeight +
                '}';
    }
}
