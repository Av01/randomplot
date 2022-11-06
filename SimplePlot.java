import java.awt.Color;
import java.awt.Graphics;
import java.util.List;

public class SimplePlot extends DrawPlot {


    @Override
    public void draw(Graphics g, List<Integer> points, int height, int width, int visibleCols) {
        List<Integer> xList = Utils.getXList(width,visibleCols);
        List<Integer> trucatedPoints = Utils.truncatePoints(points, visibleCols);
        List<Integer> resizedPoints = Utils.resizePoints(trucatedPoints, height);
        for (int i = 0; i < resizedPoints.size()-1; i++) {
            g.setColor(Color.BLUE);
            int x1 = xList.get(i);
            int y1 = resizedPoints.get(i);
            int x2 = xList.get(i+1);
            int y2 = resizedPoints.get(i+1);
            g.drawLine(x1, y1, x2, y2);
        }
        if (!resizedPoints.isEmpty()) {
            int y = Evalutor.getInstance().getStatistics(resizedPoints);
            g.setColor(Color.RED);
            g.drawLine(0, y, width, y);
        }
    }

    
}
