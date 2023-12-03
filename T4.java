public class T4 {
    public static void main(String[] args) {
//Create a 2D array of integers.
// Develop a program which will calculate the sum of even and odd numbers for that array.
int [][] numbers2D ={
        {2,5,8,},
        {12,7,9},
        {1,11,15}
};
        int evenSum=0;
        int oddSum =0;
        for (int[] row: numbers2D) {
            for (int num:row) {
                if (num %2==0){
                    evenSum+=num;
                }else {
                    oddSum+=num;
                }
            }
        }
        System.out.println("Sum of even numbers in the array: " + evenSum);
        System.out.println("Sum of odd numbers in the array: " + oddSum);
    }
}


