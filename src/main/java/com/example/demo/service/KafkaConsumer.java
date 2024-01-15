package com.example.demo.service;

import com.example.demo.entity.Taxe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class KafkaConsumer {
    @Autowired
    RedevableService redevableService;

    private final List<Taxe> taxeList = new ArrayList<>();

    @KafkaListener(topics = "topic2", groupId = "kf-group-1")
    public void consumeTaxe(Taxe taxe) {

        taxe.setRedevable(redevableService.findByCin(taxe.getRedevable().getCin()));
        System.out.println("Received Taxe from Kafka: " + taxe.getRedevable().getCin());
        taxeList.add(taxe);

    }

    public List<Taxe> queu(){
        return taxeList;
    }

}
