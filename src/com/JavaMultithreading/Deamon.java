package com.JavaMultithreading;

class Daemon extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){//checking for daemon thread
            System.out.println("daemon thread work");
        }
        else{
            System.out.println("user thread work");
        }
    }
    public static void main(String[] args){
        Daemon t1=new Daemon();//creating thread
        Daemon t2=new Daemon();
        Daemon t3=new Daemon();

        t1.setDaemon(true);

        t1.start();
        t2.start();
        t3.start();
    }
}