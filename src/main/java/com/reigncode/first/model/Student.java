package com.reigncode.first.model;

import javax.annotation.Generated;
import javax.persistence.*;

/**
 * Created by johndoe on 28.02.2015.
 */
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nume;
    private String prenume;
    private int anNastere;

    public Long getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getAnNastere() {
        return anNastere;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setAnNastere(int anNastere) {
        this.anNastere = anNastere;
    }

}
