public class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening the Excel Document");
    }

    @Override
    public void save() {
        System.out.println("Saving the Excel Document");
    }
}