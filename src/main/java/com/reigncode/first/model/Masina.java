package com.reigncode.first.model;

import javax.persistence.*;

/**
 * Created by user on 02/03/15.
 */
@Entity
public class Masina {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int anProductie;
    private String modelMasina;
    @Enumerated(EnumType.STRING)
    public Culoare culoare;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAnProductie() {
        return anProductie;
    }

    public void setAnProductie(int anProductie) {
        this.anProductie = anProductie;
    }

    public String getModelMasina() {
        return modelMasina;
    }

    public void setModelMasina(String modelMasina) {
        this.modelMasina = modelMasina;
    }

    public Culoare getCuloare() {
        return culoare;
    }

    public void setCuloare(Culoare culoare) {
        this.culoare = culoare;
    }
}
