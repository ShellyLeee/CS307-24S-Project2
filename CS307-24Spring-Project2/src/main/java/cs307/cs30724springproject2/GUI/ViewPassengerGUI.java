package cs307.cs30724springproject2.GUI;

import javax.swing.*;
import java.awt.*;

public class ViewPassengerGUI extends JFrame {
    private JPanel contentPane;

    public ViewPassengerGUI() {
        setTitle("Passengers onboard");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        contentPane = new JPanel();
        // 先导入目前在搭乘状态中的乘客组成的table

        //contentPane.add(); // 显示table
    }
}
