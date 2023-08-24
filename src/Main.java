public class Main {
    public static void main(String[] args) {
        String str = "Задача из билета №3 в курсовой работе";

        final int mid = str.length() / 2;
        String first = str.substring(0, mid);
        String second = str.substring(mid);

        System.out.println(first);
        System.out.println(second);

    }
}