package pp1_groep10_audioline_v0;

import java.util.Date;

public class Levering {
    private int id;
    private String leveringsadres;
    private String tracking_url;
    private Date leveringsdatum;

    public String getLevering_adres() {
        return leveringsadres;
    }

    public void setLevering_adres(String levering_adres) {
        this.leveringsadres = levering_adres;
    }

    public String getTracking_url() {
        return tracking_url;
    }

    public void setTracking_url(String tracking_url) {
        this.tracking_url = tracking_url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getLeveringsdatum() {
        return leveringsdatum;
    }

    public void setLeveringsdatum(Date leveringsdatum) {
        this.leveringsdatum = leveringsdatum;
    }
}
