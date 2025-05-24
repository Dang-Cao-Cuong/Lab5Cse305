import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class EncryptDoc implements Document {
    private String name;
    private String content;
    private static final String AES_KEY = "1234567890123456"; 
    public EncryptDoc(String name, String content) {
        this.name = name;
        this.content = content;
    }

    @Override
    public void save(String directoryPath) throws Exception {
        FileOutputStream fos = new FileOutputStream(directoryPath + "/" + name + ".zip");
        ZipOutputStream zos = new ZipOutputStream(fos);
        ZipEntry entry = new ZipEntry(name + ".txt");
        zos.putNextEntry(entry);

        SecretKey secretKey = new SecretKeySpec(AES_KEY.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);

        CipherOutputStream cos = new CipherOutputStream(zos, cipher);
        cos.write(content.getBytes());
        cos.flush();
        cos.close();
        zos.closeEntry();
        zos.close();
    }
}
