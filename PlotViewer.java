import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;


/**
 * Component responsible for displaying plots
 * @author Aakash Vora
 */
public class PlotViewer extends JPanel implements Observer {


    private DrawPlot drawPlot;
    private List<Integer> points;


    /**
     * @param drawPlot The DrawPlot object to draw graph
     */
    public PlotViewer(DrawPlot drawPlot) {
        this.drawPlot = drawPlot;
        this.points = new ArrayList<>();
    }


    /* (non-Javadoc)
     * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
     * Uses drawPlot to draw the points
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawPlot.draw(g, points, getHeight(), getWidth(), 20);
    }


    /* (non-Javadoc)
     * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
     * Updates to list of points when the source generates a new points
     */
    @Override
    public void update(Observable o, Object arg) {
        this.points = ((Source) o).getList();
        paintComponent(getGraphics());
    }


}
