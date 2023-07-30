package com.pigsy.console;

import com.jediterm.core.Platform;
import com.jediterm.terminal.emulator.ColorPalette;
import com.jediterm.terminal.ui.settings.DefaultSettingsProvider;

import java.awt.*;

public class ConsoleSettingsProvider extends DefaultSettingsProvider {
    private final ColorScheme colorScheme;

    public ConsoleSettingsProvider(String theme){
        colorScheme = new ColorScheme(theme);
    }

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

    @Override
    public ColorPalette getTerminalColorPalette() {
        return new DefaultColorPaletteImpl(colorScheme);
    }
}
