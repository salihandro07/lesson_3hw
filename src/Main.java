public class Main {
    public static void main(String[] args) {

        double[] array = {8, 5, -6, 13, -9, -3, 1, 7, -1, 12, -15, 21, 2, -4, 9};

        int sumPositiveNumbers = 0;
        int countPositiveNumbers = 0;

        boolean foundNegative = false;

        for (double num : array) {
            if (foundNegative) {
                if (num > 0) {
                    sumPositiveNumbers += num;
                    countPositiveNumbers++;
                }
            } else if (num < 0) {
                foundNegative = true;
            }
        }

        String averagePositive = (sumPositiveNumbers + "/" + countPositiveNumbers);
        System.out.println("Среднее арифметическое положительных чисел после первого отрицательного числа: "
                + averagePositive);
    }
}