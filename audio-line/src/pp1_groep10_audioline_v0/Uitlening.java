package pp1_groep10_audioline_v0;

import java.util.List;

public class Uitlening {
    private int uitleen_id;
    private List<Materiaal> materiaalList;
    private Betaling betaling;
    private Levering levering;
    private String notities;


    static void Bestellen(){
        //code...
    }

    public int getItem_id() {
        return uitleen_id;
    }

    public void setItem_id(int item_id) {
        this.uitleen_id = item_id;
    }


    public String getNotities() {
        return notities;
    }

    public void setNotities(String notities) {
        this.notities = notities;
    }

    public List<Materiaal> getMateriaalList() {
        return materiaalList;
    }

    public void setMateriaalList(List<Materiaal> materiaalList) {
        this.materiaalList = materiaalList;
    }

    public Betaling getBetaling() {
        return betaling;
    }

    public void setBetaling(Betaling betaling) {
        this.betaling = betaling;
    }

    public Levering getLevering() {
        return levering;
    }

    public void setLevering(Levering levering) {
        this.levering = levering;
    }
}
