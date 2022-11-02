package Exception;

public class HelloTryCatch {
    public static void main(String[] args) {
        // String s = "";
        // String sub = s.substring(10,11);
        // Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Range [10, 11) out of bounds for length 0
        // 直接抛出异常程序结束
        // System.out.println("it is finish first");

        try {
             String s = "";
             String sub = s.substring(10,11);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        // 使用try catch 虽然有异常,但是程序可以正常执行
        System.out.println("it is finish second");
    }
}
