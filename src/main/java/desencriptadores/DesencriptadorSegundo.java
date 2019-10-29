package desencriptadores;

import texto.MapeadorDeCaracteres;

import java.util.Arrays;

public class DesencriptadorSegundo implements Desencriptador {

  @Override
  public String desencriptar(String textoEncriptado) {
    //convert string [n, n2, n3...n] to array
    String codigos = formatString(textoEncriptado);
    int[] posiciones = convertStringToArray(codigos);
   //
    StringBuilder desencriptado = new StringBuilder();
    for (int i = 0; i < posiciones.length; i++) {
      desencriptado.append(MapeadorDeCaracteres
              .getCharacterFomPos(posiciones[i]));
    }
    return desencriptado.toString();
  }



  private static String formatString(String textoEncriptado) {
    return textoEncriptado.replaceAll("\\[|\\]|\\s", "").trim();
  }

  // split return an array, Arrays.stream return an stream
  private static int[] convertStringToArray(String textoEncriptado) {
    return Arrays.stream(textoEncriptado.split(","))
            .map(String::trim).mapToInt(Integer::parseInt).toArray();
  }
}
