package com.example.jpaobligatorisk.config;

import com.example.jpaobligatorisk.models.Unicode;
import com.example.jpaobligatorisk.repositories.UnicodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class InitData implements CommandLineRunner {
    @Autowired
    UnicodeRepository unicodeRepository;

    Unicode unicode;


    @Override
    public void run(String... args) throws Exception {
        Unicode unco = new Unicode();

        unco.setI(97);
        unco.setDescription("a");
        unco.setC('a');
        unicodeRepository.save(unco);
        unco.setI(98);
        unco.setDescription("b");
        unco.setC('b');
        unicodeRepository.save(unco);

        ;

    }


}



