package com.mycompany.aula02exe02;

public class Swapper {
    private int x, y;
    
    void setX(int x){
        this.x = x;
    }
    void setY(int y){
        this.y = y;
    }
    
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    
    void swap(){
        int temp = x;
        this.x = y;
        this.y = temp;
    }
}
