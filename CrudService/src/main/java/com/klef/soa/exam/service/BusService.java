package com.klef.soa.exam.service;

import java.util.List;
import com.klef.soa.exam.entity.Bus;

public interface BusService {

    Bus addBus(Bus bus);

    List<Bus> getAllBuses();

    void deleteBus(Long id);
}
