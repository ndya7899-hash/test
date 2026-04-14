public class Task03 {
    public static void main(String[] args) {
        int[] scores = {60, 70};
        addBonus(scores);
        System.out.print("加分後結果: {");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + (i == scores.length - 1 ? "" : ", "));
        }
        System.out.println("}");
    }

    public static void addBonus(int[] scores) {
        for (int i = 0; i < scores.length; i++) scores[i] += 5;
    }
}
/* 執行結果：
加分後結果: {65, 75}
*/