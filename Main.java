import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;


/**
 * Handles creating of GUI and serves as an entry-point
 * @author Aakash Vora
 */
public class Main implements ActionListener {


    private static Source source = new Source();


    /**
     * The entrypoint to the program
     * @param args Command-line argument
     */
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame();
        GridLayout layout = new GridLayout(4,1);
        mainFrame.setSize(500, 1200);
        mainFrame.setLayout(layout);
        DrawPlot simplePlot = new SimplePlot();
        DecoratorPlot squarePlot = new SquarePlot();
        squarePlot.addComponent(simplePlot);
        DecoratorPlot barPlot = new BarPlot();
        barPlot.addComponent(squarePlot);
        PlotViewer plot1 = new PlotViewer(barPlot);
        PlotViewer plot2 = new PlotViewer(squarePlot);
        plot2.setBackground(Color.LIGHT_GRAY);
        PlotViewer plot3 = new PlotViewer(simplePlot);
        plot3.setBackground(Color.GRAY);
        mainFrame.add(plot1);
        mainFrame.add(plot2);
        mainFrame.add(plot3);
        JButton button = new JButton("Run");
        mainFrame.add(button);
        button.addActionListener(new Main());
        source.addObserver(plot1);
        source.addObserver(plot2);
        source.addObserver(plot3);
        mainFrame.setVisible(true);    
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        source.updateData();
    }


}
