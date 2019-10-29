package desencriptadores;

import texto.MapeadorDeCaracteres;

import java.util.ArrayList;

public class DesencriptadorPrimero implements Desencriptador{
  ArrayList<Character> vocales = MapeadorDeCaracteres.getVocales();

  @Override
  public String desencriptar(String textoEncriptado) {
    StringBuilder textoDesencriptado = new StringBuilder();
    for (int i = 0; i < textoEncriptado.length();i++) {
      char character = textoEncriptado.charAt(i);
      if (vocales.contains(character)) {
        textoDesencriptado
                .append(vocales.get(MapeadorDeCaracteres.getShiftedCharacterForDecryption(character)));
      } else {
        textoDesencriptado.append(character);
      }
    }
    return textoDesencriptado.toString();
  }


}
