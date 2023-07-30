package com.pigsy.ui;

import com.pigsy.console.ConsolePanel;
import com.pigsy.utils.WorkspaceUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TerminalTabbedPane extends JPanel {

    private final JToolBar toolBar = new JToolBar(JToolBar.HORIZONTAL);
    private final JTabbedPane tabbedPane = new JTabbedPane();
    private int tabCount = 1;
    private final JDialog dialog = new JDialog();

    public TerminalTabbedPane() {
        this.setLayout(new BorderLayout());

        initToolbar();

        tabbedPane.addTab("<html><font style='color:green'>默认终端</font></html>", new ConsolePanel());
        tabbedPane.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == 3) {
                    int index = tabbedPane.indexAtLocation(e.getX(), e.getY());
                    if (index != -1) {
                        // 选中当前选项卡
                        tabbedPane.setSelectedIndex(index);
                    }
                    JPopupMenu popupMenu = createPopupMenu();
                    popupMenu.show(tabbedPane, e.getX(), e.getY());
                } else if (e.getClickCount() == 2) {
                    WorkspaceUtil.setClipboardString(tabbedPane.getTitleAt(tabbedPane.getSelectedIndex()));
                    String title = JOptionPane.showInputDialog("重命名：" + tabbedPane.getTitleAt(tabbedPane.getSelectedIndex()));
                    if (title != null && !title.isBlank())
                        tabbedPane.setTitleAt(tabbedPane.getSelectedIndex(), title);
                }
            }
        });

        this.add(tabbedPane, BorderLayout.CENTER);

    }

    private void initToolbar() {
        toolBar.setFloatable(false);

        JButton newBtn = new JButton("新建终端");
        newBtn.setSelected(true);
        newBtn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                tabbedPane.addTab("Terminal-" + tabCount, new ConsolePanel());
                tabbedPane.setSelectedIndex(tabbedPane.getTabCount() - 1);
                tabCount++;
            }
        });

        JButton configBtn = new JButton("终端配置");
        configBtn.setSelected(true);
        configBtn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                dialog.setTitle("终端配置");
                dialog.setSize(new Dimension(800, 550));
                dialog.setLocationRelativeTo(TerminalTabbedPane.this);
                dialog.setContentPane(new EditorPanel());
                dialog.setModal(true);
                dialog.setVisible(true);
            }
        });

        toolBar.add(newBtn);
        toolBar.addSeparator();
        toolBar.add(configBtn);

        this.add(toolBar, BorderLayout.NORTH);
    }

    private JPopupMenu createPopupMenu() {
        JPopupMenu popupMenu = new JPopupMenu();
        configPopupMenu(popupMenu);
        return popupMenu;
    }

    private void configPopupMenu(JPopupMenu popupMenu) {
        popupMenu.add(new AbstractAction("重新命名") {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                WorkspaceUtil.setClipboardString(tabbedPane.getTitleAt(tabbedPane.getSelectedIndex()));
                String title = JOptionPane.showInputDialog("重命名：" + tabbedPane.getTitleAt(tabbedPane.getSelectedIndex()));
                if (title != null && !title.isBlank())
                    tabbedPane.setTitleAt(tabbedPane.getSelectedIndex(), title);
            }
        });

        popupMenu.addSeparator();
        popupMenu.add(new AbstractAction("关闭终端") {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (tabbedPane.getSelectedIndex() > 0)
                    tabbedPane.remove(tabbedPane.getSelectedIndex());
            }
        });
    }
}
