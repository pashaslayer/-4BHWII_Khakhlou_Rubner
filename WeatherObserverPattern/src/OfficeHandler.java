import java.util.List;

public abstract class OfficeHandler {

    public List<Subscriber> subscribers;

    public void addSubscription(Subscriber subscriber){
        this.subscribers.add(subscriber);
    }

    public void removeSubscription(Subscriber subscriber){
        this.subscribers.remove(subscriber);
    }

    public void sendData(Data data){
        for (Subscriber s : subscribers){
            s.getData(data);
        }
    }
}
