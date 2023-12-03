public class T2 {
    public static void main(String[] args) {
      //Create an array of integer values.
     // After the array is created, calculate the sum of all stored elements in that array.
        int[] numbers = {2, 6, 12, 24, 7, 13};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        System.out.println("The sum of all the elements in the array is: " + sum);

    }

}
