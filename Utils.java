import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Utils {
    public static List<Integer> truncatePoints(List<Integer> points, int visibleCols) {
        int nPoints = points.size();
        return points.subList(Math.max(0, nPoints-visibleCols-1),Math.max(0,nPoints-1));
    }

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
