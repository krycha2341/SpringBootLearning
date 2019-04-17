package com.springboot.springbootapp.api;


import com.springboot.springbootapp.model.Medicine;
import com.springboot.springbootapp.service.PharmacyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
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
    public List<Medicine> getMedicineList(){
        return pharmacyService.getMedicineList();
    }

    @GetMapping(value="/{drugName}")
    public Medicine getDrugByName(@PathVariable("drugName") String drugName){
        return pharmacyService.getDrugByName(drugName);
    }

    @GetMapping(value="/id/{medicineId}")
    public Medicine getDrugById(@PathVariable("medicineId") int medicineId){
        return pharmacyService.getDrugById(medicineId);
    }

    @PutMapping(value = "/{medicineId}")
    public Medicine updateMedicineNumber(@PathVariable("medicineId") int medicineId, @RequestBody Medicine medicine){
        return pharmacyService.updateMedicineNumber(medicineId,medicine);
    }
//idk how to update by name :( keep searching for solution

/*    @PutMapping(value = "/update/{drugName}")
    public Medicine updateMedicineByName(@PathVariable("drugName") String drugName,@RequestBody Medicine medicine){
        return pharmacyService.updateMedicineByName(drugName,medicine);
    }*/

    @DeleteMapping(value = "/{medicineId}")
    public void deleteMedicine(@PathVariable("medicineId") int medicineId){
        pharmacyService.deleteMedicine(medicineId);
    }

}
