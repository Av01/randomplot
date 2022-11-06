import java.awt.Color;
import java.awt.Graphics;
import java.util.List;

public class BarPlot extends DecoratorPlot {

    @Override
    public void draw(Graphics g, List<Integer> points, int height, int width, int visibleCols) {
        super.draw(g, points, height, width, visibleCols);
        List<Integer> xList = Utils.getXList(width, visibleCols);
        List<Integer> trucatedPoints = Utils.truncatePoints(points, visibleCols);
        List<Integer> resizedPoints = Utils.resizePoints(trucatedPoints, height);
        for (int i = 0; i < resizedPoints.size(); i++) {
            g.setColor(Color.GRAY);
            g.fillRect(xList.get(i), resizedPoints.get(i), 3, height - resizedPoints.get(i));
        }
        
    }
}
