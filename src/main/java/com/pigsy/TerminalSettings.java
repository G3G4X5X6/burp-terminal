package com.pigsy;

import javax.swing.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Properties;

import static com.pigsy.utils.WorkspaceUtil.getConfigFilePath;


public class TerminalSettings {
    public static Properties properties = loadProperties();

    public static String getTerminalTheme() {
        String theme = properties.getProperty("terminal.theme");
        if (theme == null || theme.isBlank())
            theme = "Tomorrow";
        return theme;
    }

    public static String getTerminalFont() {
        String font = properties.getProperty("terminal.font");
        if (font == null || font.isBlank())
            font = "新宋体";
        return font;
    }

    public static int getTerminalFontSize() {
        return Integer.parseInt(properties.getProperty("terminal.font.size"));
    }

    private static Properties loadProperties() {
        // 初始化应用配置
        if (!Files.exists(getConfigFilePath())) {
            try {
                InputStream settingsIn = TerminalSettings.class.getClassLoader().getResourceAsStream("terminal.properties");
                assert settingsIn != null;
                Files.copy(settingsIn, getConfigFilePath());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        // 加载配置
        Properties properties = new Properties();
        try {
            InputStreamReader inputStream = new InputStreamReader(new FileInputStream(String.valueOf(getConfigFilePath())), StandardCharsets.UTF_8);
            properties.load(inputStream);
        } catch (Exception ignored) {

        }
        return properties;
    }

    public static String getConfigText() {
        String content = null;

        try {
            // 读取文件内容并转换为字符串
            byte[] bytes = Files.readAllBytes(getConfigFilePath());
            content = new String(bytes);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return content;
    }

    public static void saveText(String text) {
        System.out.println(text);
        try {
            Files.writeString(getConfigFilePath(), text, StandardCharsets.UTF_8);
            JOptionPane.showMessageDialog(null, "保存配置成功!", "信息", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "保存配置失败!", "错误", JOptionPane.ERROR_MESSAGE);

        }
    }
}
