public class MathCalculation {
    /*主函数*/
    public static void main(String[] args){
        varibleTest();
    }

    /*变量*/
    public static void varibleTest() {
        // 加减乘除
        System.out.println(5+6);
        System.out.println(5-6);
        System.out.println(5*6);
        System.out.println(5/6);
        System.out.println(5/6.0); // 精度问题

        // 复杂表达式,注意优先级
        System.out.println(5+6-7*8/9.0);
        System.out.println((5+6-7)*8/9.0);
    }
}
