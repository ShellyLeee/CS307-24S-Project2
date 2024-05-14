package cs307.cs30724springproject2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


@Component
public class DeskTopGUI extends JFrame {

    @Autowired
    private BackEndAPIService backEndAPIService; // 后端服务，后续修改为分配到各个子界面


    private JButton loadButton1;
    private JButton loadButton2;
    private JButton loadButton3;
    private JButton loadButton4;

    public void init(){
        setTitle("Menu");
        setSize(600, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        loadButton1 = new JButton("Modify lines/stations");  // to API 1-3
        loadButton2 = new JButton("Search station"); // to API 4
        loadButton3 = new JButton("Board & exit");  // to API 5-6
        loadButton4 = new JButton("View onboard passengers"); // to API 7

        loadButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ModificationGUI m = new ModificationGUI();
                m.setVisible(true);
            }
        });

        loadButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SearchStationGUI s = new SearchStationGUI();
                s.setVisible(true);
            }
        });

        loadButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BoardExitGUI b = new BoardExitGUI();
                b.setVisible(true);
            }
        });

        loadButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ViewPassengerGUI v = new ViewPassengerGUI();
                v.setVisible(true);
            }
        });
    }
}
