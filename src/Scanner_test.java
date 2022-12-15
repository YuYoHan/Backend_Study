import java.util.Scanner;

public class Scanner_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int num2 = 0;
        String name = "";
        String addr = "";


        System.out.println("-------입력-------");
        System.out.print("첫번째 정수 : ");
        num = sc.nextInt();

        System.out.print("두번째 정수 : ");
        num2 = sc.nextInt();

        System.out.println("이름을 입력하세요: ");
        name = sc.next();

        System.out.println("주소를 입력하세요: ");
        addr = sc.nextLine();
        addr = sc.nextLine();



        System.out.printf("첫번째 정수 : %d", num);
        System.out.printf("두번째 정수 : %d", num2);
        System.out.printf("이름 : %s", name);
        System.out.printf("주소 : %s", addr);

    }
}
