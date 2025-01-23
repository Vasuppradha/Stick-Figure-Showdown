package com.vasu.stickman.resources;

import com.badlogic.gdx.graphics.Color;

public class GlobalVariables {
    public static final float WORLD_WIDTH = 80f;
    public static final float WORLD_HEIGHT = 48f;
    public static final int WINDOW_WIDTH  = 800;
    public static final int WINDOW_HEIGHT = 480;
    public static final float WORLD_SCALE = 0.05f;

    public static final float MIN_WORLD_HEIGHT = WORLD_HEIGHT * 0.85f;

    //colors
    public static final Color GOLD = new Color(0.94f,0.85f,0.32f,1f);
    public static  final Color BLUE_BACKGROUND = new Color(0.25f, 0.42f, 0.61f, 1f);

    //game
    public enum Difficulty{
        EASY,
        MEDIUM,
        HARD
    }


}
