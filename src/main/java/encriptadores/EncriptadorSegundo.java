package encriptadores;

import texto.MapeadorDeCaracteres;

import java.util.ArrayList;

public class EncriptadorSegundo implements Encriptador {

  @Override
  public String encriptar(String texto) {
    ArrayList<Integer> encriptado = new ArrayList<>();
    for (int i = 0; i < texto.length(); i++) {
      char character = texto.charAt(i);
      encriptado.add(MapeadorDeCaracteres.getMappedPos(character));
    }
    return encriptado.toString();
  }


}
