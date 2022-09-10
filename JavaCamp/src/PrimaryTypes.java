import java.util.Arrays;

public class PrimaryTypes {
        public static void main(String[] args){
            PrimaryTypes();
            System.out.println("args = " + Arrays.deepToString(args));
        }

        /*打印函数*/
        public static void PrimaryTypes() {
            // bit 一个二进制位  网络带宽的存储单位
            // byte 8个二进制位  硬盘的存储单位
            // short 2个b
            // int 4个b
            // long 8个b
            // float 4个b

            // byte
            byte byteVar = 99;
            System.out.println(byteVar);

            // short
            short shortVar = -30000;
            System.out.println(shortVar);

            // int
            int intVar = 50000000;
            System.out.println(intVar);

            // long
            long longVar = 1131313213;
            System.out.println(longVar);

            // long 大写L结尾,方便1和l区分
            long bigLongVar = 213131313131L;
            System.out.println(bigLongVar);


            // float 大小写f/F都可以结尾
            float floatVar = 100.f;
            System.out.println(floatVar);
            float bigFloatVar = 100000000.F;
            System.out.println(bigFloatVar);

            // double 浮点数缺省类型
            double doubleVar = 100000000000000.1;
            System.out.println(doubleVar);

            // boolean
            boolean yes = true;
            System.out.println(yes);
            boolean no = false;
            System.out.println(no);

            // char
            char charVar = 'a';
            System.out.println(charVar);

            // 打印快捷键sout
            // sout 打印字符串
            System.out.println();
            // soutv 打印上下文中的变量
            System.out.println("charVar = " + charVar);
            // soutm  打印当前类和方法
            System.out.println("PrimaryTypes.PrimaryTypes");
            // soutp 打印方法参数和值
            System.out.println();
        }
}
