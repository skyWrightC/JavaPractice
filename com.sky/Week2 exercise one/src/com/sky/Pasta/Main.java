package com.sky.Pasta;

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

        Pasta[] pastas = {p1, p2, p3, new Pasta(3,5,"triangle", "tortellini2")};

        for(int i = 0; i < pastas.length; i++){
            System.out.println(i + ":" + pastas[i].cookMethod(null));
        }
        for (Pasta p :pastas
             ) {
            System.out.println(p.cookMethod(null));
        }


    }
}