import java.io.FileWriter;
import java.io.IOException;

public class NormalDoc implements Document {
    private String name;
    private String content;

    public NormalDoc(String name, String content) {
        this.name = name;
        this.content = content;
    }

    @Override
    public void save(String directoryPath) throws IOException {
        FileWriter writer = new FileWriter(directoryPath + "/" + name + ".txt");
        writer.write(content);
        writer.close();
    }
}
