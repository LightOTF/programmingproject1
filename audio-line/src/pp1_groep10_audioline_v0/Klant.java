package pp1_groep10_audioline_v0;

import java.util.Date;

public class Klant
{
    private int id;
    private String naam;
    private String address;
    private String email;
    private Date vervoegDatum;
    private String telnr;

    public Klant(int id, String naam)
    {
        this.id = id;
        this.naam = naam;
    }

    static void Uitlenen(){
        //code...
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getVervoegDatum() {
        return vervoegDatum;
    }

    public void setVervoegDatum(Date vervoegDatum) {
        this.vervoegDatum = vervoegDatum;
    }

    public String getTelnr() {
        return telnr;
    }

    public void setTelnr(String telnr) {
        this.telnr = telnr;
    }
}

