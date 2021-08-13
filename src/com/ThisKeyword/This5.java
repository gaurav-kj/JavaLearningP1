package com.ThisKeyword;
class B{
    This5 obj;
    B(This5 obj){
        this.obj=obj;
    }
    void display(){
        System.out.println(obj.data);//using data member of A4 class
    }
}
public class This5 {
    int data=10;
    This5(){
        B b=new B(this);
        b.display();
    }
    public static void main(String args[]){
        This5 a=new This5();
    }
}
