public class Task05 {
    public static void main(String[] args) {
        Student tom = new Student();
        tom.name = "Tom";
        tom.score = 55;
        curve(tom);
        System.out.println("調分後 - " + tom.name + ": " + tom.score);
    }

    public static void curve(Student s) {
        if (s.score < 60) s.score += 10;
    }
}

class Student {
    String name;
    int score;
}
/* 執行結果：
調分後 - Tom: 65
*/