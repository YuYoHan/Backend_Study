import java.util.Scanner;

public class For1 {
    public static void main(String[] args) {
        // 자바에서 구구단 구하기
        for (int i =2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }

        Scanner sc = new Scanner(System.in);
        int num = 0;
        int num2 = sc.nextInt();

        if(num <= 100) {
            for (int i = 0; i < num2; i++) {
                num += i;
            }
            System.out.println("1에서 정하신 숫자까지의 총합은 " + num + "입니다.");
        }


    }
}
