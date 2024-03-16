class Hello{
    public static void main(String args[])
    {
        //java variables
        int num1 = 4;
        int num2 = 5;
        int result = num1+num2;
        System.out.println(result);



        //java primitive datatypes
        int num_1 = 321;
        long num_2 = 9999999l;
        byte b = 127;
        short s = 2728;

        float f = 5.8f;
        double d = 5.897;

        char c = 'g';
        boolean isSunRiseEast = true;
        boolean isSunSetEast = false;
        
        System.out.println("Int num1 :"+num1+"\nLong num2 :"
                            +num2+"\nbyte b :"+b+"\nShort s :"+s+"\nFloat f :"+f+
                            "\nDouble d :"+d+"\nchar c :"+c+"\nboolean isSunRiseEast :"+isSunRiseEast+
                            "\nboolean isSunSetEast :"+isSunSetEast);

        //literals in java

        int number = 9;

        int dec = 0b101;
        System.out.println("Decimal value :"+dec);

        int hex = 0x7E;
        System.out.println("Hexa value :"+hex);

        //if there are large numbers we can use underscore to separate them
        int salary = 1_00_00_00_000;
        System.out.println("My salary :"+salary);

        //int value can be assigned to double type
        double d1 = 127;
        System.out.println("double value d :"+d1);

        double d2 = 12e10;
        System.out.println("d2 value :"+d2);

        char ch = 'a';
        System.out.println("Before increment c:"+ch);
        ch+=1;
        System.out.println("After increment c:"+ch);
        // System.out.println()
    }
}