import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * Utils methods for adjusting plots according to the screen size
 * @author Aakash Vora
 */
public class Utils {


    /**
     * @param points List of the points
     * @param visibleCols Maximum number of visible columns
     * @return Truncates the list of points to number of visible columns
     */
    public static List<Integer> truncatePoints(List<Integer> points, int visibleCols) {
        int nPoints = points.size();
        return points.subList(Math.max(0, nPoints-visibleCols-1),Math.max(0,nPoints-1));
    }


    /**
     * @param points List of the points
     * @param height Maximum height of the component
     * @return Scale the value of the point according the height of the component
     */
    public static List<Integer> resizePoints(List<Integer> points, int height) {
        if(points.isEmpty()) return points;
        else {
            List<Integer> resizedPoints = new ArrayList<>();
            int maxVal = Collections.max(points);
            for (int i = 0; i < points.size(); i++) {
                resizedPoints.add(height - (int)(points.get(i) * ((float)height/maxVal)));
            }
            return resizedPoints;
        }
    }


    /**
     * @param width Maximum width of the component
     * @param visibleCols Maximum number of visible columns
     * @return List of value on which points can be placed horizontally
     */
    public static List<Integer> getXList(int width, int visibleCols) {
        List<Integer> xList = new ArrayList<>();
        int colWidth = width / visibleCols;
        int x = 0;
        while (x <= width) {
            xList.add(x);
            x+=colWidth;
        }
        return xList;
    }


}
