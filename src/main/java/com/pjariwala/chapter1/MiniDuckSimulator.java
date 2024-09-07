package com.pjariwala.chapter1;

import com.pjariwala.chapter1.behaviors.FlyRocketPowered;
import com.pjariwala.chapter1.ducks.Duck;
import com.pjariwala.chapter1.ducks.MallardDuck;
import com.pjariwala.chapter1.ducks.ModelDuck;

public class MiniDuckSimulator {

  public static void main(String[] args) {
    System.out.println("------");
    Duck mallard = new MallardDuck();
    mallard.performQuack();
    mallard.performFly();
    System.out.println("\n------");
    Duck modelDuck = new ModelDuck();
    modelDuck.performFly();
    modelDuck.setFlyBehavior(new FlyRocketPowered());
    modelDuck.performFly();
  }
}
