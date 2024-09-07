package com.pjariwala.chapter1.ducks;

import com.pjariwala.chapter1.behaviors.FlyWithWings;
import com.pjariwala.chapter1.behaviors.Quack;

public class MallardDuck extends Duck {

  public MallardDuck() {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

  public void display() {
    System.out.println("I'm a real Mallard duck");
  }
}
