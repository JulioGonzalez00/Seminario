/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package apoyo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author julio
 */
public class PrestamoTest {
    
    public PrestamoTest() {
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

    /**
     * Test of toString method, of class Prestamo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Prestamo instance = new Prestamo(80,12,0.1f);
        String expResult = "Monto: 80, Meses: 12, Intereses: 0.1.";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
