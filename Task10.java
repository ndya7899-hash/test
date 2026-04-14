public class Task10 {
    public static void main(String[] args) {
        int[] scores = {70, 85, 62, 90, 58};
        int min = scores[0];
        for (int s : scores) if (s < min) min = s;
        System.out.println("最小值: " + min);
    }
}
/* 執行結果：
最小值: 58
*/