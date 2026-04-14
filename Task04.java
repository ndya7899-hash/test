public class Task04 {
    public static void main(String[] args) {
        Student tom = new Student();
        tom.name = "Tom";
        tom.score = 85;
        System.out.println(tom.name + ": " + tom.score);
    }
}

class Student {
    String name;
    int score;
}
/* 執行結果：
Tom: 85
*/