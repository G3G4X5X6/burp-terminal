package com.pigsy.console;

import com.jediterm.core.Color;
import com.jediterm.terminal.emulator.ColorPalette;
import org.jetbrains.annotations.NotNull;

public class DefaultColorPaletteImpl extends ColorPalette {
    private final Color[] myColors;

    public DefaultColorPaletteImpl(@NotNull ColorScheme colorScheme) {
        myColors = colorScheme.getColors();
    }

    @Override
    protected @NotNull Color getForegroundByColorIndex(int i) {
        return myColors[i];
    }

    @Override
    protected @NotNull Color getBackgroundByColorIndex(int i) {
        return myColors[i];
    }
}
