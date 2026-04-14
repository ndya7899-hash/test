public class Task06 {
    public static void main(String[] args) {
        int[] scores = {45, 60, 80, 59, 100};
        int count = 0;
        for (int s : scores) if (s >= 60) count++;
        System.out.println("及格人數: " + count);
    }
}
/* 執行結果：
及格人數: 3
*/