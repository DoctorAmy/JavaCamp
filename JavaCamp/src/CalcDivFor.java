public class CalcDivFor {
    public static void main(String[] args) {
        int devided = 100;
        int divisor = 5;

        int found = 0;

        int toBeFound = 200;
        int getFound = 105;
        for (int i = 0; i < 100 && found < 10; i++) {
             if (devided % divisor == 0){
                 System.out.println(devided + "可以这个整除" + divisor + "商为"+ devided/divisor);
                 found++;
             }
            devided++;

            if (devided == getFound) {
                System.out.println(devided + "continue");
                continue;
            }

            if (devided > toBeFound) {
                System.out.println("current value is " + devided + "\t" + "break");
                break;
            }

        }
    }
}
