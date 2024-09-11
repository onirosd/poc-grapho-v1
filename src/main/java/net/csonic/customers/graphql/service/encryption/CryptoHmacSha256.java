package net.csonic.customers.graphql.service.encryption;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
// import java.io.UnsupportedEncodingException;
import java.security.Key;
import java.security.spec.KeySpec;
import java.util.Base64;

@Service
public class CryptoHmacSha256 implements ICryptoHmacSha256 {
    private final Cipher cipher;
    private final Key key;
    private final IvParameterSpec iv;

    public CryptoHmacSha256(
            @Value("${encryption.iv}") String ivString,
            @Value("${encryption.pass}") String password,
            @Value("${encryption.salt}") String salt) {
        try {
            cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            iv     = new IvParameterSpec(ivString.getBytes("UTF-8"));
            key    = generateKey(password, salt);
        } catch (Exception e) {
            throw new RuntimeException("Error initializing CryptoService", e);
        }
    }

    @Override
    public String encrypt2(String input) {
        try {
            cipher.init(Cipher.ENCRYPT_MODE, key, iv);
            byte[] encryptedVal = cipher.doFinal(input.getBytes("UTF-8"));
            return Base64.getEncoder().encodeToString(encryptedVal);
        } catch (Exception e) {
            throw new RuntimeException("Error encrypting data", e);
        }
    }

    @Override
    public String decrypt2(String encrypted) {
        try {
            byte[] decodedValue = Base64.getDecoder().decode(encrypted);
            cipher.init(Cipher.DECRYPT_MODE, key, iv);
            byte[] decValue = cipher.doFinal(decodedValue);
            return new String(decValue, "UTF-8");
        } catch (Exception e) {
            throw new RuntimeException("Error decrypting data", e);
        }
    }

    private Key generateKey(String password, String salt) throws Exception {
        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
        char[] passwordChars = password.toCharArray();
        byte[] saltBytes = salt.getBytes("UTF-8");

        KeySpec spec = new PBEKeySpec(passwordChars, saltBytes, 65536, 256);
        SecretKey tmp = factory.generateSecret(spec);
        return new SecretKeySpec(tmp.getEncoded(), "AES");
    }
}
