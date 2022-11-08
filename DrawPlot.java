import java.awt.Graphics;
import java.util.List;


/**
 * Abstract class for functionally of drawing plot
 * @author Aakash Vora
 */
public abstract class DrawPlot {

    /**
     * @param g Graphics object to draw plot
     * @param points List of points to plot
     * @param height Height of the plot
     * @param width Width of the plot
     * @param visibleCols Number of visible columns in the plot
     */
    public abstract void draw(Graphics g, List<Integer> points, int height, int width, int visibleCols);

    
}
