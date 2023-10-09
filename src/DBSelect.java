public class DBSelect implements IDatabase{
    @Override
    public void getData() {
        System.out.println("select db get Data");
    }

    @Override
    public void addData() {
        System.out.println("select db add Data");
    }

    @Override
    public void deleteData() {
        System.out.println("select db delete Data");
    }

    @Override
    public void updateData() {
        System.out.println("select db update Data");
    }
}
