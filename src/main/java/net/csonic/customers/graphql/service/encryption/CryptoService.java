package net.csonic.customers.graphql.service.encryption;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;



@Service
public class CryptoService implements ICryptoService{
    private final Cipher cipher;
    private final SecretKey key;
    private final IvParameterSpec iv;
    // private SecretKey key = new SecretKeySpec("12345678901234561234567890123456".getBytes(),  "AES");
    // private IvParameterSpec iv = new IvParameterSpec("1234567890123456".getBytes());

    public CryptoService(

            @Value("${encryption.key}") String keyString,
            @Value("${encryption.iv}") String ivString) {
        try {
            cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            key = new SecretKeySpec(keyString.getBytes(), "AES");
            iv = new IvParameterSpec(ivString.getBytes());
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new RuntimeException(e);
        }
    }



    @Override
    public String encrypt(String input) throws InvalidAlgorithmParameterException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {

        cipher.init(Cipher.ENCRYPT_MODE, key, iv);
        byte[] cipherText = cipher.doFinal(input.getBytes());
        return Base64.getEncoder()
                .encodeToString(cipherText);
    }

    @Override
    public String decrypt(String cipherText) throws InvalidAlgorithmParameterException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {

        cipher.init(Cipher.DECRYPT_MODE, key, iv);
        byte[] plainText = cipher.doFinal(Base64.getDecoder()
                .decode(cipherText));
        return new String(plainText);
    }
}
