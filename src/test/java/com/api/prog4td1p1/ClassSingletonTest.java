package com.api.prog4td1p1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassSingletonTest {
    @Test
    public void create_a_single_instance(){
        ClassSingleton classSingleton1 = ClassSingleton.getInstance();
        ClassSingleton classSingleton2 = ClassSingleton.getInstance();

        classSingleton2.setDescription("I'm the first change");
        classSingleton1.setDescription("I'm the last change");

        assertEquals("I'm the last change", classSingleton2.getDescription());
        assertEquals("I'm the last change", classSingleton1.getDescription());
    }
}
