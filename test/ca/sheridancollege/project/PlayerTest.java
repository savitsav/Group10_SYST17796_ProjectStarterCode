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
public class PlayerTest {
    
    public PlayerTest() {
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
//    public void testPlayCard() {
//        System.out.println("playCard");
//        Player instance = null;
//        Card expResult = null;
//        Card result = instance.playCard();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }

    @Test
    public void testGetName() {
        System.out.println("getName");
        Player instance;
        instance = new Player("");
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
    }
    
        @Test
    public void testGetgoodName() {
        System.out.println("getName");
        Player instance;
        instance = new Player("savita");
        String expResult = "savita";
        String result = instance.getName();
        assertEquals(expResult, result);
    }
    
            @Test
    public void testGetboundaryName() {
        System.out.println("getName");
        Player instance;
        instance = new Player("navita");
        String expResult = "navita";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

//    @Test
//    public void testHasCard() {
//        System.out.println("hasCard");
//        Card c = null;
//        Player instance = null;
//        instance.hasCard(c);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testHasCards() {
//        System.out.println("hasCards");
//        ShowCard p = null;
//        Player instance = null;
//        instance.hasCards(p);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testUseWonCard() {
//        System.out.println("useWonCard");
//        Player instance = null;
//        instance.useWonCard();
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testNumberOFCards() {
//        System.out.println("NumberOFCards");
//        Player instance = null;
//        int expResult = 0;
//        int result = instance.NumberOFCards();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
    
}
