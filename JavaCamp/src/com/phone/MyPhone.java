// package 文件分类放置,包,
// 一个文件只能有一个package语句(一个文件只能放置在一个目录下)
// 不通的包里可以不同的文件名(不同的文件目录下允许相同的类名)
// 如果是package语句,则必须是类的第一行有效代码(实际可用的除过注释)
package com.phone;

import com.phone.screen.MyBigPhone;
import com.phone.screen.MyScreen;

// 使用*(通配符),可以导入包中所有的类
import com.phone.battery.*;


public class MyPhone {
    public static void main(String[] args) {

        // MyCpu和MyScreen在同级目录可以直接访问
        MyCpu m_cpu = new MyCpu();
        m_cpu.maker = "苹果";
        m_cpu.name = "M1";
        m_cpu.price = "$60";

        // Ctrl + 点击进入 可跳转到类或者类的属性定义位置
        // Ctrl + Alt + <- / -> 后退或前进
        MyScreen m_screen = new MyScreen();
        m_screen.size = "8.8";
        m_screen.maker = "京东方";
        m_screen.isHighScreen = true;

        // 调用对象的方法
        // 点操作符调用
        // 方法调用要有小括号,即便没有入参
        m_screen.describe();

        MyBattery m_attery = new MyBattery();
        m_attery.maker = "比亚迪";
        m_attery.isLiMetiral = true;
        m_attery.totoal = "100度";

        System.out.println(m_screen);

        // 黄色小箭头为有main函数的方法
        // 断点的分类 有效(红圈小对钩)/无效(白圈砍一刀)/条件断点(红圈小对钩加问号)
        // 断点模式开启 小虫子按钮
        // 断点常用操作 Resume 跳转到下一个断点 快捷键F9
        // 断点常用操作 Step Over 跳转到下一行断点(逐行) 快捷键F8
        // 条件断点,在断点上右击,输入满足的条件,待条件满足时自动逮住bug
        // Evaluate Expression 评估表达式,可以计算断点下的值运算
    }

}
