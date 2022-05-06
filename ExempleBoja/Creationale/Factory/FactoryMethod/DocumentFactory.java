package ExempleBoja.Creationale.Factory.FactoryMethod;

public class DocumentFactory {
    public static InterfataDocument creareDocument(TipDocument tipDocument, String titlu){
        //referinta obiect generat
        InterfataDocument document = null;

        //verificare tip document solicitat
        switch (tipDocument){
            case HTML:
                document = new DocumentHTML(titlu);
                document.setTitlu(titlu);
                break;
            case TEXT:
                document = new DocumentText();
                document.setTitlu(titlu);
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return document;
    }
}
