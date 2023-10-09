public class DB1selected extends DBSelect implements IDatabase{
    @Override
    public void getData() {
        System.out.println("db1 get Data");
    }

    @Override
    public void addData() {
        System.out.println("db1 add Data");
    }

    @Override
    public void deleteData() {
        System.out.println("db1 delete Data");
    }

    @Override
    public void updateData() {
        System.out.println("db1 update Data");
    }
}
