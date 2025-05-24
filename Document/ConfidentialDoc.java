public class ConfidentialDoc extends Document {

    @Override
    public ConfidentialDoc setExtension() {
        this.extension = ".zip";
        return this;
    }

    @Override
    public ConfidentialDoc setEncryption() {
        this.encryption = "AES";
        return this;
    }

    @Override
    public ConfidentialDoc buildDoc() {
        System.out.println("Confidential document created and encrypted.");
        return this;
    }
}
