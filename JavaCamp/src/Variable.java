public class Variable {
    public static void main (String[] args){
        basicDataType();
        keywordAndIdentifier();

    }

    public static void basicDataType() {
        // int -2^31-2^31-1
        // 标识符 indentifier 区分大小写,字母数字下划线组成
        // 关键字 keyword 系统关键字
        int a = 1; // 字面值
        int b = 2; // 运算符
        int c = 4;
        int d = 7;
        int x = a+b*c/d;
        // int int = 10;
        System.out.println(x);

        // 变量类型 变量类型 = 变量的值;
        String name = "中国";
        System.out.println(name);

        // 创建一个没有赋值的变量
        int e;
        // 尚未初始化不能打印
        // System.out.println(e);


        // 代码三级跳 表达式->语句->代码块
        // 表达式,基本运算,a+b
        int f = a + b;

        // 语句,表达式组成,;结束
        int i = a + b - c / d;

        // 空表达式
        ;

        // 代码块 {}
        {}
    }


    public  static void keywordAndIdentifier(){
        // 关键字和标识符区分大小写
        int abc = 0;
        // Int abcd = 1;

        // 类名和文件名必须一致
        // Test.Java;
        // public Calss Test {}

        // 变量的声明和使用大小写必须一致
        int test = 9;
        // int result = Test + test;

        // 方法名要区分大小写mian() Main()

        // 函数打印确认大小写
        System.out.println("abcd");
        // system
    }
}
