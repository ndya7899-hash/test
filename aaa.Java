public class aaa {
    public static void main(String[] args) {
        // --- 1. 計算平均值 ---
        int[] scores1 = {70, 80, 90};
        double avg = 0;
        for (int s : scores1) avg += s;
        System.out.println("1. 計算平均分數");
        System.out.println("平均值: " + (avg / scores1.length));
        System.out.println();

        // --- 2. 尋找最大值 ---
        int[] scores2 = {70, 80, 90};
        System.out.println("2. 尋找最大值");
        System.out.println("最大值: " + findMax(scores2));
        System.out.println();

        // --- 3. 陣列元素加 5 分 ---
        int[] scores3 = {60, 70};
        addBonus(scores3);
        System.out.println("3. 陣列元素加分");
        System.out.print("結果: {");
        for (int i = 0; i < scores3.length; i++) {
            System.out.print(scores3[i] + (i == scores3.length - 1 ? "" : ", "));
        }
        System.out.println("}");
        System.out.println();

        // --- 4. 建立並印出 Student 物件 ---
        Student tom4 = new Student();
        tom4.name = "Tom";
        tom4.score = 85;
        System.out.println("4. 建立並印出學生物件");
        System.out.println(tom4.name + ": " + tom4.score);
        System.out.println();

        // --- 5. 條件式調分 (不及格加10分) ---
        Student tom5 = new Student();
        tom5.name = "Tom";
        tom5.score = 55;
        curve(tom5);
        System.out.println("5. 條件式調分 (55分加分後)");
        System.out.println(tom5.name + ": " + tom5.score);
        System.out.println();

        // --- 6. 統計及格人數 ---
        int[] scores6 = {45, 60, 80, 59, 100};
        int passCount = 0;
        for (int s : scores6) if (s >= 60) passCount++;
        System.out.println("6. 統計及格人數");
        System.out.println("及格人數: " + passCount);
        System.out.println();

        // --- 7. 陣列元素加總 ---
        int[] scores7 = {1, 2, 3, 4};
        System.out.println("7. 陣列元素總和");
        System.out.println("總和: " + sum(scores7));
        System.out.println();

        // --- 8. 印出學生物件陣列 ---
        Student[] students = new Student[3];
        students[0] = new Student(); students[0].name = "Tom"; students[0].score = 85;
        students[1] = new Student(); students[1].name = "Mary"; students[1].score = 90;
        students[2] = new Student(); students[2].name = "John"; students[2].score = 78;
        System.out.println("8. 印出學生物件陣列");
        for (Student s : students) {
            System.out.println(s.name + ": " + s.score);
        }
        System.out.println();

        // --- 9. 更新特定學生分數 ---
        Student tom9 = new Student();
        tom9.name = "Tom";
        tom9.score = 85;
        updateScore(tom9, 95);
        System.out.println("9. 更新特定學生分數 (85改95)");
        System.out.println(tom9.name + ": " + tom9.score);
        System.out.println();

        // --- 10. 尋找最小值 ---
        int[] scores10 = {70, 85, 62, 90, 58};
        int min = scores10[0];
        for (int s : scores10) if (s < min) min = s;
        System.out.println("10. 尋找最小值");
        System.out.println("最小值: " + min);
    } // main 方法結束

    // 各題目要求的方法
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int n : arr) if (n > max) max = n;
        return max;
    }

    public static void addBonus(int[] scores) {
        for (int i = 0; i < scores.length; i++) scores[i] += 5;
    }

    public static void curve(Student s) {
        if (s.score < 60) s.score += 10;
    }

    public static int sum(int[] arr) {
        int total = 0;
        for (int n : arr) total += n;
        return total;
    }

    public static void updateScore(Student s, int newScore) {
        s.score = newScore;
    }
} // aaa 類別結束

class Student {
    String name;
    int score;
} // Student 類別結束