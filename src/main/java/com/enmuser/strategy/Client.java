package com.enmuser.strategy;

public class Client {

  public static void main(String[] args) {
    //
      Strategy addStrategy = new AddStrategy();
      Context context = new Context(addStrategy);
      // 输出3
      System.out.println(context.calculate(1, 2));

      Strategy subStrategy = new SubStrategy();
      // 动态替换算法(策略)
      context.setStrategy(subStrategy);
      // 输出-1
      System.out.println(context.calculate(1, 2));
  }
}
