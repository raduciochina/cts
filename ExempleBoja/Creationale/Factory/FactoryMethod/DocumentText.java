package ExempleBoja.Creationale.Factory.FactoryMethod;

public class DocumentText extends InterfataDocument {
    @Override
    public String getTip() {
        return "Txt";
    }

    @Override
    public void print(String text) {
        System.out.println("Text: "+text);
    }
}
