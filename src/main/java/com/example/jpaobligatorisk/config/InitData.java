package com.example.jpaobligatorisk.config;

import com.example.jpaobligatorisk.models.Unicode;
import com.example.jpaobligatorisk.repositories.UnicodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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

        loopchars();

    }
    public void loopchars() {
        Set<Character> set = new HashSet<>();
        List<Unicode> unicodeList = new ArrayList<>();
        int batchSize = 1000;

        for (int i = 0; i < 65536; i++) {
            char c = (char) i; //

            Unicode unicode = new Unicode();
            unicode.setI(i);
            unicode.setC(c);


            String description = Character.getName(i);
            if (description == null) {
                description = "No Unicode name available";
            }
            unicode.setDescription(description);

            set.add(c);
            unicodeList.add(unicode);

            if (unicodeList.size() == batchSize) {
                unicodeRepository.saveAll(unicodeList);
                unicodeList.clear();
            }
        }
            if(!unicodeList.isEmpty()) {
                unicodeRepository.saveAll(unicodeList);
            }



        System.out.println(set);
    }



}



