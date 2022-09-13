public class CreateArray {
    public static void main(String[] args) {
        // 数组 相同类型的集合
        // 固定顺序 index

        // 创建数组
        // 类型[] 变量名 = new 类型 [长度]
        int [] myIntArray = new int[88];
        System.out.println(myIntArray[6]);
        System.out.println(myIntArray[10]);

        double [] myDoubleArray = new double[100];
        System.out.println(myDoubleArray[0]);
        System.out.println(myDoubleArray[99]);

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

        double [] scores = new double[totalScoresCount];
        double maxScore = 0.0f;
        int maxScoreIndex = 0;
        for (int i = 0; i < totalScoresCount; i++) {
            scores[i] = 80 + Math.random()*20;
            System.out.println(scoreNames[i] + "的成绩是" + scores[i]);
            if (scores[i] > maxScore) {
                maxScore = scores[i];
                maxScoreIndex = i;
            }
        }
        System.out.println("成绩的最科目是"+scoreNames[maxScoreIndex]);
        System.out.println("成绩的最高分是"+maxScore);
    }
}
