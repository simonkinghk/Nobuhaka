package com.rokonexamples.modifier;

import com.stickycoding.rokon.DrawPriority;
import com.stickycoding.rokon.RokonActivity;

public class MainActivity extends RokonActivity {

	public static final float GAME_WIDTH = 480f;
	public static final float GAME_HEIGHT = 320f;

	private GameScene scene;

	public void onCreate() {
		debugMode();
		forceFullscreen();
		forceLandscape();
		setGameSize(GAME_WIDTH, GAME_HEIGHT);
		setDrawPriority(DrawPriority.PRIORITY_VBO);
		setGraphicsPath("textures/");
		createEngine();
	}

	public void onLoadComplete() {
		Textures.load();
		setScene(scene = new GameScene());
	}

}
