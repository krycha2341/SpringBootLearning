package com.springboot.springbootapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Medicine {

    @JsonProperty("id")
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
}
