package com.enmuser.abstractFactory;

public class Client {

  public static void main(String[] args) {
      AbstractFactory factory = new ModernFactory();
      factory.createFood().printName();
      factory.createVehicle().moving();
      factory.createWeapon().fire();
  }
}
