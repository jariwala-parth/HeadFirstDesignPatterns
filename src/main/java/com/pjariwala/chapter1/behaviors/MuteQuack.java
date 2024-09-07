package com.pjariwala.chapter1.behaviors;

public class MuteQuack implements QuackBehavior {
  @Override
  public void quack() {
    System.out.println("<< Silence >>");
  }
}
