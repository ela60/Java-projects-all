/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;
import java.awt.Point;

public class S2Q2Robot {
    
    private int locationX;
    private int locationY;
    private int direction;
    
    
    public S2Q2Robot() {
        
    }

    public void turnLeft() {
        direction = (direction + 1)%4;
        while (direction <0) {direction = direction + 4;}
    }
    
    public void turnRight() {
        direction = (direction - 1)%4;
        while (direction <0) {direction = direction + 4;}
    }
    
    public void move() {
        if (direction == 0) {locationX +=1;}
        else if (direction == 2) {locationX -=1;}
        else if (direction == 1) {locationY +=1;}
        else if (direction == 3) {locationY -=1;}
    }
    
    public Point getLocation() {
        Point location = new Point(locationX, locationY);
        return location;
    }
    
    public String getDirection() {
        String direction = "N";
        if (this.direction == 0) {direction = "E";}
        if (this.direction == 2) {direction = "W";}
        if (this.direction == 3) {direction = "S";}
        return direction;
    }
}
