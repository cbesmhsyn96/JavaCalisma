public class DB2selected extends DBSelect implements IDatabase{
    @Override
    public void getData() {
        System.out.println("db2 get Data");
    }

    @Override
    public void addData() {
        System.out.println("db2 add Data");
    }

    @Override
    public void deleteData() {
        System.out.println("db2 delete Data");
    }

    @Override
    public void updateData() {
        System.out.println("db2 update Data");
    }
}
