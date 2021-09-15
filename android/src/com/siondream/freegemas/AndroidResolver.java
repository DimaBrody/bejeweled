package com.siondream.freegemas;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;

public class AndroidResolver implements PlatformResolver {

    public String getDefaultLanguage() {
        return java.util.Locale.getDefault().toString();
    }

    public String format(String string, Object... args) {
        return String.format(string, args);
    }

    @Override
    public BitmapFont loadFont(String fntFile, String ttfFile, int size) {
        FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal(ttfFile));
        FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
        parameter.size = size;
        parameter.characters = FreeTypeFontGenerator.DEFAULT_CHARS;
        parameter.flip = true;
        BitmapFont font = generator.generateFont(parameter);

        generator.dispose();
        return font;
    }
}

