public class T3 {
    public static void main(String[] args) {
        //Create a 2D array or integer type where you will store odd and even numbers.
        // Develop a program which will identify/print the even numbers only.
        int[][] numbers2D = {
                {2, 5, 8},
                {4, 6, 3},
                {1, 7, 13}
        };
        System.out.println("Even Numbers:");
        for (int[] row : numbers2D) {
            for (int num : row) {
                if (num % 2 == 0) {
                    System.out.print(num + " ");

                }
            }
        }
    }
}
