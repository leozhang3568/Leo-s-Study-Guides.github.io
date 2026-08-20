import javax.swing.*;
import java.awt.event.*;
import kareltherobot.*;

// Leo Zhang
// Period 6

public class Main implements Directions {
  public static void main(String[] args) {
    Robot karel = new Robot(3,1,East,100);
    World.setVisible(true);
    World.setSize(10,10);
    World.setDelay(10);
    karel.turnLeft();
    for (int i = 0; i < 4; i++) {
        karel.move();
    }

    turnRight(karel);
    turnRight(karel);

    for (int i = 0; i < 4; i++) {
        karel.move();
        karel.putBeeper();
    }

    karel.turnLeft();

    for (int i = 0; i < 3;  i++) {
        karel.move();
        karel.putBeeper();
    }

    karel.move();
    karel.move();
    
    for (int i = 0; i < 4;  i++) {
        karel.putBeeper();
        karel.move();
    }

    karel.turnLeft();
    karel.turnLeft();

    for (int i = 0; i < 4; i ++) {
        karel.move();
    }
    turnRight(karel);
    for (int i = 0; i < 3; i ++) {
        karel.move();
        rightBeep(karel);
        karel.turnLeft();
    }
    karel.turnLeft();

    for (int i = 0; i < 3; i ++) {
        karel.move();
        karel.putBeeper();
    }
    karel.move();
    karel.move();
    move(karel,1,5);
  }
  public static void turnRight(Robot n){
    for (int i = 0; i < 3; i++) {
      n.turnLeft();
    }
  }
  public static void moveBeep(Robot n){
    n.move();
    n.putBeeper();
  }
  public static void rightBeep(Robot n){
    turnRight(n);
    n.move();
    n.putBeeper();
  } 
  public static void move(Robot n, int nx, int ny) {
    int x = n.avenue();
    int y = n.street();
    if (nx > x) {
      n.facingEast();
      for (int i = 0; i < (nx-x); i++) {
        n.move();
      }
    }
    else {
      n.facingWest();
      for (int i = 0; i < (x-nx); i++) {
        n.move();
      }
    }

    if (ny > y) {
      n.facingNorth();
      for (int i = 0; i < (ny-y); i++) {
        n.move();
      }
    } 
    else {
      n.facingSouth();
      for (int i = 0; i < (y-ny); i++) {
        n.move();
      }
    }
  }
}