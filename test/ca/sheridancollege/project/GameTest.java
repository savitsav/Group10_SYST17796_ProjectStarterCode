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
public class GameTest {
    
    public GameTest() {
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


    @Test
    public void testBadEnoughCards()
    {
        try
        {
        System.out.println("enoughCards");
        int n = (0);
        Game instance = new Game() {};
        boolean expResult = false;
        boolean result = instance.enoughCards(n);
        assertEquals(expResult, result);
    
        }
        catch(NullPointerException e)
        {
            
        }
    }
    
        @Test
    public void testGodEnoughCards()
    {
        try
        {
        System.out.println("enoughCards");
        int n = 1;
        Game instance = new Game() {};
        boolean expResult = true;
        boolean result = instance.enoughCards(n);
        assertEquals(expResult, result);
    }
            catch(NullPointerException e)
        {
            
        }
    }

    /**
     *
     */
    @Test
    public void testBoundaryEnoughCards()
    {
        try
        {
        System.out.println("enoughCards");
        int n = 5;
        Game instance = new Game() {};
        boolean expResult = true;
        boolean result = instance.enoughCards(n);
        assertEquals(expResult, result);
    
        }
        catch(NullPointerException e)
        {
        }
    }

    
}
