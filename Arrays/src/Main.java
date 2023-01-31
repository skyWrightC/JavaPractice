public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] oneToTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < oneToTen.length; i++) {
            oneToTen[i] = i * 2;
        }

        for (int i = 0; i < oneToTen.length; i++) {
            System.out.println(i + ":" + oneToTen[i]);
        }
    }
}