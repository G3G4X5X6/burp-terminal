package com.pigsy.console;

import com.jediterm.core.Platform;
import com.jediterm.terminal.ui.settings.DefaultSettingsProvider;

import java.awt.*;

public class ConsoleSettingsProvider extends DefaultSettingsProvider {
    @Override
    public Font getTerminalFont() {
        String fontName;
        if (Platform.current() == Platform.Windows) {
//            fontName = "Consolas";
            fontName = "新宋体";
        } else if (Platform.current() == Platform.Mac) {
            fontName = "Menlo";
        } else {
            fontName = "Monospaced";
        }

        return new Font(fontName, Font.PLAIN, (int) this.getTerminalFontSize());
    }
}
