import encriptadores.EncriptadorPrimero;
import encriptadores.EncriptadorSegundo;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
public class EncriptatorTest {
  EncriptadorNaive encriptador;
  EncriptadorSegundo encriptadorSegundo;
  EncriptadorPrimero encriptadorPrimero;
  String textoDesencriptado;

  @BeforeTest
  public void setUp() {
    encriptador = new EncriptadorNaive();
    encriptadorPrimero = new EncriptadorPrimero();
    encriptador.setEncriptador(encriptadorPrimero);
    textoDesencriptado = "i like tenis";

  }

  @Test
  public void encriptar() {
    String expected = encriptador.encriptar(textoDesencriptado);
    assertEquals("o loki tinos",expected);
  }


}
