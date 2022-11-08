import java.awt.Graphics;
import java.util.List;
import java.util.Objects;


/**
 * Decorator for creating adding new feature to the plot
 * @author Aakash Vora
 */
public class DecoratorPlot extends DrawPlot {


    protected DrawPlot component;


    /**
     * @param plot Adds the class you want to decorate
     */
    public void addComponent(DrawPlot plot) {
        component = plot;
    }


    /* (non-Javadoc)
     * @see DrawPlot#draw(java.awt.Graphics, java.util.List, int, int, int)
     */
    @Override
    public void draw(Graphics g, List<Integer> points, int height, int width, int visibleCols) {
        if (Objects.nonNull(component)) {
            component.draw(g, points, height, width, visibleCols);
        } 
    }
    
    
}
