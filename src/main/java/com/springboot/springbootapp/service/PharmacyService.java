package com.springboot.springbootapp.service;

import com.springboot.springbootapp.dao.PharmacyDAO;
import com.springboot.springbootapp.exception.MedicineNotFoundException;
import com.springboot.springbootapp.model.Medicine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;


@Component
public class PharmacyService {

    @Autowired
    private PharmacyDAO pharmacyDAO;


    public Medicine addDrug(Medicine medicine){

        return pharmacyDAO.save(medicine);
    }

    public Iterable<Medicine> getAllMedicine(){
        return pharmacyDAO.findAll();

    }

    public Medicine getDrugById(int medicineId){
        Optional<Medicine> optionalMedicine = pharmacyDAO.findById(medicineId);

        if(!optionalMedicine.isPresent()){
            throw new MedicineNotFoundException("Medicine not exist!");
        }

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
