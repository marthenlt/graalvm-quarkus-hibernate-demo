package org.acme.hibernate.orm.panache;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Cacheable
public class Fruit extends PanacheEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public Long id;

    @Column(length = 40, unique = true)
    public String name;

    @Column(length = 20, unique = true)
    public String country;

    public Fruit(String name, String country) {
        System.out.println("Fruit(String name, String country) constructor is called..");
        this.name = name;
        this.country = country;
    }

    public Fruit() {
        System.out.println("Fruit() constructor is called..");
    }

}
