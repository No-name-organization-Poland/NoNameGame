package com.mygdx.game;

import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Array;

//klasa odpowiedzialna za działanie postaci gracza
public class Player extends Sprite {
    private int x, y, height, width;
    private TextureAtlas atlas;
    private Array<TextureAtlas.AtlasRegion> animationFrame;
    public Animation<TextureRegion> animation;


    public Player(int height, int width, String fileName, String state){
        this.height = height;
        this.width = width;
        this.atlas = new TextureAtlas(fileName);
        this.animationFrame = this.atlas.getRegions();
        this.animation = new Animation<TextureRegion>(.4f, this.animationFrame);
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public float getWidth(){
        return this.width;
    }

    public float getHeight(){
        return this.height;
    }

}
