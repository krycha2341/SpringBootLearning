package com.springboot.springbootapp.service;

import com.springboot.springbootapp.dao.PharmacyDAO;
import com.springboot.springbootapp.model.Medicine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class PharmacyService {

    @Autowired
    private PharmacyDAO pharmacyDAO;


    public Medicine addDrug(Medicine medicine){

        return pharmacyDAO.save(medicine);
    }

    public List<Medicine> getMedicineList(){
        //return medicineList;
        return pharmacyDAO.findAll();
    }

    public Medicine getDrugById(int medicineId){

        return pharmacyDAO.findById(medicineId).get();
    }

    public Medicine updateMedicineNumber(int medicineId, Medicine medicine){

        medicine.setMedicineId(medicineId);
        return pharmacyDAO.save(medicine);

    }


    public void deleteMedicine(int medicineId){
        pharmacyDAO.deleteById(medicineId);

    }

}
