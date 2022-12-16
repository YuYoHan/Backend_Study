public class Array2 {
    public static void main(String[] args) {
        int sum = 0;
        double avg = 0f;

        int[] score = {100, 80, 99, 98};

        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        avg = sum / (double)score.length;

        System.out.println(sum);
        System.out.println(avg);

        int max = score[0];
        int min = score[0];

        for (int i = 1; i < score.length; i++) {
            if(score[i] > max) {
                max = score[i];
            } else if(score[i] < min) {
                min = score[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
