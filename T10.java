public class T10 {
    public static void main(String[] args) {
      //Write a program to print out duplicate elements from an Array of Strings?
        String[] array = {"Volvo", "Mercedes","Volvo", "Audi", "Opel", "Opel", "Buick", "Kia"};
        System.out.println("Duplicate elements in the array are:");
        boolean found=false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    if (!found) {
                        System.out.print(array[j]);
                        found = true;
                    } else {
                        System.out.print(", " + array[j]);
                    }
                }
            }
        }
        if (!found) {
            System.out.print("No duplicates found");        }
        System.out.println();
    }
}