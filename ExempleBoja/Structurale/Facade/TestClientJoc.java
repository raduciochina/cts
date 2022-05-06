package ExempleBoja.Structurale.Facade;

public class TestClientJoc {
    public static void main(String[] args) {
        //acces forum - fara facade
        Login login = new Login();
        login.login("Test", "1234");

        ForumJoc forum = new ForumJoc();
        Profil profil = new Profil();
        ConexiuneBD conexiuneBD = new ConexiuneBD();
        conexiuneBD.connect();
        profil.display();
        conexiuneBD.disconnect();

        //modificarea setarilor jocului - fara facade
        Login login2 = new Login();
        login2.login("Test", "1234");
        ConexiuneBD conexiuneBD2 = new ConexiuneBD();
        conexiuneBD2.connect();
        CaracterJoc caracterJoc = new CaracterJoc();
        conexiuneBD2.disconnect();

        // prin Facade -> simplificare utilizare set de actiuni si reguli
        FacadeAPIJoc.accesForum("test", "1234");
        FacadeAPIJoc.setariJoc("test","1234");
    }
}
