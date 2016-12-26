package com.chornyiua.flappydemo.states;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.chornyiua.flappydemo.FlappyDemo;

public class MenuState extends State {
    private Texture background;
    private Texture playButton;


    public MenuState(GameStateManager gsm) {
        super(gsm);
        camera.setToOrtho(false, FlappyDemo.WIDTH / 2, FlappyDemo.HEIGHT / 2);
        background = new Texture("bg.png");
        playButton = new Texture("playbtn.png");
    }

    @Override
    protected void handleInpute() {
        if(Gdx.input.isTouched()){
            gsm.set(new PlayState(gsm));
        }
    }

    @Override
    public void update(float dt) {
        handleInpute();
    }

    @Override
    public void render(SpriteBatch batch) {
        batch.setProjectionMatrix(camera.combined);
        batch.begin();
        batch.draw(background, 0, 0);
        batch.draw(playButton, camera.position.x - playButton.getWidth() / 2, camera.position.y);
        batch.end();
    }

    @Override
    public void dispose() {
        background.dispose();
        playButton.dispose();

        System.out.println("MenuState Disposed");
    }
}
