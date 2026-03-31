abstract class Document
{
    protected String name;
    public Document(String name)
    {
        this.name=name;
    }
    abstract void save();
    abstract void close();
    abstract void open();
}
class TextDocument extends Document{
    public TextDocument(String name)
    {
        super(name);
    }
    public void open() {
        System.out.println("Opening text document: " + name);
    }
    public void save() {
        System.out.println("Saving text content");
    }
    public void close() {
        System.out.println("Closing text document");
    }
}
class ImageDocument extends Document {

    public ImageDocument(String name) {
        super(name);
    }
    public void open() {
        System.out.println("Rendering image: " + name);
    }
    public void save() {
        System.out.println("Saving image file");
    }
    public void close() {
        System.out.println("Closing image document");
    }
}
class SpreadsheetDocument extends Document {

    public SpreadsheetDocument(String name) {
        super(name);
    }
    public void open() {
        System.out.println("Opening spreadsheet: " + name);
    }
    public void save() {
        System.out.println("Saving spreadsheet with calculations");
    }
    public void close() {
        System.out.println("Closing spreadsheet");
    }
}
class DocumentFactory {
    public static Document createDocument(String type, String name) {

        if (type.equalsIgnoreCase("TEXT")) {
            return new TextDocument(name);
        } else if (type.equalsIgnoreCase("IMAGE")) {
            return new ImageDocument(name);
        } else if (type.equalsIgnoreCase("SPREADSHEET")) {
            return new SpreadsheetDocument(name);
        }
                throw new IllegalArgumentException("Unknown document type");
    }
}
public class DocumentDesign {
    public static void main(String[] args) {

        Document doc1 = DocumentFactory.createDocument("TEXT", "file1.txt");
        doc1.open();
        doc1.save();
        doc1.close();

        Document doc2 = DocumentFactory.createDocument("IMAGE", "img.png");
        doc2.open();
    }
}