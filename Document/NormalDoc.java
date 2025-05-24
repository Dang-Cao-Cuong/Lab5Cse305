public class NormalDoc extends Document {

    @Override
    public NormalDoc setExtension() {
        this.extension = ".txt";
        return this;
    }

    @Override
    public NormalDoc setEncryption() {
        this.encryption = "None";
        return this;
    }

    @Override
    public NormalDoc buildDoc() {
        System.out.println("Normal document created.");
        return this;
    }
}
