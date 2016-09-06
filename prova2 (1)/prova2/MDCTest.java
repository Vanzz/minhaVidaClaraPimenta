

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MDCTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MDCTest
{
    /**
     * Default constructor for test class MDCTest
     */
    public MDCTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    @Test
    public void proximoPrimoTest(){
        assertEquals(new Integer(2), MDC.primoProximo(1));
        assertEquals(new Integer(13), MDC.primoProximo(12));
        assertEquals(new Integer(17), MDC.primoProximo(13));
        assertEquals(new Integer(17), MDC.primoProximo(14));
        assertEquals(new Integer(17), MDC.primoProximo(15));
        assertEquals(new Integer(5501), MDC.primoProximo(5490));
    }

    @Test
    public void decomporPrimosTest(){
        Integer[] decomp1 = { 7, 11, 101 };
        assertArrayEquals(decomp1, MDC.decomporPrimos(7777).toArray());

        Integer[] decomp2 = { 7 };
        assertArrayEquals(decomp2, MDC.decomporPrimos(7).toArray());

        Integer[] decomp3 = { 2, 2, 2 };
        assertArrayEquals(decomp3, MDC.decomporPrimos(8).toArray());

        Integer[] decomp4 = { 2, 2, 2, 5 };
        assertArrayEquals(decomp4, MDC.decomporPrimos(40).toArray());
    }

    @Test
    public void calcularMDCTest(){
        assertEquals(new Integer(2), MDC.calcularMDC(2, 2));
        assertEquals(new Integer(16), MDC.calcularMDC(16, 16));

        assertEquals(new Integer(18), MDC.calcularMDC(90, 36));
        assertEquals(new Integer(18), MDC.calcularMDC(36, 90));

        assertEquals(new Integer(35), MDC.calcularMDC(245, 875));
        assertEquals(new Integer(35), MDC.calcularMDC(875, 245));

        assertEquals(new Integer(1), MDC.calcularMDC(8573, 7777));
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
