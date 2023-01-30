import Pasta.Pasta;

public class Main {
    public static void main(String[] args) {
        pastaType();
    }

    public static void pastaType(){

        Pasta pasta = new Pasta(5, 27 , "String", "spaghetti");
        System.out.println(pasta.cookMethod(null));

        Pasta p1 = new Pasta(3, 7, "twirly", "Fusilli");
        System.out.println(p1.cookMethod(null));

        Pasta p2 = new Pasta();
        System.out.println(p2.cookMethod(null));

        Pasta p3 = new Pasta(5, 5, "round", "square");
        System.out.println(p3.cookMethod(null));

    }

}