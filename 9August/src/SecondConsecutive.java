public class SecondConsecutive {
    public static void main(String[] args) {
        String str = "aahrrsshaaaal";

        char maxChar = str.charAt(0);
      //  char Currentchar = str.charAt(0);
        int count = 1;
        int maxCount = 1;
        char secondMax = str.charAt(0);
        int secondCount = 1;
        for(int i=0;i<str.length()-1;i++)
        {
            if(str.charAt(i)==str.charAt(i+1))
            {
                count++;
            }else {
     //           Currentchar = str.charAt(i);
                count = 1;
            }

            if(count > maxCount)
            {
                secondCount = maxCount;
                maxCount = count;
                secondMax = maxChar;
                maxChar = str.charAt(i);
            }
        }
        System.out.println(maxChar+" "+maxCount);
        System.out.println(secondMax+" "+secondCount);

    }
}
