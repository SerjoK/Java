package com.company;

public class Main {
    public static void main(String[] args) {
        byte num = 23;
        int num_1 = 1;

        float num_2 = 23.45f;
        double num_3 = 234.222222222;

        boolean Ittur = true;
        System.out.println(Ittur);
        String str = "Привет Полина";
        System.out.println(str);

        double gallons = 25;
        double liters = gallons * 3.7854;// в этой переменной хранится значение, // выражающее объем жидкости в галлонах douЫe liters; // в этой переменной хранится значение,
// выражающее объем жидкости в литрах
        if (gallons == 25) System.out.println(gallons + " галлонам соответствует " + liters + " литров");


    }
}

class IfDemo {
    public static void main(String[] args) {
                int a, b, c;
                a = 2;
                b = 3;
                if (a < b) System.out.println("а меньше б");
            }
}

class Galonn {
    public static void main(String[] args) {
        double gallons, liters;
        int counter;
        counter = 0;
        for (gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854;
            System.out.println(gallons + " галлонам соответствует " +
                    liters + " liters.");
            counter++;
            if (counter == 10)
                System.out.println();
            counter = 0;


        }
    }
}

class Count {
    public static void main(String[] args) {
        int count;
        for(count = 1; count < 8; count++)
            System.out.println("Счетчик " + count);
        System.out.println("Готово");
    }
}

class iffor {
    public static void main(String[] args) {
        double i, j, d;
        i = 5;
        j = 10;
        if(i != 1){
            System.out.println("i не равнно 1");
            d = j / i;
            System.out.println("j / i равно " + d);
        }
    }
}

class GalontolitTable {
    public static void main(String[] args){

    }
}







