public class StringDemo {
    public static void main(String[] args) {
        String str = "Bread Butter and bread and tea";
        str = str.toLowerCase();
        String currentWord = "";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
            {
                currentWord = currentWord + str.charAt(i);
            }
            System.out.println(currentWord);
        }
    }
}
