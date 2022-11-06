import java.util.List;
import java.util.Objects;

public class Evalutor {
    private static Evalutor INSTANCE = null;
    
    private Evalutor() {
    }

    public static Evalutor getInstance() {
        if(Objects.isNull(INSTANCE)) {
            INSTANCE = new Evalutor();
        }
        return INSTANCE;
    }

    public int getStatistics(List<Integer> points) {
        int total = 0;
        for (Integer integer : points) {
            total+=integer;
        }
        return total/points.size();
    }
    
}
