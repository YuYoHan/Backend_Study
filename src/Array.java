import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // 랜덤 숫자구현
        int[] numArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        // Arrays.toString은 배열을 문자열로 출력하는 방법
        System.out.println(Arrays.toString(numArr));

        for (int i = 0; i < numArr.length; i++) {
            // (int)는 형변환
            // * 10은 자신이 원하는 숫자 개수를 랜덤 숫자로 뽑아내려고 할 때 아무 숫자나 정하면 됨
            int n = (int) (Math.random() * 10);
            // numArr 첫번째 값을 tmp라는 빈칸에 넣고
            int tmp = numArr[i];
            // numArr 무작의 값을 [i]에 넣고
            numArr[i] = numArr[n];
            // tmp에 넣었던 첫번째 값을 [n]에 넣어줌
            numArr[n] = tmp;
        }
        System.out.println(Arrays.toString(numArr));
    }
}
