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

        //System.out.println(oneToTen[999]); //there is no index at 999 so it breaks

        String[] names = {"Corey", "Jamie", "Steve"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(i + ":" + names[i]);
        }

        for (String name : names) System.out.println(name);


    //    strings As char arrays accessing the first character.
    String name = "Corey";
    System.out.println(name.charAt(0));
    }
}