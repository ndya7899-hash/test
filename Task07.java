public class Task07 {
    public static void main(String[] args) {
        int[] scores = {1, 2, 3, 4};
        System.out.println("總和: " + sum(scores));
    }

    public static int sum(int[] arr) {
        int total = 0;
        for (int n : arr) total += n;
        return total;
    }
}
/* 執行結果：
總和: 10
*/