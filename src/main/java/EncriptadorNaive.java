import desencriptadores.Desencriptador;
import encriptadores.Encriptador;

public class EncriptadorNaive {
  private Encriptador encriptador;


  public Encriptador getEncriptador() {
    return encriptador;
  }

  public void setEncriptador(Encriptador encriptador) {
    this.encriptador = encriptador;
  }



  public String encriptar(String texto) {
    return encriptador.encriptar(texto);
  }


}
