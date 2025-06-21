public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening the Word Document");
    }

    @Override
    public void save() {
        System.out.println("Saving the Word Document");
    }
}