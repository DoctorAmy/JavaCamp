public class AutoConvert {
    public static void main(String[] args) {
        // 数据类型自动转换:低精度自动转换到高精度
        // double > float > long > int > short > byte
        int a = 99;
        long b = a;
        long c= a + b;
        System.out.println("c = " + c);

        float d = 100.25f;
        double e = d;
        double f = d * e;
        System.out.println("f = " + f);

        int g = 99;
        int h = 5;
        double k = 5;
        System.out.println("99/int = " + g/h);
        System.out.println("99/double = " + g/k);

        // char可以转成int,char没有符号,超出了short可以表示的范围
        char name = 'A';
        int o = name;
        System.out.println("o = " + o);
        int p = name + 10;
        System.out.println("p = " + p);
        // java: 不兼容的类型: 从int转换到short可能会有损失
        // short q = name - 66;
        // System.out.println("q = " + q);
    }
}
