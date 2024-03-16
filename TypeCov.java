public class TypeCov
{
    public static void main(String args[])
    {
        byte b = 127;
        // int b = 127; //cannot be assign same variable to another type

        int a = 256;
        //b = a; //a value cannot fit in b type we have to explictly convert
        // System.out.println("b value :"+b);

        a = b; //this statement is correct as a int range is bigger than byte range
        System.out.println("a value after implicit conversion :"+a);
        // System.out.println("a value :"+a);


        // System.out.println("b value before conversion :"+b);
        // a = 12;

        // b = (byte)a;
        // System.out.println("b value after conversion :"+b);

        float f = 5.6f;
        int x = (int)f;

        System.out.println("value of x is :"+x);


        byte small = 127;
        int big = 257;
        b = (byte)a;

        System.out.println("b value :"+b);

        byte n1 = 20;
        byte n2 = 30;

        int ans = n1*n2; //this is called type promotion in java
        System.out.println(ans);
    }
}