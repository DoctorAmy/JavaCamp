public class ForceConvert {
    public static void main(String[] args) {
        // 强制类型转换:(type); 可能纯在数据丢失

        // long -> int
        int intVar = 99;
        System.out.println("intVar = " + intVar);
        long longVar = 19999;
        System.out.println("longVar = " + longVar);
        intVar = (int)longVar; // 人为判断
        System.out.println("intVar = " + intVar);

        // double -> float
        float floatVal = 11.32f;
        System.out.println("floatVal = " + floatVal);
        double doubleVal = 2313123213213.2321321;
        System.out.println("doubleVal = " + doubleVal);
        floatVal = (float)doubleVal;
        System.out.println("floatVal = " + floatVal);


        // int -> char
        int intVal = 65;
        char charVal = (char)intVal;
        System.out.println("charVal = " + charVal);
        char charVal2 = (char)(intVal + 3);
        System.out.println("charVal2 = " + charVal2);

        // 强制类型转换可能存在数据丢失
        // floatVal = 11.32
        // doubleVal = 2.313123213213232E12
        // floatVal = 2.31312327E12

        // 数值溢出,溢出后失去意义
        int intValDone = 2000000000;
        System.out.println(intValDone + intValDone);

        // 数据溢出时编程语言与程序员的责任分界
        // 分析问题 + 解决问题 + code -> developer
        // 语法执行 + 与计算机交互 -> language
    }
}
