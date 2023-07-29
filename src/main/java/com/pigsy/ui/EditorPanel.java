package com.pigsy.ui;

import com.pigsy.BurpExtensionTerminal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class EditorPanel extends JPanel {
    private JToolBar toolBar;
    private Component textArea;

    public EditorPanel() {
        this.setLayout(new BorderLayout());

        toolBar = new JToolBar(JToolBar.HORIZONTAL);
        toolBar.setFloatable(false);
        initToolbar();

        textArea = BurpExtensionTerminal.api.userInterface().createRawEditor().uiComponent();

        this.add(toolBar, BorderLayout.NORTH);
        this.add(textArea, BorderLayout.CENTER);
    }

    private void initToolbar() {
        JButton saveBtn = new JButton("保存");
        saveBtn.setSelected(true);
        saveBtn.addActionListener(new AbstractAction("保存") {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });

        toolBar.add(saveBtn);
    }
}
