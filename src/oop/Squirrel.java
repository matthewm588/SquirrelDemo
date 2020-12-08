package oop;

public class Squirrel {

  int age;
  int weight;
  String color;

  public Squirrel(int newAge, int newWeight, String newColor) {

    this.age = newAge;
    this.weight = newWeight;
    this.color = newColor;

  }

  public void jump() {

    System.out.println("squirell of age " + this.age + " jumped");

  }

  public void makeNoise() {

    System.out.println("Squirell of weight " + this.weight + " made noise");

  }

  public void climbTree() {

    System.out.println("A " + this.color + " squirell climbed the tree");

  }

}
