/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automat;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Squid
 */
public class BilletautomatTest {
    
    public BilletautomatTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() 
    {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getBilletpris method, of class Billetautomat.
     */
    @Test
    public void testGetBilletpris() {
        System.out.println("getBilletpris");
        Billetautomat instance = new Billetautomat();
        instance.setBørneBilletpris(0);
        int expResult = 10;
        int result = instance.getBBilletpris();
        assertEquals(expResult, result);
    }

    /**
     * Test of getBalance og indsætPenge method, of class Billetautomat.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        Billetautomat instance = new Billetautomat();
        instance.indsætPenge(20);       // Sætter penge ind og giver et forventet resultat
        instance.indsætPenge(35);
        int expResult = 20+35;
        int result = instance.getBalance();
        assertEquals(expResult, result);
    }


    /**
     * Test of returpenge method, of class Billetautomat.
     */
    @Test
    public void testReturpenge() {
        System.out.println("returpenge");
        Billetautomat instance = new Billetautomat();
        instance.indsætPenge(20);
        int expResult = 20;
        int result = instance.returpenge();
        assertEquals(expResult, result);
    }

    /**
     * Test of montørLogin method, of class Billetautomat.
     */
    @Test
    public void testMontørLogin() {
        String adgangskode = "1234";
        Billetautomat instance = new Billetautomat();
        instance.montørLogin(adgangskode);
        assertEquals(instance.erMontør(), true);
    }

    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        Billetautomat instance = new Billetautomat();
        instance.erMontør();
        instance.setAntalBørneBilletterSolgt(2);
        instance.setAntalVoksenBilletterSolgt(3);
        int expResult = 2*10+3*20;
        int result = instance.getTotal();
        assertEquals(expResult, result);
    }



    /**
     * Test of setBilletpris method, of class Billetautomat.
     */
    @Test
    public void testSetBilletpris() {
        System.out.println("setBilletpris");
        int billetpris = 20;
        Billetautomat instance = new Billetautomat();
        instance.setBørneBilletpris(billetpris);
        assertEquals(20, instance.getBBilletpris());
    }

    /**
     * Test of nulstil method, of class Billetautomat.
     */
    @Test
    public void testNulstil() 
    {
        System.out.println("nulstil");
        Billetautomat instance = new Billetautomat();
        instance.nulstil();
        assertEquals(0, instance.antalBilletterSolgt);
    }
}
