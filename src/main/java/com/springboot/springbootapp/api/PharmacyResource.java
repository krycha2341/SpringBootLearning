package com.springboot.springbootapp.api;

import com.springboot.springbootapp.model.Medicine;
import com.springboot.springbootapp.service.PharmacyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/medicines")
public class PharmacyResource {

    @Autowired
    private PharmacyService pharmacyService;

    @PostMapping
    public Medicine addDrug(@RequestBody Medicine medicine){
        return pharmacyService.addDrug(medicine);
    }

    @GetMapping
    public Iterable<Medicine> getAllMedicine(){
        return pharmacyService.getAllMedicine();
    }


    @GetMapping(value="/id/{medicineId}")
    public Medicine getDrugById(@PathVariable("medicineId") int medicineId){
        return pharmacyService.getDrugById(medicineId);
    }

    @PutMapping(value = "/{medicineId}")
    public Medicine updateMedicineNumber(@PathVariable("medicineId") int medicineId, @RequestBody Medicine medicine){
        return pharmacyService.updateMedicineNumber(medicineId,medicine);
    }


    @DeleteMapping(value = "/{medicineId}")
    public void deleteMedicine(@PathVariable("medicineId") int medicineId){
        pharmacyService.deleteMedicine(medicineId);
    }

}
