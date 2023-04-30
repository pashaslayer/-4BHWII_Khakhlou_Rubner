public class User2 implements Subscriber{

    @Override
    public void getData(Data data) {
        System.out.println("Der User 2 hat folgende Werte bekommen: " + data.getData());
    }
}
