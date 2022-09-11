public class PrintChars {
    public static void main(String[] args) {
        char ch = 'a';
        int startNum = ch;
        for (int i = 0; i < 26; i++) {
            System.out.println(startNum + i + " is " + (char) (startNum + i));
        }

        char ch_A = 'A';
        int startNum_A = ch_A;
        for (int j = 0; j < 26; j++) {
            System.out.println((startNum_A + j) + "\t" + "is" + "\t" + (char) (startNum_A + j));
        }

        char name = '我';
        int startName = name;
        for (int k = 0; k < 10; k++) {
            System.out.println((startName + k) + " is " + (char) (startName + k));
        }

        // 总结
        // 行内转换char时需要加括号
        // 代码格式化快捷键 Ctrl + Alt + L
        // 代码格式化点击操作 Code -> FormatCode
    }
}
