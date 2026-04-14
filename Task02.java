public class Task02 {
    public static void main(String[] args) {
        int[] scores = {70, 80, 90};
        System.out.println("最大值: " + findMax(scores));
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int n : arr) if (n > max) max = n;
        return max;
    }
}
/* 執行結果：
最大值: 90
*/