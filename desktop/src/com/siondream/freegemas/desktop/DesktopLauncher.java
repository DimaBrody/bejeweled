package com.siondream.freegemas.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.siondream.freegemas.Freegemas;

public class DesktopLauncher {
    public static void main (String[] arg) {
        Freegemas.setPlatformResolver(new DesktopResolver());

        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "Freegemas";
        config.useGL30  = false;
        config.width = 1280;
        config.height = 720;

        new LwjglApplication(new Freegemas(), config);
    }

}
