package cs307.cs30724springproject2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BoardExitGUI extends JFrame {
    private JButton BoardButton;
    private JButton ExitButton;
    private JTextField PassengerCardField;
    private JTextField StationField;

    public BoardExitGUI() {
        setTitle("Board & Exit");
        setSize(450, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        BoardButton = new JButton("Board");
        ExitButton = new JButton("Exit");
        PassengerCardField = new JTextField(15);
        StationField = new JTextField(10);

        BoardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 进站操作
            }
        });
        ExitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 出站操作
            }
        });

        add(new JLabel("Passenger ID/Card code"), BorderLayout.NORTH);
        add(PassengerCardField);
        add(new JLabel("Station"), BorderLayout.CENTER);
        add(StationField);
        add(BoardButton, BorderLayout.SOUTH);
        add(ExitButton, BorderLayout.SOUTH);

    }
}
