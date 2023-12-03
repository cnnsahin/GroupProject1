public class T8 {
    public static void main(String[] args) {
        //Maximum and minimum number in the array?
        int[] numbers = {52, 62, 3, 12, 9, 113};
        int max = numbers[0];
        int min = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println("Maximum number in the array: " + max);
        System.out.println("Minimum number in the array: " + min);
    }
}
