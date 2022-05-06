package ExempleBoja.Creationale.Factory.FactoryMethod;

import javax.print.Doc;

public class DocumentHTML extends InterfataDocument{

    public DocumentHTML(String titlu){
        this.setTitlu(titlu);
    }

    @Override
    public String getTip() {
        return "Document HTML";
    }

    @Override
    public void print(String text) {
        System.out.println("<html>"+text+"</html>");
    }
}
