import java.awt.Color;
import java.awt.Graphics;
import java.util.List;


/**
 * Decorator for creating plot with squares
 * @author Aakash Vora
 */
public class SquarePlot extends DecoratorPlot {


    /* (non-Javadoc)
     * @see DrawPlot#draw(java.awt.Graphics, java.util.List, int, int, int)
     * Decorates a plot by marking a square on the point
     */
    @Override
    public void draw(Graphics g, List<Integer> points, int height, int width, int visibleCols) {
        super.draw(g, points, height, width, visibleCols);
        List<Integer> xList = Utils.getXList(width, visibleCols);
        List<Integer> trucatedPoints = Utils.truncatePoints(points, visibleCols);
        List<Integer> resizedPoints = Utils.resizePoints(trucatedPoints, height);
        for (int i = 0; i < resizedPoints.size(); i++) {
            g.setColor(Color.BLUE);
            g.fillRect(xList.get(i), resizedPoints.get(i), 10, 10);
        } 
    }

    
}
