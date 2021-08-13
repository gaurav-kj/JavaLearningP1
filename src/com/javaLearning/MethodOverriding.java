package com.javaLearning;
class WholeSale{
    int rate(){return 0;}
}

class Shop1 extends  WholeSale{
    int rate(){return 2;}
}
class Shop2 extends  WholeSale{
    int rate(){return 3;}
}
class Shop3 extends  WholeSale{
    int rate(){return 4;}
}
class Shop4 extends  WholeSale{
    int rate(){return 5;}
}
public class MethodOverriding {
    public static void main(String[] args) {
        int rate;
        Shop1 s1 = new Shop1();
         rate  = s1.rate();
        System.out.println(rate);

        Shop2 s2 = new Shop2();
        rate  = s2.rate();
        System.out.println(rate);
        Shop3 s3 = new Shop3();
        rate  = s3.rate();
        System.out.println(rate);
        Shop4 s4 = new Shop4();
        rate  = s4.rate();
        System.out.println(rate);
    }
}
