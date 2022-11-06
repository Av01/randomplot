import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class PlotViewer extends JPanel implements Observer {
    DrawPlot drawPlot;
    List<Integer> points;

    public PlotViewer(DrawPlot drawPlot) {
        this.drawPlot = drawPlot;
        this.points = new ArrayList<>();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawPlot.draw(g, points, getHeight(), getWidth(), 20);
    }

    @Override
    public void update(Observable o, Object arg) {
        this.points = ((Source) o).getList();
        paintComponent(getGraphics());
    }

}
