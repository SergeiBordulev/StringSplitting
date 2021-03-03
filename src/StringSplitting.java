public class StringSplitting {
    public static void main(String[] args) {
        String string = "1, 2, 31, 4, 5";
        int sum = 0;

        String[] stringsArray = string.split(", ");

        for (String s : stringsArray) {
            sum += Integer.parseInt(s);
        }

        System.out.println("The figure total: " + sum);
    }
}
