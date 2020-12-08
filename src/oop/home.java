package oop;

import oop.Squirrel;
import java.io.*;

public class home {

  public static void main(String[] args) throws IOException {

    Squirrel squirrel1;
    Squirrel squirell2;

    squirrel1 = new Squirrel(12, 55, "brown");
    squirell2 = new Squirrel(15, 67, "red");

    squirrel1.jump();
    squirell2.jump();

    squirrel1.makeNoise();
    squirell2.makeNoise();

    squirrel1.climbTree();
    squirell2.climbTree();

  }

}