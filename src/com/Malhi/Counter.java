package com.Malhi;

public class Counter {
    public int sub(int a,int b){
        return a-b;
    }
    public long sub(long a,long b){
        return a-b;
    }
    public double sub(double a,double b){
        return a-b;
    }

    public static void main(String[] args) {
        Counter c = new Counter();
        System.out.println("Int => "+c.sub(6,5));
        System.out.println("Long => "+c.sub(46556622165L,1155L));
        System.out.println("Double => "+c.sub(3.2,1.3));
    }
}
