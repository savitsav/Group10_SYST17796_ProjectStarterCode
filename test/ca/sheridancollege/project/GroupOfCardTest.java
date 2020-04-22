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
public class GroupOfCardTest {
    
    public GroupOfCardTest() {
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
//    public void testShuffle() {
//        System.out.println("shuffle");
//        GroupOfCard instance = new GroupOfCard();
//        instance.shuffle();
//        fail("The test case is a prototype.");
//    }

    @Test
    public void testDeal() {
//        try
//        {
//        System.out.println("deal");
//        GroupOfCard instance = new GroupOfCard();
//        Card expResult = new Card(0,0);
//        Card result = instance.deal();
//        assertEquals(expResult, result);
//        }
//         catch(IndexOutOfBoundsException e)
//        {
//            
//        }
        
        
        try
        {
        System.out.println("deal");
        GroupOfCard instance = new GroupOfCard();
        Card expResult = new Card(22,22);
        Card result = instance.deal();
        assertEquals(expResult, result);
        }
        catch(IndexOutOfBoundsException e)
        {
            
        }
        }
    
    
    @Test
    public void testGoodDeal()
    {
        try
        {
        System.out.println("deal");
        GroupOfCard instance = new GroupOfCard();
        Card expResult = new Card(26,25);
        Card result = instance.deal();
        assertEquals(expResult, result);
        }
        catch(IndexOutOfBoundsException e)
        {
            
        }
            
    }
    
    @Test
    public void testBoundaryDeal()
    {
        try
        {
        System.out.println("deal");
        GroupOfCard instance = new GroupOfCard();
        Card expResult = new Card(26,26);
        Card result = instance.deal();
        assertEquals(expResult, result);
        }
        catch(IndexOutOfBoundsException e)
        {
            
        }    
    }

//    @Test
//    public void testGetSize() {
//        System.out.println("getSize");
//        GroupOfCard instance = new GroupOfCard();
//        int expResult = 0;
//        int result = instance.getSize();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
    
}
