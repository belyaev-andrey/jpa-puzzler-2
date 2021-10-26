package com.jokerconf.jpapuzzlers.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "collar")
@Entity
@Getter
@Setter
public class Collar {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "description")
    private String description;

    @JoinColumn(name = "pet_id")
    @OneToOne
    private Pet pet;

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "description = " + description + ")";
    }
}