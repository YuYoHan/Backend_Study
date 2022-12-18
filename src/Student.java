public class Student {
    String name;
    int eng;
    int kor;

    public Student() {
        name = "";
        eng = 0;
        kor =0;
    }

    public Student(String name, int eng, int kor) {
        this.name = name;
        this.eng = eng;
        this.kor = kor;
    }

    public void printName() {
        System.out.println("학생의 이름은 " + name + "입니다.");
    }

    public void printScore() {
        System.out.println("영어 점수는 " +eng + "점 입니다.");
        System.out.println("국어 점수는 " +kor + "점 입니다.");
    }

    public void printInfo() {
        double avg = 0f;
        int sum = 0;
        sum = eng + kor;
        avg = (eng + kor) / sum;
        System.out.printf("이름은 %s이고, 평균은 %f점 입니다.", name, avg);
    }
}
