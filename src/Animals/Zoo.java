package Animals;

import java.util.ArrayList;

public class Zoo {
    ArrayList<Animale> animali;

    public Zoo() {
        this.animali = new ArrayList<>();
    }

    public void suonaVerso(Animale a){
        if (a instanceof Cane){
            for (int i = 0; i < 3; i++) {
                System.out.println(a.verso());
            }
        }
        else if (a instanceof Gatto){
            for (int i = 0; i < 2; i++) {
                System.out.println(a.verso());
            }
        }
    }

    public ArrayList<Animale> getAnimali() {
        return animali;
    }

    public void setAnimali(ArrayList<Animale> animali) {
        this.animali = animali;
    }

    public void aggiungiAnimale(Animale a){
        this.animali.add(a);
    }

    public void rimuoviAnimale(Animale a){
        this.animali.remove(a);
    }

    public String stampaAnimali(){
        return animali.toString();
    }

    public String confrontaAnimali(Animale a, Animale b){
        if (a.getPeso() > b.getPeso()){
            return "L'animale con il peso maggiore \u00E8" + a;
        }
        else return b.toString();
    }
}
