package com.dgmf.beans.impl;

import com.dgmf.beans.Animal;
import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Whooowww ...");
    }
}
