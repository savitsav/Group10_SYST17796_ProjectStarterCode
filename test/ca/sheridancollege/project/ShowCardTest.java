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
public class ShowCardTest {
    
    public ShowCardTest() {
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
//    public void testGetSize() {
//        System.out.println("getSize");
//        ShowCard instance = new ShowCard();
//        int expResult = 0;
//        int result = instance.getSize();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testClear() {
//        System.out.println("clear");
//        ShowCard instance = new ShowCard();
//        instance.clear();
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testAddCard() {
//        System.out.println("addCard");
//        Card c = null;
//        ShowCard instance = new ShowCard();
//        instance.addCard(c);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testAddCards() {
//        System.out.println("addCards");
//        ShowCard p = null;
//        ShowCard instance = new ShowCard();
//        instance.addCards(p);
//        fail("The test case is a prototype.");
//    }

    @Test
    public void testNextCard() {
        System.out.println("nextCard");
        ShowCard instance = new ShowCard();
        Card expResult = null;
        Card result = instance.nextCard();
        assertEquals(expResult, result);
    }
    
        @Test
        public void testGoodNextCard() {
            try
            {
        System.out.println("nextCard");
        ShowCard instance = new ShowCard();
        Card expResult = new Card(27,25);
        Card result = instance.nextCard();
        assertEquals(expResult, result);
            }
             catch(IndexOutOfBoundsException e)
        {
            
        }
            }

        @Test
        public void testBoundaryNextCard()
        {
            try
            {
        System.out.println("nextCard");
        ShowCard instance = new ShowCard();
        Card expResult =new Card(24,28);
        Card result = instance.nextCard();
        assertEquals(expResult, result);
            }
              catch(IndexOutOfBoundsException e)
        {
            
        }
    }

    
}
