/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package apoyo;

import java.util.Vector;
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
public class ClienteTest {

    public ClienteTest() {
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
     * Test of validarC method, of class Cliente.
     */
    @Test
    public void testValidarC() {
        System.out.println("validarC");
        Cliente instance = new Cliente("Prueba", "RFCPrueba", 00, "3471077597", "juliojesusglez@gmail.com");
        boolean expResult = true;
        boolean result = instance.validarC();
        assertEquals(expResult, result);
    }

    /**
     * Test of validarT method, of class Cliente.
     */
    @Test
    public void testValidarT() {
        System.out.println("validarT");
        Cliente instance = new Cliente("Prueba", "RFCPrueba", 00, "3471077597", "juliojesusglez@gmail.com");
        boolean expResult = true;
        boolean result = instance.validarT();
        assertEquals(expResult, result);

    }

    /**
     * Test of toString method, of class Cliente.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Cliente instance = new Cliente("Prueba", "RFCPrueba", 00, "3471077597", "juliojesusglez@gmail.com");
        String expResult = "Prueba";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of validarRFC method, of class Cliente.
     */
    @Test
    public void testValidarRFC() {
        System.out.println("validarRFC");
        Cliente instance = new Cliente("Prueba", "GASB0110226L8", 00, "3471077597", "juliojesusglez@gmail.com");
        boolean expResult = true;
        boolean result = instance.validarRFC();
        assertEquals(expResult, result);
    }

}
