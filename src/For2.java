import java.util.Scanner;

public class For2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String[] menu = new String[] {"햄버거 2000원", "감자튀김 500원","콜라 1000원", "주문하기"};
        int[] money = {2000, 500, 1000, 0};		// 여기에 있는것이 위에있는 배열에 저장
        int[] a = new int[5];
        int price = 0;

        System.out.println("==== 주문메뉴 ====");
        System.out.println("1." + menu[0]);
        System.out.println("2." + menu[1]);
        System.out.println("3." + menu[2]);
        System.out.println("4." + menu[3]);

        for(int count = 0; count <5; count++) {
            if(count < 5) {				// 5 밑으로만 가능하게 조건을 넣어준것임
                System.out.print("주문 메뉴를 선택하세요: ");
                int me = sc.nextInt();
                if(me == 1) {
                    System.out.println("주문 메뉴 출력 " + menu[0]);
                    price = price + 2000;
                    System.out.printf("주문 금액 : %d원\n", price);
                    System.out.printf("남은 횟수 : %d번\n", 5 - count );
                } else if(me ==2) {
                    System.out.println("주문 메뉴 출력 " + menu[1]);
                    price = price + 500;
                    System.out.printf("주문 금액 : %d원\n", price);
                    System.out.printf("남은 횟수 : %d번\n", 5 - count );
                } else if(me ==3) {
                    System.out.println("주문 메뉴 출력 " + menu[2]);
                    price = price + 1000;
                    System.out.printf("주문 금액 : %d원\n", price);
                    System.out.printf("남은 횟수 : %d번\n", 5 - count );
                } else if(me == 4) {
                    break;
                }



            }
        }
        System.out.printf("총 결제 금액은 %d원 입니다." , price);
    }
}
