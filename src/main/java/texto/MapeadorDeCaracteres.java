package texto;

import java.util.ArrayList;
import java.util.Arrays;

public class MapeadorDeCaracteres {
  private static final ArrayList<Character> VOCALES =
          new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
  private static final ArrayList<Character> ABCD =
          new ArrayList<>(Arrays.asList(' ','a','b','c','d','e','f',
                  'g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'));

  public static ArrayList<Character> getVocales() {
    return VOCALES;
  }

  public static ArrayList<Character> getAbcd() {
    return ABCD;
  }

  private static int getMappedPosPrivate(Character character) {
    return ABCD.indexOf(character);
  }

  public static int getMappedPos(Character character) {
    return getMappedPosPrivate(character);
  }

  public static Character getCharacterFomPos(int pos) {
    return getAbcd().get(pos);
  }

  private static int getShiftedCharacterForEncryptionPrivate(Character letra) {
    return (VOCALES.indexOf(letra) ==
            VOCALES.size()-1) ? 0 : VOCALES.indexOf(letra) + 1;
  }

  public static int getShiftedCharacterForEncryption(Character letra) {
    return getShiftedCharacterForEncryptionPrivate(letra);
  }

  private static int getShiftedCharacterForDecryptionPrivate(Character letra) {
    return (VOCALES.indexOf(letra) ==
            0) ? VOCALES.size()-1 : VOCALES.indexOf(letra) -1;
  }

  public static int getShiftedCharacterForDecryption(Character letra) {
    return getShiftedCharacterForDecryptionPrivate(letra);
  }
}
