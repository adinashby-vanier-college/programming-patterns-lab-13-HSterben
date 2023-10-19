package com.prog2.labs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * DO NOT MODIFY ANYTHING IN THIS FILE.
 */
class LabThirteenTests {

    @Test
    void factoryTest1() {
    	PersonFactory factory = new PersonFactory();
    	Person one = factory.createPerson("one");
    	Person two = factory.createPerson("two");
    	
        assertEquals(0, one.id);
        assertEquals("one", one.name);
        assertEquals(1, two.id);
        assertEquals("two", two.name);
    }
	
}	