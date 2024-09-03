package com.example.jpaobligatorisk.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Unicode {
    @Id
    int i;
    char c = (char) i;
    String description;

    public Unicode() {
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
