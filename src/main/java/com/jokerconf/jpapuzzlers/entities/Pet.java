package com.jokerconf.jpapuzzlers.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "pet")
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Pet {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    private Owner owner;

    @OneToOne(mappedBy = "pet", fetch = FetchType.LAZY)
    private Collar collar;

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "name = " + name + ")";
    }
}