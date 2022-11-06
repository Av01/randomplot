import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Source extends Observable {
    private List<Integer> list = new ArrayList<>();

    public List<Integer> getList() {
        return list;
    }

    public void updateData() {
        while(true) {
            list.add((int)(Math.random()*200));
            setChanged();
            notifyObservers();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }    
}
