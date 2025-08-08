public class StreamDemo {
    public static void main(String[] args) {
        String str = "Hello";
        String string = str.chars().mapToObj(x -> (char) x).toList().reversed().toString();
        System.out.println(string);
    }
}
