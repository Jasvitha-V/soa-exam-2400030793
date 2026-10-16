package com.klef.soa.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.soa.exam.entity.Bus;
import com.klef.soa.exam.service.BusService;

@RestController
public class BusController {

    @Autowired
    private BusService busService;

    @GetMapping("/")
    public String home() {
        return "CRUD Service Project is Running....";
    }

    @PostMapping("/Add")
    public Bus addBus(@RequestBody Bus bus) {
        return busService.addBus(bus);
    }

    @GetMapping("/DisplayAll")
    public List<Bus> displayAllBuses() {
        return busService.getAllBuses();
    }

    @DeleteMapping("/Delete/{id}")
    public String deleteBus(@PathVariable Long id) {
        busService.deleteBus(id);
        return "Bus deleted successfully";
    }
}