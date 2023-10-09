public class Main {
    public static void main(String[] args) {
        DB1selected db1selected = new DB1selected();
        DBManagment dbManagment = new DBManagment(db1selected);
        dbManagment.getData();
        dbManagment.setData();
        dbManagment.updateData();
    }
}
