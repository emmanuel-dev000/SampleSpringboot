package com.pangan.project.donut;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/*
* DONUT HTTP:
*
* GET - /donut - getAllDonuts
* GET - /donut/{id} - getDonutById
* POST - /donut - addNewDonut
* PUT - /donut/{id} - updateDonutById
* DELETE - /donut/{id} - deleteDonutById
*
* */
@RestController
public class DonutController {
    @Autowired
    private DonutService _donutService;

    @GetMapping("/donut")
    public List<Donut> getAllDonut() {
        return _donutService.getAllDonuts();
    }

    @GetMapping("/donut/{donutId}")
    public Donut getDonut(@PathVariable String donutId) {
        return _donutService.getDonutById(donutId);
    }

    @PostMapping("/donut")
    public Donut addNewDonut(@RequestBody Donut newDonut) {
        return _donutService.addNewDonut(newDonut);
    }

    @PutMapping("/donut/{donutId}")
    public Donut updateDonutById(@RequestBody Donut updatedDonut, @PathVariable String donutId) {
        return _donutService.updateDonutById(updatedDonut, donutId);
    }

    @DeleteMapping("/donut/{donutId}")
    public String deleteDonutById(@PathVariable String donutId) {
        return _donutService.deleteDonutById(donutId);
    }
}
