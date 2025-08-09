public class LongestConsecutive {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 3, 4, 4, 5, 6, 6, 6, 1, 4, 4};
        int maxElement = arr[0];
        int maxCount = 1;
        int currentCount = 1;
        int currentElement = arr[0];

        for(int i=1;i< arr.length;i++)
        {
            if(arr[i]==currentElement)
            {
                currentCount++;
            }else {
                currentCount = 1;
                currentElement = arr[i];
            }

            if(currentCount>maxCount)
            {
                maxCount = currentCount;
                maxElement = currentElement;
            }

        }
        System.out.println(maxCount+" "+maxElement);

    }
}
