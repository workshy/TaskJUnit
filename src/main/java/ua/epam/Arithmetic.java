package ua.epam;

/**
 * Created by Viktoriia_Marynchak on 9/13/2016.
 */
public class Arithmetic {
    public double add (double a, double b){
        return a + b;
    }

    public double deduct(double a, double b){
        return a - b;
    }

    public double mult(double a, double b){
        return a * b;
    }

    public double div(double a, double b){
        if (b == 0) throw new ArithmeticException();

        return  a / b;
    }
}
