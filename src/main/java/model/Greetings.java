package model;

import javax.persistence.Entity;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Greetings extends PanacheEntity {

    public String message;

    public Greetings() {
    }

    public Greetings(String message) {
        this.message = message;
    }
}
