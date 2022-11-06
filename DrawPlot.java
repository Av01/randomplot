import java.awt.Graphics;
import java.util.List;

public abstract class DrawPlot {

    public abstract void draw(Graphics g, List<Integer> points, int height, int width, int visibleCols);


    
}
