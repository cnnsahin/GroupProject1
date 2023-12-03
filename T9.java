public class T9 {
    public static void main(String[] args) {
        //Write a java program to find the second largest number in the array?
        int[] numbers = {5, 8, 3, 12, 7, 10};
        int firstLargest;
        int secondLargest;
        if (numbers[0] > numbers[1]) {
            firstLargest = numbers[0];
            secondLargest = numbers[1];
        } else {
            firstLargest = numbers[1];
            secondLargest = numbers[0];
        }
        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = numbers[i];
            } else if (numbers[i] > secondLargest && numbers[i] != firstLargest) {
                secondLargest = numbers[i];            }        }
        System.out.println("Second largest number in the array: " + secondLargest);
    }
    }

