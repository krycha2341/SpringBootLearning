package com.springboot.springbootapp.model;

public class Medicine {

    private int medicineId;
    private String drugName;
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
