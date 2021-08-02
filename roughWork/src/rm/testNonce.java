package rm;

import java.security.SecureRandom;

public class testNonce {

	public static void main(String[] args) {
		byte[] nonce = new byte[16];
        new SecureRandom().nextBytes(nonce);
        testNonce tn = new testNonce();
        System.out.println(tn.generateRandomNonce());

	}
	
    private String generateRandomNonce() {
    	byte[] nonce = new byte[16];
        new SecureRandom().nextBytes(nonce);
    	// util to print bytes in hex
        StringBuilder result = new StringBuilder();
        for (byte temp : nonce) {
            result.append(String.format("%02x", temp));
        }
        return result.toString();
    }
}
