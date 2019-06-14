package com.springboot.springbootapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
public class Medicine {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("id")
    @Column(name="id")
    private int medicineId;
    @JsonProperty("drugName")
    private String drugName;
    @JsonProperty("inMagazine")
    private int numberOfDrugs;

    public int getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(int medicineId) {
        this.medicineId = medicineId;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public int getNumberOfDrugs() {
        return numberOfDrugs;
    }

    public void setNumberOfDrugs(int numberOfDrugs) {
        this.numberOfDrugs = numberOfDrugs;
    }

    public String toString(){
        return medicineId + "|" + drugName + "|" + numberOfDrugs;
    }
}
