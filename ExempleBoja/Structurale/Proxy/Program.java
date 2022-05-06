package ExempleBoja.Structurale.Proxy;

public class Program {
    public static void main(String[] args) {

        //fara Proxy
        ModulLogin modulLogin = new ModulLogin("admin", "1234");
        String[] dictionarParole = new String[] {"123456", "1222", "admin", "root", "1234"};

        for(String parola : dictionarParole){
            System.out.println("Incerc "+ parola);
            if(modulLogin.login("admin", parola)) {
                System.out.println("Am gasit parola");
            }
        }

        //cu Proxy
        ProxyModulLogin proxy = new ProxyModulLogin(modulLogin);
        for(String parola : dictionarParole){
            System.out.println("Incerc "+ parola);
            if(proxy.login("admin", parola)) {
                System.out.println("Am gasit parola");
            }
        }

    }
}
