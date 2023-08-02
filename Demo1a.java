package Demot;

import java.util.ArrayList;

public class Demo1a {
    public static void main(String[] args) {
    }
}

class Esiintyja {
    protected String nimi;
    protected String erikoisala;
    protected double palkkio;
}


class Asiakas {
    protected String nimi;
    protected String kayttajaTunnus;
    protected String salasana;
}


class Tilaisuus {
    protected String osoite;
    protected String tyyppi;
    protected boolean onEsiintyja;
}

class Varaus {
    Esiintyja esiintyja;
    Asiakas asiakas;
    Tilaisuus tilaisuus;
}


class EsiintyjatTilaisuuksiin {
    ArrayList<Esiintyja> esiintyjat;
    ArrayList<Asiakas> asiakkaat;
    ArrayList<Tilaisuus> tilaisuudet;
    ArrayList<Varaus> varaukset;
}

