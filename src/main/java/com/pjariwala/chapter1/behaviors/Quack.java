package com.pjariwala.chapter1.behaviors;

public class Quack implements QuackBehavior {
  @Override
  public void quack() {
    System.out.println("Quack");
  }
}
