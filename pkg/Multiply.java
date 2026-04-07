package pkg;

public class Multiply implements Calculate 
{
    public void cal(int x, int y)
    {
        System.out.println("Multiplication of numbers = " + (x * y));
    }
}