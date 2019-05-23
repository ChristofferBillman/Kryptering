public abstract class Model {
    /**
     *
     * @param character char to be encrypted.
     * @param key key to encrypt with.
     * @return returns encrypted char.
     */
    public static int encryptChar(char character, char key) {
        int encryption = (key ^ character);
        return encryption;
    }

    /**
     *
     * @param string String to be encrypted/decrypted.
     * @param key The key to used to encrypt/decrypt the string.
     * @param encrypt Specifies if it should encrypt or decrypt. True is encrypt, false is decrypt.
     * @return Encrypted string.
     */

    public static int[] cryptString(String string, String key, boolean encrypt) {
        int[] array = new int[string.length()];
            for (int i = 0; string.length() > i; i++) {
                array[i] = encryptChar(string.charAt(i), key.charAt(i));
            }
        return array;
    }
    public static String decryptString(int[] crypt, String key) {
        int[] array = new int[crypt.length];
        for (int i = 0; crypt.length > i; i++) {
            array[i] = decryptChar(crypt[i], key.charAt(i));
        }
    }

    /**
     *
     */
    public void encryptFile() {

    }

    /**
     *
     * @param encryption Already encrypted char.
     * @param key The key used to encrypt the original char.
     * @return returns the original char.
     */
    public static String decryptChar(char encryption, char key) {
        String character = (encryption ^ key);
        return character;
    }
    public void decryptFile() {

    }
}
