package com.springboot.springbootapp.dao;

import com.springboot.springbootapp.model.Medicine;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PharmacyDAO extends CrudRepository<Medicine, Integer>{

    @Override
    List<Medicine> findAll();

}
