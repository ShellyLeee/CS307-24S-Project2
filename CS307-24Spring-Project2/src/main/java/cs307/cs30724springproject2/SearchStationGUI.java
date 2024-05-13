package cs307.cs30724springproject2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchStationGUI extends JFrame {
    private JButton searchButton;
    private JTextField startStationField;
    private JTextField directionField;
    private JTextField distanceField;

    public SearchStationGUI() {
        setTitle("Search stations");
        setSize(450, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        startStationField = new JTextField(10);
        directionField = new JTextField(10);
        distanceField = new JTextField(5);

        searchButton = new JButton("Search");
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 搜索与呈现结果
            }
        });

        add(new JLabel("StartStation"), BorderLayout.NORTH);
        add(startStationField);
        add(new JLabel("Direction"), BorderLayout.CENTER);
        add(directionField);
        add(new JLabel("Distance"), BorderLayout.SOUTH);
        add(distanceField);
        add(searchButton, BorderLayout.SOUTH);

    }
}
