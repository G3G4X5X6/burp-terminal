package com.pigsy.console;

import com.jediterm.core.Platform;
import com.jediterm.terminal.TtyConnector;
import com.jediterm.terminal.ui.JediTermWidget;
import com.pigsy.TerminalSettings;
import com.pigsy.utils.WorkspaceUtil;
import com.pty4j.PtyProcess;
import com.pty4j.PtyProcessBuilder;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class ConsolePanel extends JPanel {
    private PtyProcessTtyConnector ttyConnector;

    public ConsolePanel() {
        this.setLayout(new BorderLayout());

        JediTermWidget widget = createTerminalWidget();
        this.add(widget, BorderLayout.CENTER);
    }

    public void write(String command) {
        try {
            ttyConnector.write(command);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private @NotNull JediTermWidget createTerminalWidget() {
        JediTermWidget widget = new JediTermWidget(80, 24, new ConsoleSettingsProvider(TerminalSettings.getTerminalTheme()));
        widget.setTtyConnector(createTtyConnector());
        widget.start();

        ttyConnector = (PtyProcessTtyConnector) widget.getTtyConnector();
        return widget;
    }

    private @NotNull TtyConnector createTtyConnector() {
        try {
            Map<String, String> envs = System.getenv();
            String[] command;
            if (Platform.current() == Platform.Windows) {
                String path = envs.get("Path") + ";" + WorkspaceUtil.getBinPath();
                envs = new HashMap<>(System.getenv());
                envs.put("Path", path);
                command = new String[]{"cmd.exe"};
            } else {
                command = new String[]{"/bin/bash", "--login"};
                envs = new HashMap<>(System.getenv());
                envs.put("TERM", "xterm-256color");
            }

            PtyProcess process = new PtyProcessBuilder().setCommand(command).setEnvironment(envs).start();
            return new PtyProcessTtyConnector(process, StandardCharsets.UTF_8);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

}
