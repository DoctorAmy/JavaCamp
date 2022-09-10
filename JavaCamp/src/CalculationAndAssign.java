public class CalculationAndAssign {
    // psvm main函数自动补全快捷键
    public static void main(String[] args) {
        int a = 10;

        // 计算并赋值运算符
        System.out.println("a = " + a);
        a += 5;
        System.out.println("a += " + a);
        a -= 2;
        System.out.println("a -= " + a);
        a *= 3;
        System.out.println("a *= " + a);
        a /= 2;
        System.out.println("a /= " + a);
        a %= 3;
        System.out.println("a %= " + a);

        a = 1;
        a &= 1;
        System.out.println("a &= " + a);
        a |= 2;
        System.out.println("a |= " + a);
        a ^= 2;
        System.out.println("a ^= " + a);

        a = 16;
        a >>= 2;
        System.out.println("a >>= " + a);
        a <<= 2;
        System.out.println("a <<= " + a);
        a >>>= 2;
        System.out.println("a >>>= " + a);
    }
}
