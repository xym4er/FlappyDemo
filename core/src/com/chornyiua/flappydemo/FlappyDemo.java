package com.chornyiua.flappydemo;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.utils.ObjectMap;
import com.badlogic.gdx.utils.ObjectSet;
import com.chornyiua.flappydemo.states.GameStateManager;
import com.chornyiua.flappydemo.states.MenuState;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FlappyDemo extends ApplicationAdapter {
    public static final int WIDTH = 480;
    public static final int HEIGHT = 800;
    public static final String TITLE = "Flappy";
    public static ObjectMap textures = new ObjectMap();
    private GameStateManager gsm;
    private SpriteBatch batch;

    @Override
    public void create() {
//        TextureAtlas atlas = new TextureAtlas("awaesom.atlas");
//        ObjectSet temp = atlas.getTextures();
//        System.out.println(atlas.getRegions().first().getRegionHeight());
        batch = new SpriteBatch();
        gsm = new GameStateManager();
        Gdx.gl.glClearColor(1, 0, 0, 1);
        gsm.push(new MenuState(gsm));
    }

    @Override
    public void render() {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        gsm.update(Gdx.graphics.getDeltaTime());
        gsm.render(batch);
    }

    @Override
    public void dispose() {
        batch.dispose();
    }
}
