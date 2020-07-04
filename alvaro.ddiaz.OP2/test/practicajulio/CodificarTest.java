/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicajulio;

import alvaro.ddiaz.OP2.Codificar;
import java.util.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CodificarTest {
    
    public CodificarTest() {
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
     * Test of SWP method, of class Codificar.
     */
    @Test
    public void testSWP() {
        Codificar nombre = new Codificar();
        assertEquals("ebcda", nombre.SWP("abcde", 4, 0));
    }

    /**
     * Test of SWL method, of class Codificar.
     */
    @Test
    public void testSWL() {
        Codificar nombre = new Codificar();
        assertEquals("edcba", nombre.SWL("ebcda", 'd', 'b'));
    }

    /**
     * Test of ROR method, of class Codificar.
     */
    @Test
    public void testROR() {
        Codificar nombre = new Codificar();
        assertEquals("eacbd", nombre.ROR("bdeac", 3));
    }

    /**
     * Test of ROL method, of class Codificar.
     */
    @Test
    public void testROL() {
        Codificar nombre = new Codificar();
        assertEquals("bcdea", nombre.ROL("abcde", 1));
    }

    /**SS
     * Test of REP method, of class Codificar.
     */
    @Test
    public void testREP() {
        Codificar nombre = new Codificar();
        assertEquals("abcde", nombre.REP("edcba", 0, 4));
    }

    /**
     * Test of MOP method, of class Codificar.
     */
    @Test
    public void testMOP() {
     Codificar nombre = new Codificar();
        assertEquals("bdeac", nombre.MOP("bcdea", 1, 4));
    }
}
