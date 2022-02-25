import javax.crypto.Cipher;
import javax.crypto.SecretKey;

public class DesCipher {

    Cipher eCipher;
    Cipher dCipher;

    DesCipher(SecretKey key) throws Exception{
        eCipher = Cipher.getInstance("DES");
        dCipher = Cipher.getInstance("DES");
    }
}
