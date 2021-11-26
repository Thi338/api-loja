package com.api.api_loja.entities;

import javax.persistence.*;

@Entity
@Table(name = "tb_services")
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String os_number;
    private String name;
    private double value;
    private String description;

    public Service () {

    }

    public Service(Long id, String os_number, String name, double value, String description) {
        super();
        this.id = id;
        this.os_number = os_number;
        this.name = name;
        this.value = value;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOs_number() {
        return os_number;
    }

    public void setOs_number(String os_number) {
        this.os_number = os_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
