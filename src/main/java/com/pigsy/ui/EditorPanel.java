package com.pigsy.ui;

import burp.api.montoya.core.ByteArray;
import burp.api.montoya.ui.editor.RawEditor;
import com.pigsy.BurpExtensionTerminal;
import com.pigsy.TerminalSettings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class EditorPanel extends JPanel {
    private final JToolBar toolBar;
    private final RawEditor rawEditor;

    public EditorPanel() {
        this.setLayout(new BorderLayout());

        toolBar = new JToolBar(JToolBar.HORIZONTAL);
        toolBar.setFloatable(false);
        initToolbar();

        rawEditor = BurpExtensionTerminal.api.userInterface().createRawEditor();
        rawEditor.uiComponent().setFont(new Font("新宋体", Font.PLAIN, 14));
        rawEditor.setContents(ByteArray.byteArray(TerminalSettings.getConfigText().getBytes(StandardCharsets.UTF_8)));

        this.add(toolBar, BorderLayout.NORTH);
        this.add(rawEditor.uiComponent(), BorderLayout.CENTER);
    }

    private void initToolbar() {
        JButton saveBtn = new JButton("保存");
        saveBtn.setSelected(true);
        saveBtn.addActionListener(new AbstractAction("保存") {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                TerminalSettings.saveText(new String(rawEditor.getContents().getBytes(), StandardCharsets.UTF_8));
            }
        });

        toolBar.add(saveBtn);
    }
}
