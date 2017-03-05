package com.hnmoura.studies.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by hivisonmoura on 2017-03-02.
 */

@Entity
public class Guest implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name="increment", strategy = "increment")
    private Long id;

    private String name;

    private Integer quantityOfCompanions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantityOfCompanions() {
        return quantityOfCompanions;
    }

    public void setQuantityOfCompanions(Integer quantityOfCompanions) {
        this.quantityOfCompanions = quantityOfCompanions;
    }
}
