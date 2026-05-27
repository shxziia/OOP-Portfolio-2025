public class Password implements Encryptable {
    @Override
    public String encrypt(String input) {
        StringBuilder encrypted = new StringBuilder(input);
        return encrypted.reverse().toString();
    }

    @Override
    public String decrypt(String input) {
        StringBuilder decrypted = new StringBuilder(input);
        return decrypted.reverse().toString();
    }
}

