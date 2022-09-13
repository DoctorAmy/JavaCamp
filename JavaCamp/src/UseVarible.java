import java.util.Scanner;
public class UseVarible {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a;
        System.out.println("创建了变量a 请输入一个整数:");
        a = in.nextInt();
        System.out.println("给a赋值,a的值为"+a+"请在输入一个整数:");
        a = in.nextInt();
        System.out.println("再次赋值,现在a的值为"+a);

        // 数组的实: 一块地址连续的内存
        int [] book = new int[10];
        // 数组的名: 数组的地址,指向数组的起始地址
        // book 数组的名,存放数组的起始地址
        // 数组的索引是从0开始的原因,数组的名存放了数组的起始地址,后面通过index可以确定其他位置的内容
        
        // 数组的长度 .length,数组创建之后长度不可变
        System.out.println("book = " + book.length);

        // 数组索引从0开始,.length-1结束
        System.out.println("book[book.length] = " + book[0]);
        System.out.println("book[book.length] = " + book[book.length-1]);

        // 数组越界ArrayIndexOutOfBoundsException
        // System.out.println("book[book.length] = " + book[book.length]);

        book[0] = 9;
        System.out.println("book[0] = " + book[0] + ". book 的长度" + book.length);

        // 非基本类型的变量访问:两级跳
        book = new int[32];
        System.out.println("book[0] = " + book[0] + ". book 的长度" + book.length);

    }
}
