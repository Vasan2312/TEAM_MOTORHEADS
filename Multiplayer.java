package com.gamefromscratch;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class Multiplayer implements Screen {
	Demo game;
	Texture img_entry_screen,img_entry_button;
	Sprite sprite_entry_button;
	Stage stage;
	Skin skin;
	TextButton textButton;
	Texture buttonTexture;
	Drawable drawable;
	ImageButton imageButton;

	Multiplayer(Demo game)
	{
		this.game=game;
		stage = new Stage(new ScreenViewport());
		img_entry_screen = new Texture("badlogic.jpg");
		buttonTexture = new Texture(Gdx.files.internal("Setting.jpeg"));
		drawable = new TextureRegionDrawable(new TextureRegion(buttonTexture));
		imageButton = new ImageButton(drawable);
		imageButton.setBounds(0, 443, 100, 83);

	}

	@Override
	public void show() {

	}

	@Override
	public void render(float delta) {
		ScreenUtils.clear(0, 0, 0, 1);
		game.batch.begin();
		game.batch.draw(img_entry_screen, 0, 0);
		game.batch.end();

	}

	@Override
	public void resize(int width, int height) {

	}

	@Override
	public void pause() {

	}

	@Override
	public void resume() {

	}

	@Override
	public void hide() {

	}

	@Override
	public void dispose() {

	}
}
