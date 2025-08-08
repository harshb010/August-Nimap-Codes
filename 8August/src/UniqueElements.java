public class UniqueElements {
    public static void main(String[] args) {
        int[] arr = {4, 5, 4, 6, 7, 5, 8, 8 ,8, 9, 4, 5, 6};

        System.out.println("Unique elements are:");
        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            // Count occurrences of arr[i]
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
