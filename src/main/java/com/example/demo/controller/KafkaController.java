package com.example.demo.controller;

import com.example.demo.entity.Taxe;
import com.example.demo.service.KafkaConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/kafka")
public class KafkaController {

    @Autowired
    KafkaConsumer kafkaConsumer;

    @GetMapping("/taxes")
    public List<Taxe> qeue(){

        return kafkaConsumer.queu();
    }

    @DeleteMapping("/delete")
    public void deleteTaxe(@RequestBody Taxe taxe){

        kafkaConsumer.queu().remove(taxe);
    }


}
