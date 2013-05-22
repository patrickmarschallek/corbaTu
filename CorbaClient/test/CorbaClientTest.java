/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import Stock.StockQuote;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author patte
 */
public class CorbaClientTest {

    private static StockQuote expected;
    private final static String id = "0";
    private final static String name = "test0";
    private final static String price = "1.2";
    private static CorbaClient client;

    public CorbaClientTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        client = new CorbaClient();
    }

    @After
    public void tearDown() {
        client = null;
    }

    /**
     * Test of main method, of class CorbaClient.
     */
    @Test
    public void testMainA() {
        System.out.println("main a)");
        String[] args = {id, "a"};
        client.main(args);
        assertEquals(id, String.valueOf(CorbaClient.getStockQuote().id));
        assertEquals(name, CorbaClient.getStockQuote().name);
        assertEquals(price, String.valueOf(CorbaClient.getStockQuote().price));
    }

    /**
     * Test of main method, of class CorbaClient.
     */
    @Test
    public void testTaskA() {
        System.out.println("main b)");
        String[] args = {id, "b"};
        client.main(args);
        assertEquals(id, String.valueOf(CorbaClient.getStockQuote().id));
        assertEquals(name, CorbaClient.getStockQuote().name);
        assertEquals(price, String.valueOf(CorbaClient.getStockQuote().price));
    }

    /**
     * Test of main method, of class CorbaClient.
     */
    @Test
    public void testMainC() {
        System.out.println("main c)");
        String[] args = {id, "c"};
        client.main(args);
        assertEquals(id, String.valueOf(CorbaClient.getStockQuote().id));
        assertEquals(name, CorbaClient.getStockQuote().name);
        assertEquals(price, String.valueOf(CorbaClient.getStockQuote().price));
    }

    /**
     * Test of main method, of class CorbaClient.
     */
    @Test
    public void testTaskD() {
        System.out.println("main d)");
        String[] args = {id, "d"};
        client.main(args);
        assertEquals(id, String.valueOf(CorbaClient.getStockQuote().id));
        assertEquals(name, CorbaClient.getStockQuote().name);
        assertEquals(price, String.valueOf(CorbaClient.getStockQuote().price));
    }

    /**
     * Test of main method, of class CorbaClient.
     */
    @Test
    public void testMainAByString() {
        System.out.println("main a) with String");
        String[] args = {name, "a"};
        client.main(args);
        assertEquals(id, String.valueOf(CorbaClient.getStockQuote().id));
        assertEquals(name, CorbaClient.getStockQuote().name);
        assertEquals(price, String.valueOf(CorbaClient.getStockQuote().price));
    }

    /**
     * Test of main method, of class CorbaClient.
     */
    @Test
    public void testTaskAByString() {
        System.out.println("main b) with String");
        String[] args = {name, "b"};
        client.main(args);
        assertEquals(id, String.valueOf(CorbaClient.getStockQuote().id));
        assertEquals(name, CorbaClient.getStockQuote().name);
        assertEquals(price, String.valueOf(CorbaClient.getStockQuote().price));
    }

    /**
     * Test of main method, of class CorbaClient.
     */
    @Test
    public void testMainCByString() {
        System.out.println("main c) with String");
        String[] args = {name, "c"};
        client.main(args);
        assertEquals(id, String.valueOf(CorbaClient.getStockQuote().id));
        assertEquals(name, CorbaClient.getStockQuote().name);
        assertEquals(price, String.valueOf(CorbaClient.getStockQuote().price));
    }

    /**
     * Test of main method, of class CorbaClient.
     */
    @Test
    public void testTaskDByString() {
        System.out.println("main d) with String");
        String[] args = {name, "d"};
        client.main(args);
        assertEquals(id, String.valueOf(CorbaClient.getStockQuote().id));
        assertEquals(name, CorbaClient.getStockQuote().name);
        assertEquals(price, String.valueOf(CorbaClient.getStockQuote().price));
    }
}
