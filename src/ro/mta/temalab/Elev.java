package ro.mta.temalab;

public class Elev {
    private String name;
    private String prenumme;
    int varsta;
    int clasa;
    public Elev(String name,String prenumme,int varsta,int clasa)
    {
        this.name=name;
        this.prenumme=prenumme;
        this.varsta=varsta;
        this.clasa=clasa;
    }

   public void afisare()
    {
       String mesaj="Elevul "+ this.name+" "+ this.prenumme+" este in clasa "+this.clasa +" si are varsta "+this.varsta;
       System.out.println(mesaj);
    }
}
