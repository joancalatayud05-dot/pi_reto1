package com.jc;

import java.util.ArrayList;

public class Periodico {
    private ArrayList<Noticia> noticias;
    private int numNoticias;

    public Periodico() {
        this.noticias = new ArrayList<>();
        this.numNoticias = 0;
    }

    public void insertar(Noticia n) {
        if (numNoticias < 1000) {
            noticias.add(n);
            numNoticias++;
        }
    }

    public Noticia primeraNoticia(int d, int m, int a) {
        for (int i = 0; i < numNoticias; i++) {
            Noticia n = noticias.get(i);
            if (n.igualFecha(d, m, a)) {
                return n;
            }
        }
        return null;
    }

    public void masPopulares() {
        if (numNoticias == 0) {
            System.out.println("No hay noticias.");
            return;
        }

        int maxLecturas = 0;
        for (int i = 0; i < numNoticias; i++) {
            if (noticias.get(i).getLecturas() > maxLecturas) {
                maxLecturas = noticias.get(i).getLecturas();
            }
        }

        for (int i = 0; i < numNoticias; i++) {
            if (noticias.get(i).getLecturas() == maxLecturas) {
                System.out.println(noticias.get(i));
            }
        }
    }

    public void borrarAnteriores(int d, int m, int a) {
        int fechaLimite = a * 10000 + m * 100 + d;
        for (int i = numNoticias - 1; i >= 0; i--) {
            if (noticias.get(i).getFecha() < fechaLimite) {
                noticias.remove(i);
                numNoticias--;
            }
        }
    }
}