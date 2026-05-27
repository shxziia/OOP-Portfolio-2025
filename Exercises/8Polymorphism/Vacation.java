public class Vacation {
    public static void main(String[] args) {

        Encryptable secret = new Secret();
        Encryptable password = new Password();

        String secretMessage = "HelloSecret";
        System.out.println("Original Secret Message: " + secretMessage);
        String encryptedSecret = secret.encrypt(secretMessage);
        System.out.println("Encrypted Secret (Caesar Cipher): " + encryptedSecret);
        String decryptedSecret = secret.decrypt(encryptedSecret);
        System.out.println("Decrypted Secret (Caesar Cipher): " + decryptedSecret);

        String passwordMessage = "HelloPassword";
        System.out.println("\nOriginal Password Message: " + passwordMessage);
        String encryptedPassword = password.encrypt(passwordMessage);
        System.out.println("Encrypted Password (Reverse): " + encryptedPassword);
        String decryptedPassword = password.decrypt(encryptedPassword);
        System.out.println("Decrypted Password (Reverse): " + decryptedPassword);
    }
}

