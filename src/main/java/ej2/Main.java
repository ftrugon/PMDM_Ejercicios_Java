package ej2;

public class Main {


    public static void main(String[] args) {

        int energia = 80;
        String estado;

        if (energia > 50) {
            estado = "Personaje fuerte";
        } else estado = "Personaje débil";

        System.out.printf(estado);

    }

}