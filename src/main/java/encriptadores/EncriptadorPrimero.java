package encriptadores;


import texto.MapeadorDeCaracteres;

import java.util.ArrayList;

public class EncriptadorPrimero implements Encriptador {
  ArrayList<Character> vocales = MapeadorDeCaracteres.getVocales();

  public EncriptadorPrimero() {
  }


  public String encriptar(String texto) {

    String encriptado ="";
    for (int i = 0; i < texto.length(); i++) {
      char character = texto.charAt(i);
      if (vocales.contains(character)) {
        encriptado += vocales.get(MapeadorDeCaracteres.getShiftedCharacterForEncryption(character));
      }
      else
        encriptado += character;
    }
    return encriptado;
  }

  private int getShiftedCharacter(Character letra) {
    return (vocales.indexOf(letra) ==
          vocales.size()-1) ? 0 : vocales.indexOf(letra) + 1;

  }


}
