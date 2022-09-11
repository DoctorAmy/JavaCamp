public class CodeBlock {
    public static void main(String[] args) {
        // 代码块 {} 作用域或者命名空间
        // 代码块内部可以使用代码块外部的变量
        int outer = 100;
        {
            int inner = 200;
            System.out.println("inner = " + inner);
            System.out.println("outer = " + outer);
        }

        int a1= 100;
        {
            int a2 = a1 + 1;
            System.out.println("a2 = " + a2);
            {
                // 内层可以重复使用外层变量,但是不可以重新定义
                int a3 = a2 + 1;
                System.out.println("a3 = " + a3);
            }
            // 同一个命名空间变量不能重名
            {
                int a3 = a2 + 10;
                System.out.println("a3 = " + a3);
                {
                    System.out.println("a1 = " + a1);
                    {
                        System.out.println("outer = " + outer);
                    }
                }
            }
        }
        // 内层创建的变量对外层不可见
        System.out.println("a1 = " + a1);

    }
}
