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


public class Setting implements Screen {

    Demo game;
    Texture img_entry_screen,img_entry_button,cross_it,sound_on,sound_off,vibration_on,vibration_off,music_on,music_off,notification_on,notification_off;
    TextureRegion ImageRegion;
    Stage stage;
    Drawable drawable,drawable1,drawable2,drawable3,drawable4;
    ImageButton imageButton,imageButton1,imageButton2,imageButton3,imageButton4;
    boolean flag1,flag2,flag3,flag4;
    Setting(Demo game){
        this.game=game;

        flag1 = true;
        flag2=true;
        flag3=true;
        flag4=true;

        stage = new Stage(new ScreenViewport());
        img_entry_screen=new Texture("Dull_bg.jpeg");
        ImageRegion = new TextureRegion(img_entry_screen, 0, 0, 1161, 536);
        img_entry_button = new Texture("Settings_Menu.jpg");
        cross_it= new Texture(Gdx.files.internal("Cross.jpg"));
        drawable = new TextureRegionDrawable(new TextureRegion(cross_it));
        imageButton = new ImageButton(drawable);
        imageButton.setBounds(730, 465, 25, 25);

        sound_on= new Texture(Gdx.files.internal("Sound_on.jpg"));
        sound_off= new Texture(Gdx.files.internal("Sound_off.jpg"));
        drawable1 = new TextureRegionDrawable(new TextureRegion(sound_on));
        imageButton1 = new ImageButton(drawable1);
        imageButton1.setBounds(470, 336, 190, 52);

        vibration_on= new Texture(Gdx.files.internal("Vibration_On.jpg"));
        vibration_off= new Texture(Gdx.files.internal("Vibration_off.jpg"));
        drawable2 = new TextureRegionDrawable(new TextureRegion(vibration_on));
        imageButton2 = new ImageButton(drawable2);
        imageButton2.setBounds(470, 276, 190, 52);

        music_on= new Texture(Gdx.files.internal("Music_on.jpg"));
        music_off= new Texture(Gdx.files.internal("Music_off.jpg"));
        drawable3 = new TextureRegionDrawable(new TextureRegion(music_on));
        imageButton3 = new ImageButton(drawable3);
        imageButton3.setBounds(470, 214, 190, 52);

        notification_on= new Texture(Gdx.files.internal("Notification_on.jpg"));
        notification_off= new Texture(Gdx.files.internal("Notification_off.jpg"));
        drawable4 = new TextureRegionDrawable(new TextureRegion(notification_on));
        imageButton4 = new ImageButton(drawable4);
        imageButton4.setBounds(470, 154, 190, 52);

        stage.addActor(imageButton);
        stage.addActor(imageButton1);
        stage.addActor(imageButton2);
        stage.addActor(imageButton3);
        stage.addActor(imageButton4);
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
        game.batch.draw(img_entry_button, 365, 50,400,450);
        game.batch.draw(cross_it, 730, 465,25,25);
        if(flag1){
            game.batch.draw(sound_on, 470, 336,190,52);
        }else{
            game.batch.draw(sound_off, 470, 336,190,52);
        }

        if(flag2){
            game.batch.draw(vibration_on, 470, 276,190,52);
        }else{
            game.batch.draw(vibration_off, 470, 276,190,52);
        }

        if(flag3){
            game.batch.draw(music_on, 470, 214,190,52);
        }else{
            game.batch.draw(music_off, 470, 215,190,52);
        }

        if(flag4){
            game.batch.draw(notification_on, 470, 154,190,52);
        }else{
            game.batch.draw(notification_off, 470, 153,190,52);
        }
        game.batch.end();

        imageButton.addListener(new ClickListener(){
                                    @Override
                                    public void clicked(InputEvent event, float x, float y) {
                                        game.setScreen(new SecondPage(game));
                                    }
                                }
        )
        ;

        imageButton1.addListener(new ClickListener(){
                                     @Override
                                     public void clicked(InputEvent event, float x, float y) {
                                         flag1 = !flag1;
                                     }
                                 }
        )
        ;

        imageButton2.addListener(new ClickListener(){
                                     @Override
                                     public void clicked(InputEvent event, float x, float y) {
                                         flag2 = !flag2;
                                     }
                                 }
        )
        ;

        imageButton3.addListener(new ClickListener(){
                                     @Override
                                     public void clicked(InputEvent event, float x, float y) {
                                         flag3 = !flag3;
                                     }
                                 }
        )
        ;

        imageButton4.addListener(new ClickListener(){
                                     @Override
                                     public void clicked(InputEvent event, float x, float y) {
                                         flag4 = !flag4;
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
