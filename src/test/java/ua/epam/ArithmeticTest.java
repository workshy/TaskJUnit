package ua.epam;

import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

/**
 * Created by Viktoriia_Marynchak on 9/13/2016.
 */
public class ArithmeticTest {
    private static Arithmetic a;

    @Rule
    public final ExpectedException exp = ExpectedException.none();

    @BeforeClass
    public static void runT() {
        a = new Arithmetic();
    }

    /*@AfterClass*/

    @Test
    public void testAdd() throws Exception {
        double res = a.add(3, 7);
        Assert.assertEquals(10, res, 0);
    }

    @Test
    public void testMult() throws Exception {
        double res = a.mult(3, 7);
        Assert.assertEquals(21, res, 0);
    }

    @Ignore
    @Test
    public void testDeduct() throws Exception {
        double res = a.deduct(3, 7);
        Assert.assertEquals(-4, res, 0);
    }

    @Test
    public void testDiv() throws Exception {
        double res = a.div(10, 5);
        Assert.assertEquals(2.0, res, 0);
    }

    @Test //(expected = ArithmeticException.class)
    public void testDivException() {
        exp.expect(ArithmeticException.class);
        a.div(10.0, 0.0);
    }

    @Test(timeout = 1000)
    public void testN(){
        while (true);
    }

}