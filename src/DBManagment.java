public class DBManagment extends DBSelect{
    DBSelect dbSelect;
    public DBManagment(DBSelect dbSelect){
        this.dbSelect = dbSelect;
    }

    @Override
    public void getData() {
        this.dbSelect.getData();
    }

    @Override
    public void setData() {
        this.dbSelect.setData();
    }

    @Override
    public void updateData() {
        this.dbSelect.updateData();
    }
}
