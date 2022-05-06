package ExempleManolache.factory;

public class RestApiDevelopment implements RestAPI {
    RestApiDevelopment(){}

    @Override
    public void connect() {
        System.out.println("Connecting to the development server");
    }
}
