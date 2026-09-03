import javax.swing.*;
import java.awt.event.*;
import kareltherobot.*;

// Leo Zhang
// Period 6

public class Main implements Directions {
  public static void main(String[] args) {
    World.setDelay(10);
    World.setVisible(true);
    World.setSize(10,10);
    Robot emojiBot = new Robot(5,1,North,100);
    int count = 0;
    makeBox(emojiBot);
    count += 1;
    turnRight(emojiBot);
    for (int i = 0; i < 4; i++) {
      emojiBot.move();
    }
    emojiBot.turnLeft();
    makeBox(emojiBot);
    count  = count+1;
    turnRight(emojiBot);
    emojiBot.move();
    emojiBot.move();
    turnRight(emojiBot);
    for (int i = 0; i < 3; i++) {
      emojiBot.move();
    }
    turnRight(emojiBot);
    beepMoveX(emojiBot,7);
    count = count+1;

  }
  public static void turnRight(Robot r) {
    for (int i = 0; i < 3; i++) {
      r.turnLeft();
    }
  }
  public static void beepMoveX(Robot r, int x) {
    for (int i = 0; i < x; i++) {
      r.putBeeper();
      r.move();
    }
  }
  public static void makeBox(Robot r) {
    for (int i = 0; i < 2; i++) {
      beepMoveX(r,3);
      turnRight(r);
      beepMoveX(r,2);
      turnRight(r);
    }
  }
}