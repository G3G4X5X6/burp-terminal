package com.pigsy.utils;

import burp.api.montoya.logging.Logging;
import com.pigsy.BurpExtensionTerminal;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class WorkspaceUtil {

    public static String getTextFromFile(String fileName) {
        // 使用ClassLoader获取资源文件的输入流
        InputStream inputStream = BurpExtensionTerminal.class.getClassLoader().getResourceAsStream(fileName);

        StringBuilder stringBuilder = new StringBuilder();
        if (inputStream != null) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            // 处理输入流，例如读取内容
            try {
                String line;
                while ((line = reader.readLine()) != null) {
                    stringBuilder.append(line).append("\n");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("资源文件未找到");
        }
        return stringBuilder.toString();
    }

    public static void showBanner(Logging logging) {
        String banner = getTextFromFile("banner.txt");
        logging.logToOutput(banner);
        System.out.println(banner);
    }

    public static LinkedList<String> getThemeList() {
        String themeText = getTextFromFile("theme/colorschemes.txt");

        return new LinkedList<>(Arrays.asList(themeText.split("\\s+")));
    }

    public static void setClipboardString(String text) {
        // 获取系统剪贴板
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        // 封装文本内容
        Transferable trans = new StringSelection(text);
        // 把文本内容设置到系统剪贴板
        clipboard.setContents(trans, null);
    }

    public static Path getWorkSpacePath() {
        return Path.of(System.getProperty("user.home"), ".burp-extension");
    }

    public static Path getBinPath() {
        return Path.of(getWorkSpacePath().toString(), "bin");
    }


    public static Path getConfigPath() {
        return Path.of(getWorkSpacePath().toString(), "conf/terminal");
    }
    public static Path getConfigFilePath() {
        return Path.of(getConfigPath().toString(), "terminal.properties");
    }

    public static Path getDataPath() {
        return Path.of(getWorkSpacePath().toString(), "data");
    }

    public static void initEnv() {
        Path workDir = getWorkSpacePath();
        if (!Files.exists(workDir)) {
            try {
                Files.createDirectories(workDir);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        ArrayList<String> paths = new ArrayList<>();
        // 在工作目录下添加目录
        paths.add("bin");
        paths.add("conf");
        paths.add("conf/terminal");
        paths.add("data");
        paths.add("temp");

        for (String path : paths) {
            Path tmpPath = Path.of(workDir.toString(), path);
            if (!Files.exists(tmpPath)) {
                try {
                    Files.createDirectories(tmpPath);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}
