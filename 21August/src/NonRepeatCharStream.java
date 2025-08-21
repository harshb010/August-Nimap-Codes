public class NonRepeatCharStream {
    public static void main(String[] args) {
        String str = "swiss";
        Character c = str.chars()
                .mapToObj(x -> (char) x)
                .filter(y -> str.indexOf(y) == str.lastIndexOf(y)).findFirst().get();
        System.out.println(c);
    }
}
