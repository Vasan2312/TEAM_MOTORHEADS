package com.gamefromscratch;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class Daily_Missions implements  Screen{

	Demo game;
	Texture img_entry_screen,daily_mission_menu,cross_it;
	TextureRegion ImageRegion;
	Stage stage;
	Drawable drawable;
	ImageButton imageButton;
	Daily_Missions(Demo game)
	{
		this.game=game;

		stage = new Stage(new ScreenViewport());
		img_entry_screen=new Texture("Dull_bg.jpeg");
		ImageRegion = new TextureRegion(img_entry_screen, 0, 0, 1161, 536);
		daily_mission_menu=new Texture("Daily_Missions_Menu.jpg");

		cross_it= new Texture(Gdx.files.internal("Cross.jpg"));
		drawable = new TextureRegionDrawable(new TextureRegion(cross_it));
		imageButton = new ImageButton(drawable);
		imageButton.setBounds(961, 440, 25, 25);

		stage.addActor(imageButton);
		Gdx.input.setInputProcessor(stage);
	}

	@Override
	public void show() {

	}

	@Override
	public void render(float delta) {
		ScreenUtils.clear(0, 0, 0, 1);
		game.batch.begin();
		game.batch.draw(img_entry_screen,0,0,1161,536);
		game.batch.draw(daily_mission_menu, 157, 33,850,450);
		game.batch.draw(cross_it, 961, 440,25,25);
		game.batch.end();

		imageButton.addListener(new ClickListener(){
			                        @Override
			                        public void clicked(InputEvent event, float x, float y) {
				                        game.setScreen(new SecondPage(game));
			                        }
		                        }
		)
		;
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
