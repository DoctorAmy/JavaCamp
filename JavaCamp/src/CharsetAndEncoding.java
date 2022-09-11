public class CharsetAndEncoding {
    public static void main(String[] args) {
        // 字符集
        // 字符集合 CBK ASCII
        // char -> character
        // 与计算机无关

        // 编码
        // 字符 -> 数字,映射叫编码
        // 字符本质是数字
        // 与计算机有关

        // 常用字符集
        // ASCII
        // Unicode UTF-8 UTF-16
        // Unicode GBK 兼容ASCII

        // JAVA 中用的UTF-16
        // 16个bit 2个byte 转换需要用int

        // 输出特殊字符
        // 1.ASCII + Char
        // 2.转义符 n(换行) "(双引号) t(制表符) uXXX(unicode编码对应的字符)

        String test1 = "a\tbb\tccc\t";
        System.out.println("test1 = " + test1);
        String test2 = "aksflkajfsalkjfjalkjsflka";
        System.out.println("test2 = " + test2);
        String test3 = "dddd\neeeee\nfffffff";
        System.out.println("test3 = " + test3);
        String test4 = "gggggg\"I love you\"";
        System.out.println("test4 = " + test4);

        int start = 65;
        char cha = (char)start;
        System.out.println("cha = " + cha);
        char name = '\u81e2';
        System.out.println("name = " + name);
    }
}
