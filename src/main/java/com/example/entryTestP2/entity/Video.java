package com.example.entryTestP2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Video extends Thing {

    @Id
    private Long serialNumber;
    private String name;
    private String description;

    public Video() {
    }

    public Video(Long serialNumber, String name, String description) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.description = description;
    }

    public Long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getDescription() {
        return "Day la video" + this.description;
    }


}
