public class Secret implements Encryptable {
        private static final int SHIFT = 3;  // Caesar Cipher shift

        @Override
        public String encrypt(String input) {
            StringBuilder encrypted = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (Character.isLetter(c)) {
                    char shifted = (char) (c + SHIFT);
                    encrypted.append(shifted);
                } else {
                    encrypted.append(c);
                }
            }
            return encrypted.toString();
        }

        @Override
        public String decrypt(String input) {
            StringBuilder decrypted = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (Character.isLetter(c)) {
                    char shifted = (char) (c - SHIFT);
                    decrypted.append(shifted);
                } else {
                    decrypted.append(c);
                }
            }
            return decrypted.toString();
        }
    }



