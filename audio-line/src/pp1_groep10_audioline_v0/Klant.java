package pp1_groep10_audioline_v0;

public class Klant
{
    private int id;
    private String naam;

    public Klant(int id, String naam)
    {
        this.id = id;
        this.naam = naam;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
    static void Uitlenen(){
        //code...
    }
}

