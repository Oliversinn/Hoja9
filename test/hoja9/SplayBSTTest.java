/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja9;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Oliversinn
 */
public class SplayBSTTest {
    
    public SplayBSTTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of contains method, of class SplayBST.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Comparable key = null;
        SplayBST instance = new SplayBST();
        boolean expResult = false;
        boolean result = instance.contains(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class SplayBST.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Comparable key = null;
        SplayBST instance = new SplayBST();
        Object expResult = null;
        Object result = instance.get(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of put method, of class SplayBST.
     */
    @Test
    public void testPut() {
        System.out.println("put");
        Comparable key = null;
        Object value = null;
        SplayBST instance = new SplayBST();
        instance.put(key, value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class SplayBST.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Comparable key = null;
        SplayBST instance = new SplayBST();
        instance.remove(key);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of height method, of class SplayBST.
     */
    @Test
    public void testHeight() {
        System.out.println("height");
        SplayBST instance = new SplayBST();
        int expResult = 0;
        int result = instance.height();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class SplayBST.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        SplayBST instance = new SplayBST();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
