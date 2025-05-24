public class Client {

    public Document newDocument(Document builder) {
        return builder.setExtension()
                .setEncryption()
                .buildDoc();
    }

    public static void main(String[] args) {
        Client client = new Client();

        NormalDoc normalDoc = new NormalDoc();
        Document builtNormalDoc = client.newDocument(normalDoc);
        System.out.println(builtNormalDoc);

        ConfidentialDoc confidentialDoc = new ConfidentialDoc();
        Document builtConfidentialDoc = client.newDocument(confidentialDoc);
        System.out.println(builtConfidentialDoc);

    }
}
