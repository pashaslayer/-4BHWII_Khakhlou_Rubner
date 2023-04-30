public class User1 implements Subscriber{
    @Override
    public void getData(Data data) {
        System.out.println("Der User 1 hat folgende Werte bekommen: " + data.getData());
    }
}
