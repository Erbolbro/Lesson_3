
public class Main {
    public static void main(String[] args) {
        double[] numbers = {2.5, 1.7, 3.6, 5.5, -6.6, 7.7, 2.5, 1.7, 3.6, 5.5, 6.6, 7.6, -3.5, -7.8, -6.5};
        int count = 0;
        double sum = 0;
        boolean b = false;
        for (double num : numbers) {
            if (num < 0) {
                b = true;
            } else if (b) {
                sum += num;
                count++;
            }
        }
        double average = sum / count;
        System.out.println("Среднее арифметическое положительных чисел - " + average);
    }
}