import java.util.List;
import java.util.Objects;


/**
 * Evalutor class to get statistics on a list of points
 * @author Aakash Vora
 */
public class Evalutor {


    private static Evalutor INSTANCE = null;

    
    /**
     * Private constructor for creating Evalutor
     */
    private Evalutor() {
    }


    /**
     * @return Instance of Evalutor object
     */
    public static Evalutor getInstance() {
        if(Objects.isNull(INSTANCE)) {
            INSTANCE = new Evalutor();
        }
        return INSTANCE;
    }


    /**
     * @param points List of points
     * @return Mean of the points
     */
    public int getStatistics(List<Integer> points) {
        int total = 0;
        for (Integer integer : points) {
            total+=integer;
        }
        return total/points.size();
    }
    
    
}
