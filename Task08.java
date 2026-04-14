public class Task08 {
    public static void main(String[] args) {
        Student[] stList = new Student[3];
        stList[0] = new Student(); stList[0].name = "Tom"; stList[0].score = 85;
        stList[1] = new Student(); stList[1].name = "Mary"; stList[1].score = 90;
        stList[2] = new Student(); stList[2].name = "John"; stList[2].score = 78;

        for (Student s : stList) {
            System.out.println(s.name + ": " + s.score);
        }
    }
}

class Student {
    String name;
    int score;
}
/* 執行結果：
Tom: 85
Mary: 90
John: 78
*/