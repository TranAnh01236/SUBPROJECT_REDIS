package com.example.prjmanufacturerservice.controller;

import com.example.prjmanufacturerservice.entity.Manufacturer;
import com.example.prjmanufacturerservice.service.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/manufacturers")
public class ManufacturerController {
    @Autowired
    private ManufacturerService service;

    @PostMapping("/")
    public Manufacturer saveManufacturer(@RequestBody Manufacturer m){
        return service.saveManufacturer(m);
    }

    @GetMapping("/")
    public List<Manufacturer> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Manufacturer findManufacturerById(@PathVariable("id") int id){
        return service.findManufacturerById(id);
    }

    @PutMapping("/{id}")
    public Manufacturer updateManufacturer(@PathVariable("id") int id ,@RequestBody Manufacturer m){
        return service.updateManufacturer(id,m);
    }

    @DeleteMapping("/{id}")
    public int deleteManufacturer(@PathVariable("id") int id){
        service.deleteManufacturer(id);
        return id;
    }
}
