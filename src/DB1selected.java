import java.sql.SQLOutput;

public class DB1selected extends DBSelect{
    @Override
    public void getData() {
        System.out.println("get data DB1selected");
    }

    @Override
    public void setData() {
        System.out.println("set data DB1selected");
    }

    @Override
    public void updateData() {
        System.out.println("update data DB1selected");
    }
}
