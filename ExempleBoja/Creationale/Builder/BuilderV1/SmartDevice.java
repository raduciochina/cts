package ExempleBoja.Creationale.Builder.BuilderV1;

public class SmartDevice {

    //atribute
    String model;
    String producator;
    boolean areWifi;

    //interfete pt diferite module
    InterfataGPS modulGPS;
    InterfataDisplay display;
    InterfataExternalMemory cardMemorie;

    //constructor default privat -mandatory
    private SmartDevice(){

    }

    //interfata publica pt atribute
    //doar getteri fara setteri!
    public boolean hasWifi(){
        return areWifi;
    }
    public InterfataGPS getModulGPS(){
        return modulGPS;
    }
    public InterfataExternalMemory getCardMemorie() {
        return cardMemorie;
    }

    public InterfataDisplay getDisplay() {
        return display;
    }
    public String getModel(){
        return model;
    }
    public String getProducator(){
        return producator;
    }

    //builder pentru clasa - interna
    public static class SmartDeviceBuilder{
        private SmartDevice dispozitiv; //referinta la dispozitivul mobil

        public SmartDeviceBuilder(String model, String producator){
            this.dispozitiv = new SmartDevice();

            this.dispozitiv.producator = producator; //zona obligatorie
            this.dispozitiv.model = model; //zona obligatorie
        }

        //metoda pt adaugare WiFi (zona optionala)
        public SmartDeviceBuilder adaugaWifi(){
            this.dispozitiv.areWifi = true;
            return this; //returneaza referinta catre builder
        }
        //metoda pt adaugare display (zona optionala)
        public SmartDeviceBuilder adaugaDisplay(InterfataDisplay display){
            this.dispozitiv.display = display;
            return this;
        }
        //metoda pt adaugare memorie (zona optionala)
        public SmartDeviceBuilder adaugaMemorie(InterfataExternalMemory memorie){
            this.dispozitiv.cardMemorie = memorie;
            return this;
        }
        //metoda pt adaugare gps (zona optionala)
        public SmartDeviceBuilder adaugaGPS(InterfataGPS gps){
            this.dispozitiv.modulGPS = gps;
            return this;
        }

        //metoda prin care se obtine obiectul nou creat
        public SmartDevice build(){
            return this.dispozitiv;
        }

    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "model='" + model + '\'' +
                ", producator='" + producator + '\'' +
                ", areWifi=" + areWifi +
                ", modulGPS=" + modulGPS +
                ", display=" + display +
                ", cardMemorie=" + cardMemorie +
                '}';
    }
}



















