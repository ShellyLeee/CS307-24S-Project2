package cs307.cs30724springproject2.GUI;
import cs307.cs30724springproject2.controller.cardController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private JButton fetchDataButton;
    private final RestTemplate restTemplate; //restFul类处理请求

    public MainFrame() {
        initComponents();
        setupListeners();
        restTemplate = new RestTemplate(); // 初始化 RestTemplate
    }

    // 设置界面布局
    private void initComponents() {
        fetchDataButton = new JButton("Fetch Data");
        add(fetchDataButton);
    }

    // 设置事件监听器
    private void setupListeners() {
        fetchDataButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fetchDataFromBackend();
            }
        });
    }

    //向后端收集数据
    private void fetchDataFromBackend() {
        // 后端 API 地址
        String url = "http://localhost:8080/card/selectAll";
        // 发送 GET 请求
        String response = restTemplate.getForObject(url, String.class);
        // 显示后端返回的数据，这里可以根据实际情况进行处理
        JOptionPane.showMessageDialog(MainFrame.this, response, "Data from Backend", JOptionPane.INFORMATION_MESSAGE);
    }

}


