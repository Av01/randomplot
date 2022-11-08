import java.util.ArrayList;
import java.util.List;
import java.util.Observable;


/**
 * Continuously generates new points
 * @author Aakash Vora
 */
public class Source extends Observable {


    private List<Integer> list = new ArrayList<>();


    /**
     * Generates a new random point at an interval of every 1 secs
     */
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
    
    
    public List<Integer> getList() {
        return list;
    }


}
