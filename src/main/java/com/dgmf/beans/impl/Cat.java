package com.dgmf.beans.impl;

import com.dgmf.beans.Animal;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class    Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meeehooowww ...");
    }
}
