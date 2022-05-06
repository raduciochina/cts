package Exemple.Prototype;

import java.util.ArrayList;

public abstract class AContract {
    private String id;
    protected String tip;
    protected ArrayList<String> listaClauze;

    abstract void printare();

    public void modificaListaClauze(int i, String clauzaNoua){
        listaClauze.set(i, clauzaNoua);
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getTip() {
        return tip;
    }
    public ArrayList<String> getListaClauze() {
        return listaClauze;
    }

    @Override
    public String toString() {
        return "AContract [id=" + id + ", tip=" + tip + ", listaClauze=" + listaClauze + "]";
    }

    public AContract clone(){
        Object clone = null;
        try{
            clone = super.clone();
        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return (AContract) clone;
    }
}
