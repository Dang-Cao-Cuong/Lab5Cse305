public abstract class Document {
    protected String extension;
    protected String encryption;

    public abstract Document setExtension();
    public abstract Document setEncryption();
    public abstract Document buildDoc();

    @Override
    public String toString() {
        return "Document{" +
                "extension='" + extension + '\'' +
                ", encryption='" + encryption + '\'' +
                '}';
    }
}
