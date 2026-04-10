package com.mycompany.aula06exe05;

public class Main {
    public static void main(String [] args){
        MovableCircle circle = new MovableCircle(0,0,1,1,5);
        
        circle.moveUp();
        circle.moveUp();
        circle.moveLeft();
        System.out.println(circle);
        
        circle.getCenter().x = 0;
        circle.getCenter().y = 0;
        circle.getCenter().xSpeed = 2;
        circle.getCenter().ySpeed = 2;
        
        circle.moveUp();
        circle.moveUp();
        circle.moveLeft();
        System.out.println(circle);
    }
}
