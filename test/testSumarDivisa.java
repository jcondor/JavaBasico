/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import Clase06.Pruebas.Divisa;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PFR
 */
public class testSumarDivisa {
    
    public testSumarDivisa() {
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
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testSumar() throws Exception {
        System.out.println("Test Sumar Divisa");
        Divisa d = new Divisa(10, "Soles");
        Divisa instance = new Divisa(20, "Soles");
        Divisa expResult = new Divisa(30, "Soles");
        Divisa result = instance.sumar(d);
        assertEquals(expResult.getImporte(), result.getImporte());
    }

}