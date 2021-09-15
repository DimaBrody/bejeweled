package com.siondream.freegemas;

import com.badlogic.gdx.graphics.g2d.BitmapFont;

public interface PlatformResolver {
    public String getDefaultLanguage();
    public String format(String string, Object... args);
    public BitmapFont loadFont(String fntFile, String ttfFile, int size);
}
