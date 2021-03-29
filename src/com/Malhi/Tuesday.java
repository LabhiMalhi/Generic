package com.Malhi;

public class  Tuesday  {
    double pi =3.14;
    double radius;

    public Tuesday( double radius){
       this.radius = radius;

    }

    public double circum(){
        double circum = 2*pi * this.radius;
        return circum;
    }

    public void Details(int r){
        System.out.println("local variable => " + r);
        System.out.println("Instant variable => " + this.radius);

    }
}