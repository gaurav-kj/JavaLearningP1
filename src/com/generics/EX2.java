package com.generics;

class Test2<T, U>
{
    T obj1;
    U obj2;


    Test2(T obj1, U obj2)
    {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }


    public void print()
    {
        System.out.println(obj1);
        System.out.println(obj2);
    }
}

// Driver class to test above
class EX2
{
    public static void main (String[] args)
    {
        Test2 <String, Integer> obj =
                new Test2<String, Integer>("ABC", 15);

        obj.print();
    }
}
