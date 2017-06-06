package com.codeclan.example.vendingmachine;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by home on 6/6/17.
 */
public class MachineTest {

   Machine machine;

    @Before
    public void before(){
        machine = new Machine();
    }

    @Test
    public void canGetBalance_initialZero(){
        assertEquals(0,machine.getBalance());
    }

    @Test
    public void canAddBalance() {
        machine.addCoins(25);
        assertEquals(25,machine.getBalance());
    }




}