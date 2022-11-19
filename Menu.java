package com.gamefromscratch;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
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


public class Menu implements Screen {

    Demo game;
    Texture img_entry_screen,img_entry_button;
    Sprite sprite_entry_button;
    Stage stage;
    Skin skin;
    TextButton textButton;
    Texture buttonTexture;
    Drawable drawable;
    ImageButton imageButton;
    Menu(Demo game){
        this.game=game;
        stage = new Stage(new ScreenViewport());
//        skin = new Skin(Gdx.files.internal("Skin/glassy-ui.json"));
//        textButton = new TextButton("New Game", skin, "small");
//        textButton.setBounds(580-100, 10, 200, 50);
//        stage.addActor(textButton);
        img_entry_screen = new Texture("EntryScreen.jpg");
        buttonTexture = new Texture(Gdx.files.internal("EntryButton.jpeg"));
        drawable = new TextureRegionDrawable(new TextureRegion(buttonTexture));
        imageButton = new ImageButton(drawable);
        imageButton.setBounds(585-120, 10, 239, 77);
        stage.addActor(imageButton);
//		img_entry_button = new Texture("EntryButton.jpeg");
//		sprite_entry_button  = new Sprite(img_entry_button);
//		sprite_entry_button.setPosition(580-120,10);
        Gdx.input.setInputProcessor(stage);
    }


    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0, 0, 0, 1);
        game.batch.begin();
        game.batch.draw(img_entry_screen, 0, 0);
//		batch.draw(sprite_entry_button,sprite_entry_button.getX(),sprite_entry_button.getY());
        game.batch.end();
        stage.draw();
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
