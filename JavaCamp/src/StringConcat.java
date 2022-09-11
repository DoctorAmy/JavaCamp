import javax.lang.model.SourceVersion;

public class StringConcat {
    public static void main(String[] args) {
        // 字符串加法运算,可以使用+=拼接
        int a = 20;
        int b = 30;
        int c = a + b;
        System.out.println("c = " + c);
        System.out.println("a + b + c = " + a + b + c);
        System.out.println("a + b + c = " + (a + b + c));

        // 字符串不是基础数据类型
        // String 不是Java的保留关键字
        int String = 5;
        System.out.println("String = " + String);

        // 字符串的加法运算不会改变字符串的值,要改变需要赋值
        String name = "abcd";
        System.out.println("name = " + name);
        System.out.println("name = " + name + 20);
        int nameAdd = 10;
        System.out.println("name = " + (name + nameAdd));
        name = nameAdd + name;
        System.out.println("name = " + name);
    }
}
