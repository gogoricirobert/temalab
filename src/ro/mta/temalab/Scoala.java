package ro.mta.temalab;

import java.util.ArrayList;

public class Scoala {
    private ArrayList<Elev> Elevi;
    private ArrayList<Profesori> Profesori;
    private String Name;
    public Scoala(String Name)
    {
        this.Name=Name;
        Elevi=new ArrayList<>();
        Profesori=new ArrayList<>();
    }
    public void addElev(Elev elev)
    {
        Elevi.add((elev)) ;
    }
    public void removeElev(Elev elev){Elevi.remove(elev);}
    public void addProfesori(Profesori profesori){Profesori.add(profesori);}
}
