package com.vasu.stickman.lwjgl3;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.vasu.stickman.SFS;
import com.vasu.stickman.resources.GlobalVariables;

/** Launches the desktop (LWJGL3) application. */
public class Lwjgl3Launcher {
    public static void main(String[] args) {
        Lwjgl3ApplicationConfiguration configuration = new Lwjgl3ApplicationConfiguration();
        configuration.setForegroundFPS(60);
        configuration.setTitle("StickMan");
        configuration.setWindowedMode(GlobalVariables.WINDOW_WIDTH,GlobalVariables.WINDOW_HEIGHT);
        new Lwjgl3Application(new SFS(), configuration);
    }
}
