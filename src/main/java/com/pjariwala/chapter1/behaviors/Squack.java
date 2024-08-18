package com.pjariwala.chapter1.behaviors;

public class Squack implements QuackBehavior {
  @Override
  public void quack() {
    System.out.println("Squack");
  }
}
