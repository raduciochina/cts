package Exemple.Builder.Varianta3;

import Exemple.Builder.Varianta2.PetrecereBuilder;

public class Petrecere {
    private int nrPersoane;
    private boolean areBaloane;
    private boolean areTort;
    private boolean areArtificii;

    //constructor privat
    private Petrecere() {

    }
    //getteri numai
    public int getNrPersoane() {
        return nrPersoane;
    }

    public boolean isAreBaloane() {
        return areBaloane;
    }

    public boolean isAreTort() {
        return areTort;
    }

    public boolean isAreArtificii() {
        return areArtificii;
    }

    //toString()
    @Override
    public String toString() {
        return "Petrecere [nrPersoane=" + nrPersoane + ", areBaloane=" + areBaloane + ", areTort=" + areTort
                + ", areArtificii=" + areArtificii + "]";
    }

    //inner Builder class
    public static class PetrecereBuilder implements IBuilder{
        private Petrecere petrecere;

        public PetrecereBuilder(){
            this.petrecere = new Petrecere();
        }

        public PetrecereBuilder setNrPersoane(int nrPersoane) {
            this.petrecere.nrPersoane = nrPersoane;
            return this;
        }

        public PetrecereBuilder setAreBaloane(boolean areBaloane) {
            this.petrecere.areBaloane = areBaloane;
            return this;
        }

        public PetrecereBuilder setAreTort(boolean areTort) {
            this.petrecere.areTort = areTort;
            return this;
        }

        public PetrecereBuilder setAreArtificii(boolean areArtificii) {
            this.petrecere.areArtificii = areArtificii;
            return this;
        }

        @Override
        public Petrecere build() {
            return this.petrecere;
        }
    }

    public static PetrecereBuilder builder() {
        return new PetrecereBuilder();
    }


}
