package com.chornyiua.flappydemo.states;


import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.chornyiua.flappydemo.FlappyDemo;

public class MenuState extends State {
    private Texture background;
    private Texture playButton;


    public MenuState(GameStateManager gsm) {
        super(gsm);
        background = new Texture("bg.png");
        playButton = new Texture("pb.png");
    }

    @Override
    protected void handleInpute() {

    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch batch) {
        batch.begin();
        batch.draw(background, 0, 0, FlappyDemo.WIDTH, FlappyDemo.HEIGHT);
        batch.draw(playButton, (FlappyDemo.WIDTH/2)-(playButton.getWidth()/2), FlappyDemo.HEIGHT/2);
        batch.end();
    }

    @Override
    public void dispose() {
        background.dispose();
        playButton.dispose();
    }
}
