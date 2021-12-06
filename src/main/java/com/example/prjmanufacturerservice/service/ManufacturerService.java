package com.example.prjmanufacturerservice.service;

import com.example.prjmanufacturerservice.entity.Manufacturer;
import com.example.prjmanufacturerservice.repository.ManufacturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManufacturerService {
    @Autowired
    private ManufacturerRepository repository;

    @CachePut(value = "manufacturers", key = "#m.id")
    public Manufacturer saveManufacturer(Manufacturer m){
        return repository.save(m);
    }

    @Cacheable(value = "manufacturers", key = "#id")
    public Manufacturer findManufacturerById(int id){
        return repository.findById(id).get();
    }

    public List<Manufacturer> getAll(){
        return repository.findAll();
    }

    @CacheEvict(value = "manufacturers", key = "#id")
    public void deleteManufacturer(int id){
        repository.deleteById(id);
    }

    @CachePut(value = "manufacturers",key = "#id")
    public Manufacturer updateManufacturer(int id, Manufacturer m){
        m.setId(id);
        repository.save(m);
        return m;
    }
}

