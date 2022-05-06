package ExempleBoja.Comportamentale.Observer;

public interface IStareConexiuneListener { //interfata comuna observer
    public void conexiunePierduta(String timestamp);
    public void conexiuneActiva();
}
