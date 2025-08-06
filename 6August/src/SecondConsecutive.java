public class SecondConsecutive {
    public static void main(String[] args) {
        String str = "gekssszz";
        int maxCount = 1;
        int currentCount = 1;
        char maxElement = str.charAt(0);
        char currentElement = str.charAt(0);
        int secondCount = 1;
        char secondElement = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == str.charAt(i)) {
                currentCount++;
            } else {
                currentElement = str.charAt(i);
                currentCount = 1;
            }

                if(currentCount > secondCount)
                {
                    secondElement = maxElement;
                    secondCount = maxCount;
                    if (currentCount > maxCount) {
                        maxElement = currentElement;
                        maxCount = currentCount;
                }

            }
        }


        System.out.println(maxCount +" "+maxElement);
        System.out.println(secondCount +" "+secondElement);
    }
}
