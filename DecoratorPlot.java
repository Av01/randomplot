import java.awt.Graphics;
import java.util.List;
import java.util.Objects;

public class DecoratorPlot extends DrawPlot {
    protected DrawPlot component;

    public void addComponent(DrawPlot plot) {
        component = plot;
    }

    @Override
    public void draw(Graphics g, List<Integer> points, int height, int width, int visibleCols) {
        if (Objects.nonNull(component)) {
            component.draw(g, points, height, width, visibleCols);
        } 
    }
    
}
