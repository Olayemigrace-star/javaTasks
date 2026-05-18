public class SecondsConverter {

    public static void main(String[] args) {

        int result = convert(30); 
        System.out.print("Seconds: " + result);
    }

    // This method takes minutes and returns seconds
    public static int convert(int minutes) {
        int seconds = minutes * 60;
        return seconds;
    }
}

