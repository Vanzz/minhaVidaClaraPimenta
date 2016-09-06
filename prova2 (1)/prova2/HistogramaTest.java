

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class HistogramaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class HistogramaTest
{
    /**
     * Default constructor for test class HistogramaTest
     */
    public HistogramaTest()
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
    public void histogramaTest() {
        // Este teste sempre valida, está aqui apenas para rodar o script e analisar a saída do console.
        String c1 = "Vê se tira notas boas!";
        Histograma hist1 = new Histograma(c1);
        System.out.println(c1 + "\n" + hist1.toString());
        
        String c2 = "A melhor senha a se utilizar é aquela aleatória: 'e5Z97CboJtTPnP2M'";
        Histograma hist2 = new Histograma(c2);
        System.out.println(c2 + "\n" + hist2.toString());
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
