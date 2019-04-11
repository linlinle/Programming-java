package recursion;

/**     阶乘函数    */
public class Factorial {
    public static int Factorial(int n) throws IllegalArgumentException{
        if (n<0)
            throw new IllegalArgumentException();
        else if (n==0)
            return 1;
        else
            return n*Factorial(n-1);
    }
}
