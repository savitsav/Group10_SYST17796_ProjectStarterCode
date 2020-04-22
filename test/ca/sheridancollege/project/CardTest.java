/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class CardTest {
    
    public CardTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
//
//    @Test
//    public void testGetRank() {
//        System.out.println("getRank");
//        Card instance = null;
//        int expResult = 0;
//        int result = instance.getRank();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testGetSuit() {
//        System.out.println("getSuit");
//        Card instance = null;
//        int expResult = 0;
//        int result = instance.getSuit();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testCompareTo() {
//        System.out.println("compareTo");
//        Object ob = null;
//        Card instance = null;
//        int expResult = 0;
//        int result = instance.compareTo(ob);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testHashCode() {
//        System.out.println("hashCode");
//        Card instance = null;
//        int expResult = 0;
//        int result = instance.hashCode();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }

    @Test
    public void testEquals() {
        System.out.println("equals");
        Object ob = new Object();
        Card instance = new Card(23,87);
        boolean expResult = false;
        boolean result = instance.equals(ob);
        assertEquals(expResult, result);
    }

        @Test
    public void testGoodEquals() {
        System.out.println("equals");
        Object ob = new Card(25,27);
        Card instance = new Card(25,27);
        boolean expResult = true;
        boolean result = instance.equals(ob);
        assertEquals(expResult, result);
    }
        @Test
    public void testBoundaryEquals() {
        System.out.println("equals");
        Object ob = new Card(26,26);
        Card instance = new Card(26,26);
        boolean expResult = true;
        boolean result = instance.equals(ob);
        assertEquals(expResult, result);
    }
//    @Test
//    public void testToString() {
//        System.out.println("toString");
//        Card instance = null;
//        String expResult = "";
//        String result = instance.toString();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
    
}
