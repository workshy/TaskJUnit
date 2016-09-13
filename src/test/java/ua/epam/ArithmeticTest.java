package ua.epam;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Viktoriia_Marynchak on 9/13/2016.
 */
public class ArithmeticTest {
    @Test
    public void testAdd() throws Exception {
        Arithmetic a = new Arithmetic();
        double res = a.add(3, 7);
        Assert.assertEquals(10, res, 0);
    }

    @Test
    public void testMult() throws Exception {
        Arithmetic a = new Arithmetic();
        double res = a.mult(3, 7);
        Assert.assertEquals(21, res, 0);
    }

    @Test
    public void testDeduct() throws Exception {
        Arithmetic a = new Arithmetic();
        double res = a.deduct(3, 7);
        Assert.assertEquals(-4, res, 0);
    }

    @Test
    public void testDiv() throws Exception {
        Arithmetic a = new Arithmetic();
        double res = a.div(10, 5);
        Assert.assertEquals(2.0, res, 0);
    }

}