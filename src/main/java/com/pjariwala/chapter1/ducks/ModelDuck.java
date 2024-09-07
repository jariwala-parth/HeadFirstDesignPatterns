package com.pjariwala.chapter1.ducks;

import com.pjariwala.chapter1.behaviors.FlyNoWay;
import com.pjariwala.chapter1.behaviors.Quack;

public class ModelDuck extends Duck {
  public ModelDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new Quack();
  }

  @Override
  public void display() {
    System.out.println("I'm a model duck");
  }
}
