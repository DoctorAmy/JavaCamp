import java.util.Scanner;

public class MutilDimensionArray {
    public static void main(String[] args) {
        // 用数组处理六门课的成绩
        int YuWen = 0;
        int ShuXue = 1;
        int YingYu = 2;
        int WuLi = 3;
        int HuaXue = 4;
        int Shengwu = 5;

        int totalScoresCount = 6;
        String [] scoreNames = new String[totalScoresCount];
        scoreNames[YuWen] = "语文";
        scoreNames[ShuXue] = "数学";
        scoreNames[YingYu] = "英语";
        scoreNames[WuLi] = "物理";
        scoreNames[HuaXue] = "化学";
        scoreNames[Shengwu] = "生物";

        Scanner in = new Scanner(System.in);
        System.out.println("请问你要保存几年的成绩");
        int yearToScore = in.nextInt();
        double [][] scores = new double[yearToScore][scoreNames.length];
        for (int i = 0; i < yearToScore; i++) {
            for (int j = 0; j < scoreNames.length; j++) {
                scores[i][j] = 80 + Math.random()*20;
            }
        }

        System.out.println("请问你要查询第几年的成绩");
        int yearIndex = in.nextInt() -1;

        System.out.println("请问你要查询成绩的编号");
        int scoreIndex = in.nextInt() -1;
        System.out.println("第"+(yearIndex +1)+"年的"+scoreNames[scoreIndex]+"的成绩是"+scores[yearIndex][scoreIndex]);
    }
}
