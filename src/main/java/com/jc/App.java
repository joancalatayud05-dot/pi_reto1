package com.jc;

public class App {

    public static void main(String[] args) {
        Periodico periodico = new Periodico();

        System.out.println("=== PRUEBA 1: CREAR NOTICIAS ===");
        Noticia n1 = new Noticia(20211030, 1005, "Noticia sobre economía");
        Noticia n2 = new Noticia(20211101, 830, "Noticia sobre deportes");
        Noticia n3 = new Noticia(20211030, 1200, "Noticia sobre cultura");
        n1.incLecturas();
        n1.incLecturas();
        n2.incLecturas();
        System.out.println("Noticias creadas correctamente");

        System.out.println("=== PRUEBA 2: INSERTAR ===");
        periodico.insertar(n1);
        periodico.insertar(n2);
        periodico.insertar(n3);
        System.out.println("Noticias insertadas");

        System.out.println("=== PRUEBA 3: PRIMERA NOTICIA ===");
        Noticia encontrada = periodico.primeraNoticia(30, 10, 2021);
        if (encontrada != null) {
            System.out.println(encontrada);
        } else {
            System.out.println("No se encontró ninguna noticia con esa fecha.");
        }

        System.out.println("=== PRUEBA 4: MÁS POPULARES ===");
        periodico.masPopulares();

        System.out.println("=== PRUEBA 5: BORRAR ANTERIORES ===");
        periodico.borrarAnteriores(1, 11, 2021);
        System.out.println("Noticias tras borrar anteriores al 1/11/2021:");
    }
}