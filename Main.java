import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class Main implements ActionListener {
    static Source source = new Source();


    public static void main(String[] args) {
        JFrame mainFrame = new JFrame();
        mainFrame.setSize(500, 1200);
        mainFrame.setLayout(new GridLayout(4,1));
        DrawPlot simplePlot = new SimplePlot();
        SquarePlot squarePlot = new SquarePlot();
        squarePlot.addComponent(simplePlot);
        BarPlot barPlot = new BarPlot();
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
