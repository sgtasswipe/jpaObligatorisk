package com.example.jpaobligatorisk.repositories;

import com.example.jpaobligatorisk.models.Unicode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UnicodeRepository  extends JpaRepository<Unicode, Integer>{
    Character findByI(int i);
    Character findByC(char c);


}
