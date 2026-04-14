public class Task01 {
    public static void main(String[] args) {
        int[] scores = {70, 80, 90};
        double avg = 0;
        for (int s : scores) avg += s;
        System.out.println("1. 平均分數: " + (avg / scores.length));
    }
}
/* 執行結果：
1. 平均分數: 80.0
*/