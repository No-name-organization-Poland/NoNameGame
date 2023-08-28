package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.ScreenUtils;
import javafx.animation.Animation;

public class MyGdxGame extends ApplicationAdapter {

	private SpriteBatch batch;
	private Player player;
	private int deltaTime = 0;
	private OrthographicCamera camera;
	@Override
	public void create () {
		batch = new SpriteBatch();
		player = new Player(200,200, "greenCar.atlas", "15");
		player.setX(1024/2);
		player.setY(0);
	}

	@Override
	public void render() {
		Gdx.gl.glClear( GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT );
		batch.begin();
		batch.draw(player.animation.getKeyFrame(deltaTime), player.getX(), player.getY(), player.getHeight(), player.getWidth());
		batch.end();
		timer();
	}

	@Override
	public void dispose() {
		batch.dispose();
	}

	//do poprawy timer coś spierdzieliłem, że nie działa. Napisz go na nowo jak coś
	public void timer(){
		while (deltaTime>10){
			deltaTime++;
			if(deltaTime == 9){
				deltaTime = 0;
			}
		}
	}
}
