package com.pigsy;

import javax.swing.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Properties;

import static com.pigsy.utils.WorkspaceUtil.getConfigFilePath;


public class TerminalSettings {
    public static Properties properties = loadProperties();

    public static String getTheme() {
        String theme = properties.getProperty("theme");
        if (theme == null || theme.isBlank())
            theme = "Tomorrow";
        return theme;
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

        try {
            Files.writeString(getConfigFilePath(), text);
            JOptionPane.showMessageDialog(null, "保存配置成功!", "信息", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "保存配置失败!", "错误", JOptionPane.ERROR_MESSAGE);

        }
    }

    public static void saveSettingsProperties() {
        try {
            StringBuilder settingsText = new StringBuilder();
            BufferedReader reader = new BufferedReader(new FileReader(getConfigFilePath().toFile()));
            String line = "";
            while ((line = reader.readLine()) != null) {
                if (!line.startsWith("#") && !line.isBlank()) {
                    String key = line.strip().split("=")[0];
                    line = key + "=" + (properties.getProperty(key) != null ? properties.getProperty(key) : line.strip().split("=")[1]);
                }
                settingsText.append(line).append("\n");
            }
            Files.writeString(getConfigFilePath(), settingsText.toString());
            JOptionPane.showMessageDialog(null, "保存配置成功!", "信息", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "保存配置失败!", "错误", JOptionPane.ERROR_MESSAGE);
        }
    }
}
