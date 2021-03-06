package com.example.prjmanufacturerservice.repository;

import com.example.prjmanufacturerservice.entity.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManufacturerRepository extends JpaRepository<Manufacturer, Integer> {
}
