package com.company;
//23-24.04
class KlasycznaKlasa {
    int p, d;
    static int sdp, sdd;
    KlasycznaKlasa(int p)
    {
        System.out.println(p);
        this.p = p;
    }

    KlasycznaKlasa(int p, int d)
    {
        this(p);
        System.out.println(p + " " + d);
        this.d = d;
    }

    static
    {
        System.out.println("static {}");
        sdp = sdd = 1;
    }

}

public class Main {
    public static void main(String[] args) {

        KlasycznaKlasa WywołanaKlasa = new KlasycznaKlasa(2, 5);

    }
}