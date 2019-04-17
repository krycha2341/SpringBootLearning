package com.springboot.springbootapp.service;

import com.springboot.springbootapp.dao.PharmacyDAO;
import com.springboot.springbootapp.model.Medicine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class PharmacyService {

    @Autowired
    private PharmacyDAO pharmacyDAO;

    private int medicineIdCount = 1;
    private List<Medicine>  medicineList =new CopyOnWriteArrayList<>();

    public Medicine addDrug(Medicine medicine){
        /*medicine.setMedicineId(medicineIdCount);
        medicineList.add(medicine);
        medicineIdCount++;
        return medicine;*/
        return pharmacyDAO.save(medicine);
    }

    public List<Medicine> getMedicineList(){
        //return medicineList;
        return pharmacyDAO.findAll();
    }

    public Medicine getDrugById(int medicineId){
        /*return medicineList
                .stream()
                .filter(c -> c.getMedicineId() == medicineId)
                .findFirst()
                .get();*/
        return pharmacyDAO.findById(medicineId).get();
    }

    public Medicine getDrugByName(String drugName){
        return medicineList
                .stream()
                .filter(c -> c.getDrugName().equals(drugName))
                .findFirst()
                .get();
    }

    public Medicine updateMedicineNumber(int medicineId, Medicine medicine){
        /*medicineList
                .stream()
                .forEach(c->{
                    if(c.getDrugName().equals(drugName))
                    {
                     c.setNumberOfDrugs(c.getNumberOfDrugs()+numberOfDrugAdded);
                    }
                });
        return medicineList.stream().filter(c->c.getDrugName().equals(drugName)).findFirst().get();*/

        medicine.setMedicineId(medicineId);
        return pharmacyDAO.save(medicine);

    }
//resource comm

/*    public Medicine updateMedicineByName(String drugName, Medicine medicine){

        return pharmacyDAO.save(medicine);
    }*/

    public void deleteMedicine(int medicineId){
        /*medicineList
                .stream()
                .forEach(c->{
                    if(c.getMedicineId()==medicineId)
                        medicineList.remove(c);
                });*/
        pharmacyDAO.deleteById(medicineId);

    }

}
