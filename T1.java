public class T1 {
    public static void main(String[] args) {
      //Create a program that uses an array to store a list of temperatures for a week,
      // and then uses a loop to find the highest and lowest temperature for the week.
        int[] temperatures = {68, 72, 73, 75, 62, 67, 71};
        int maxTemp = temperatures[0];
        int minTemp = temperatures[0];
        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] > maxTemp) {
                maxTemp = temperatures[i];            }
            if (temperatures[i] < minTemp) {
                minTemp = temperatures[i];

            }
        }
        System.out.println("Highest temperature for the week: " + maxTemp + "°F");
        System.out.println("Lowest temperature for the week: " + minTemp + "°F");

    }
}
