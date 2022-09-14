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

        MyBattery m_attery = new MyBattery();
        m_attery.maker = "比亚迪";
        m_attery.isLiMetiral = true;
        m_attery.totoal = "100度";

        System.out.println(m_screen);
    }

}
