package com.pjariwala.chapter1.behaviors;

public class FlyNoWay implements FlyBehavior {
  @Override
  public void fly() {
    System.out.println("I can't fly");
  }
}
