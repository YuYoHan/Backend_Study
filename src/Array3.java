public class Array3 {
    public static void main(String[] args) {
        int[][] score = {
                {100, 80, 90},
                {90, 60,98},
                {70, 40, 75}
        };

        int sum = 0;

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.printf("score[%d][%d] = %d\n", i, j, score[i][j]);
                sum += score[i][j];
            }
        }
        System.out.println("sum = " + sum);

    }
}
