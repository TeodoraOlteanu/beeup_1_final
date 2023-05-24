package org.acme.getting.started.model;


import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Greeting")
public class Greeting extends PanacheEntity {
    @Column(name = "message")
    public String message;

    public Greeting() {
    }

    public Greeting(String message) {
        this.message = message;
    }
}