public class Task09 {
    public static void main(String[] args) {
        Student tom = new Student();
        tom.name = "Tom";
        tom.score = 85;
        updateScore(tom, 95);
        System.out.println("更新後 - " + tom.name + ": " + tom.score);
    }

    public static void updateScore(Student s, int newScore) {
        s.score = newScore;
    }
}

class Student {
    String name;
    int score;
}
/* 執行結果：
更新後 - Tom: 95
*/