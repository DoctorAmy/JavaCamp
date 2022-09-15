package com.phone.screen;

public class MyScreen {
    // public 访问修饰符
    // 同级目录下访问其他类的属性不需要加
    // 不同目录下需要加public访问修饰符才可调用

   public String maker;
   public String size;
   public boolean isHighScreen;

   // >> TODO 方法function
   // >> TODO public 访问修饰符
   // >> TODO void 返回值类型,没有返回值是用void
   // >> TODO describe 方法名,任意合法的标识符都可以
   // >> TODO 参数列表 ()
   // 方法体 {}
   public void describe() {
      System.out.println("MyScreen Maker is " + maker + "\n" +
              "MyScreen size is " + size + "\n" +
              "MyScreen isHighScreen is " + isHighScreen);
   }
}
