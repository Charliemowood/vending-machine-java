package com.codeclan.example.vendingmachine;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by home on 6/6/17.
 */
public class ItemTest {

    Item item;

    @Before
    public void before(){
        item = new Item();
    }

    @Test
    public void canGetPrice() {
        assertEquals(50,item.getPrice());
    }

}