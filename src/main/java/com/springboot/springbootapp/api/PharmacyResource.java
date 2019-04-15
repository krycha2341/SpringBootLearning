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
}
