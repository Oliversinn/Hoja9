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
public class RedBlackBSTTest {
    
    public RedBlackBSTTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of size method, of class RedBlackBST.
     */
    @Test
    public void testSize_0args() {
        System.out.println("size");
        RedBlackBST instance = new RedBlackBST();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class RedBlackBST.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        RedBlackBST instance = new RedBlackBST();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class RedBlackBST.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Comparable key = null;
        RedBlackBST instance = new RedBlackBST();
        Object expResult = null;
        Object result = instance.get(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class RedBlackBST.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Comparable key = null;
        RedBlackBST instance = new RedBlackBST();
        boolean expResult = false;
        boolean result = instance.contains(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of put method, of class RedBlackBST.
     */
    @Test
    public void testPut() {
        System.out.println("put");
        Comparable key = null;
        Object val = null;
        RedBlackBST instance = new RedBlackBST();
        instance.put(key, val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteMin method, of class RedBlackBST.
     */
    @Test
    public void testDeleteMin() {
        System.out.println("deleteMin");
        RedBlackBST instance = new RedBlackBST();
        instance.deleteMin();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteMax method, of class RedBlackBST.
     */
    @Test
    public void testDeleteMax() {
        System.out.println("deleteMax");
        RedBlackBST instance = new RedBlackBST();
        instance.deleteMax();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class RedBlackBST.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Comparable key = null;
        RedBlackBST instance = new RedBlackBST();
        instance.delete(key);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of height method, of class RedBlackBST.
     */
    @Test
    public void testHeight() {
        System.out.println("height");
        RedBlackBST instance = new RedBlackBST();
        int expResult = 0;
        int result = instance.height();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of min method, of class RedBlackBST.
     */
    @Test
    public void testMin() {
        System.out.println("min");
        RedBlackBST instance = new RedBlackBST();
        Object expResult = null;
        Object result = instance.min();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of max method, of class RedBlackBST.
     */
    @Test
    public void testMax() {
        System.out.println("max");
        RedBlackBST instance = new RedBlackBST();
        Object expResult = null;
        Object result = instance.max();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of floor method, of class RedBlackBST.
     */
    @Test
    public void testFloor() {
        System.out.println("floor");
        Comparable key = null;
        RedBlackBST instance = new RedBlackBST();
        Object expResult = null;
        Object result = instance.floor(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ceiling method, of class RedBlackBST.
     */
    @Test
    public void testCeiling() {
        System.out.println("ceiling");
        Comparable key = null;
        RedBlackBST instance = new RedBlackBST();
        Object expResult = null;
        Object result = instance.ceiling(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of select method, of class RedBlackBST.
     */
    @Test
    public void testSelect() {
        System.out.println("select");
        int k = 0;
        RedBlackBST instance = new RedBlackBST();
        Object expResult = null;
        Object result = instance.select(k);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rank method, of class RedBlackBST.
     */
    @Test
    public void testRank() {
        System.out.println("rank");
        Comparable key = null;
        RedBlackBST instance = new RedBlackBST();
        int expResult = 0;
        int result = instance.rank(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class RedBlackBST.
     */
    @Test
    public void testSize_GenericType_GenericType() {
        System.out.println("size");
        Comparable lo = null;
        Comparable hi = null;
        RedBlackBST instance = new RedBlackBST();
        int expResult = 0;
        int result = instance.size(lo, hi);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
