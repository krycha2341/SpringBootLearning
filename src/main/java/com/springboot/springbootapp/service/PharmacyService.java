package com.springboot.springbootapp.service;

import com.springboot.springbootapp.model.Medicine;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class PharmacyService {

    private int medicineIdCount = 1;
    private List<Medicine>  medicineList =new CopyOnWriteArrayList<>();

    public Medicine addDrug(Medicine medicine){
        medicine.setMedicineId(medicineIdCount);
        medicineList.add(medicine);
        medicineIdCount++;
        return medicine;
    }

    public List<Medicine> getMedicineList(){
        return medicineList;
    }

    public Medicine getDrugById(int medicineId){
        return medicineList
                .stream()
                .filter(c -> c.getMedicineId() == medicineId)
                .findFirst()
                .get();
    }

    public Medicine getDrugByName(String drugName){
        return medicineList
                .stream()
                .filter(c -> c.getDrugName() == drugName)
                .findFirst()
                .get();
    }

    public Medicine updateMedicineNumber(String drugName, int numberOfDrugAdded){
        medicineList
                .stream()
                .forEach(c->{
                    if(c.getDrugName()==drugName)
                    {
                     c.setNumberOfDrugs(c.getNumberOfDrugs()+numberOfDrugAdded);
                    }
                });
        return medicineList.stream().filter(c->c.getDrugName()==drugName).findFirst().get();
    }

    public void deleteMedicine(int medicineId){
        medicineList
                .stream()
                .forEach(c->{
                    if(c.getMedicineId()==medicineId)
                        medicineList.remove(c);
                });

    }

}
