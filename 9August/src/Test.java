public class Test {
    public static void main(String[] args) throws Exception {
        try {
            System.out.println("In try");
            throw new Exception("Exception from try");
        } finally {
            System.out.println("In finally");
            throw new RuntimeException("Exception from finally"); // This overrides the one from try
        }
    }
}
