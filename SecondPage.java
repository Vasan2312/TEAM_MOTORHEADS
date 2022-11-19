package com.gamefromscratch;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
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

public class SecondPage implements Screen {

    Demo game;
    Texture img_entry_screen,img_entry_button;
    Sprite sprite_entry_button;
    Stage stage;
    Skin skin;
    TextButton textButton;
    Texture buttonTexture,daily_mission_button,vs_friend;
    Drawable drawable,drawable1,drawable2;
    ImageButton imageButton,imageButton1,imageButton2;
    SecondPage(Demo game){
        this.game=game;
        stage = new Stage(new ScreenViewport());
        img_entry_screen = new Texture("Screen2.jpeg");
        buttonTexture = new Texture(Gdx.files.internal("Setting.jpeg"));
        drawable = new TextureRegionDrawable(new TextureRegion(buttonTexture));
        imageButton = new ImageButton(drawable);
        imageButton.setBounds(0, 443, 100, 83);

        daily_mission_button= new Texture(Gdx.files.internal("Daily_missions_button.jpg"));
        drawable1 = new TextureRegionDrawable(new TextureRegion(daily_mission_button));
        imageButton1 = new ImageButton(drawable1);
        imageButton1.setBounds(50, 335, 75, 75);

        vs_friend= new Texture(Gdx.files.internal("vs_friend_button.jpg"));
        drawable2 = new TextureRegionDrawable(new TextureRegion(vs_friend));
        imageButton2 = new ImageButton(drawable2);
        imageButton2.setBounds(823, 190, 225, 225);

        stage.addActor(imageButton);
        stage.addActor(imageButton1);
        stage.addActor(imageButton2);
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
        game.batch.draw(daily_mission_button, 50, 335,75,75);
//		batch.draw(sprite_entry_button,sprite_entry_button.getX(),sprite_entry_button.getY());
        game.batch.end();
        stage.draw();

        imageButton.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                game.setScreen(new Setting(game));
                stage.dispose();
            }
        }
        )
        ;

        imageButton1.addListener(new ClickListener(){
                                    @Override
                                    public void clicked(InputEvent event, float x, float y) {
                                        game.setScreen(new Daily_Missions(game));
                                        stage.dispose();
                                    }
                                }
        )
        ;

        imageButton2.addListener(new ClickListener(){
                                     @Override
                                     public void clicked(InputEvent event, float x, float y) {
                                         game.setScreen(new Multiplayer(game));
                                         stage.dispose();
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
        img_entry_screen.dispose();
    }
}
