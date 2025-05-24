public class DocumentClient {
    public static void main(String[] args) {
        try {
            String savePath = "Document";
            Document NormalDoc = new NormalDoc("text", "This is a text");
            NormalDoc.save(savePath);
            Document confidentialDoc = new EncryptDoc("text", "This is not a text ?");
            confidentialDoc.save(savePath);

            System.out.println("Documents saved successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
