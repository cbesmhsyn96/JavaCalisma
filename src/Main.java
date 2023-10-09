public class Main {
    public static void main(String[] args) {
        DBManagement dbManagement = new DBManagement(new DB2selected());
        dbManagement.deleteData();
    }
}
