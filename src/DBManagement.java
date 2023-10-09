public class DBManagement implements IDatabase{
    DBSelect dbSelect;
    public DBManagement(DBSelect dbSelect){
        this.dbSelect = dbSelect;
    }

    @Override
    public void getData() {
        this.dbSelect.getData();
    }

    @Override
    public void addData() {
        this.dbSelect.addData();
    }

    @Override
    public void deleteData() {
        this.dbSelect.deleteData();
    }

    @Override
    public void updateData() {
        this.dbSelect.updateData();
    }
}
