import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class IdCard {

    private final RfidChip aRfidChip;

    /**
     * Creates a new IdCard and encrypts the code
     * @param code whole code with FLF number plate identifier
     */
    public IdCard(String code, String owner, SecretKey key) throws Exception{
        aRfidChip = new RfidChip();
        Cipher encryptCipher = Cipher.getInstance("DES");
        encryptCipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] utf8 = code.getBytes(StandardCharsets.UTF_8);
        byte[] enc = encryptCipher.doFinal(utf8);
        byte[] encString = Base64.getDecoder().decode(enc);
        aRfidChip.setaEncryptedString(new String(encString));
    }

    public String getaEncryptedString() {
        return aRfidChip.getaEncryptedString();
    }
}
