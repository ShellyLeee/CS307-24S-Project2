package cs307.cs30724springproject2.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModificationGUI extends JFrame {

    private JButton ModifyStation;
    private JButton ModifyLine;
    private JButton ModifyLineStation;
    private JTextField stationNameCn;
    private JTextField stationNameEn;
    private JTextField stationDistrict;
    private JTextField stationIntro;
    private JTextField lineName;
    private JTextField lineStartTime;
    private JTextField lineEndTime;
    private JTextField lineIntro;
    private JTextField lineMileage;
    private JTextField lineOpening;
    private JTextField lineColor;
    private JTextField lineURL;

    public ModificationGUI() {
        setTitle("Modify lines/stations");
        setSize(1080, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        ModifyStation = new JButton("Modify Station");
        ModifyLine = new JButton("Modify Line");
        ModifyLineStation = new JButton("Modify Line Station");

        stationNameCn = new JTextField(10);
        stationNameEn = new JTextField(10);
        stationDistrict = new JTextField(5);
        stationIntro = new JTextField(50);

        lineName = new JTextField(10);
        lineStartTime = new JTextField(10);
        lineEndTime = new JTextField(10);
        lineIntro = new JTextField(50);
        lineMileage = new JTextField(5);
        lineOpening = new JTextField(10);
        lineColor = new JTextField(5);
        lineURL = new JTextField(20);

        ModifyStation.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //修改station操作
            }
        });

        ModifyLine.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //修改line操作
            }
        });

        ModifyLineStation.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
               // 修改line-station
           }
        });

        JPanel stationPanel = new JPanel();
        stationPanel.add(new JLabel("Chinese Name"));
        stationPanel.add(stationNameCn);
        stationPanel.add(new JLabel("English name"));
        stationPanel.add(stationNameEn);
        stationPanel.add(new JLabel("District"));
        stationPanel.add(stationDistrict);
        stationPanel.add(new JLabel("Intro"));
        stationPanel.add(stationIntro);

        JPanel linePanel = new JPanel();
        linePanel.add(new JLabel("Name"));
        linePanel.add(lineName);
        linePanel.add(new JLabel("Start Time"));
        linePanel.add(lineStartTime);
        linePanel.add(new JLabel("End Time"));
        linePanel.add(lineEndTime);
        linePanel.add(new JLabel("Intro"));
        linePanel.add(lineIntro);
        linePanel.add(new JLabel("Mileage"));
        linePanel.add(lineMileage);
        linePanel.add(new JLabel("Color"));
        linePanel.add(lineColor);
        linePanel.add(new JLabel("Opening"));
        linePanel.add(lineOpening);
        linePanel.add(new JLabel("url"));
        linePanel.add(lineURL);


        JPanel lineStationPanel = new JPanel();
        // 怎么设置界面

        add(stationPanel, BorderLayout.NORTH);
        add(linePanel, BorderLayout.CENTER);
        add(lineStationPanel, BorderLayout.SOUTH);
    }
}
