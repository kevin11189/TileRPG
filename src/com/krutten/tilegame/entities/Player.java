package com.krutten.tilegame.entities;

import java.awt.Graphics;
import java.awt.Rectangle;

import com.krutten.tilegame.Game;
import com.krutten.tilegame.gfx.ImageManager;

public class Player {
	
	private int x, y;
	private ImageManager im;
	public boolean up = false, dn = false, lt = false, rt = false;
	public int anim;
	public int playerFace = 0;

	public Player(int x, int y, ImageManager im) {
		this.x = x;
		this.y = y;
		this.im = im;
	}
	
	public void tick() {
		anim++;
		if(up){
			if( y <= Game.OFFSET_TOP) {
				y = Game.OFFSET_TOP;
			} else {
				y -= Game.SPEED;
			}	
		}
		if(dn){
			if( y >= (Game.HEIGHT - Game.OFFSET_BOTTOM) * Game.SCALE) {
				y = (Game.HEIGHT - Game.OFFSET_BOTTOM) * Game.SCALE;
			} else {
				y += Game.SPEED;
			}		
		}
		if(lt){
			if(x <= Game.OFFSET_LEFT) {
				x = Game.OFFSET_LEFT;
			} else {
				x -= Game.SPEED;
			}			
		}
		if(rt){
			if(x >= (Game.WIDTH - Game.OFFSET_RIGHT) * Game.SCALE) {
				x = (Game.WIDTH - Game.OFFSET_RIGHT) * Game.SCALE;
			} else {
				x += Game.SPEED;
			}
		}
		if(!(rt || lt || dn || up)) {
			anim = 0;
		}
		
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
    public void render(Graphics g) {

		if (playerFace == 0){
			g.drawImage(im.player, x, y, Game.PLAYER_HEIGHT * Game.SCALE, Game.PLAYER_WIDTH * Game.SCALE, null);
		} else if (playerFace == 1) {
			//g.drawImage(im.playerUp, x, y, Game.PLAYER_HEIGHT * Game.SCALE, Game.PLAYER_WIDTH * Game.SCALE, null);
			if (anim == 0) {
				g.drawImage(im.playerUp, x, y, Game.PLAYER_HEIGHT * Game.SCALE, Game.PLAYER_WIDTH * Game.SCALE, null);
			} else if (anim <= Game.ANIMATION_TICK) {
				g.drawImage(im.playerUpAnim1, x, y, Game.PLAYER_HEIGHT * Game.SCALE, Game.PLAYER_WIDTH * Game.SCALE, null);
			} else if (anim <= Game.ANIMATION_TICK * 2) {
				g.drawImage(im.playerUpAnim2, x, y, Game.PLAYER_HEIGHT * Game.SCALE, Game.PLAYER_WIDTH * Game.SCALE, null);
			} else if (anim <= Game.ANIMATION_TICK * 3) {
				g.drawImage(im.playerUpAnim3, x, y, Game.PLAYER_HEIGHT * Game.SCALE, Game.PLAYER_WIDTH * Game.SCALE, null);
			} else if (anim <= Game.ANIMATION_TICK * 4) {
				g.drawImage(im.playerUpAnim4, x, y, Game.PLAYER_HEIGHT * Game.SCALE, Game.PLAYER_WIDTH * Game.SCALE, null);
			} else if (anim <= Game.ANIMATION_TICK * 5) {
				g.drawImage(im.playerUpAnim5, x, y, Game.PLAYER_HEIGHT * Game.SCALE, Game.PLAYER_WIDTH * Game.SCALE, null);
			} else {
				anim = 0;
				g.drawImage(im.playerUpAnim5, x, y, Game.PLAYER_HEIGHT * Game.SCALE, Game.PLAYER_WIDTH * Game.SCALE, null);
			}
			
			
		} else if (playerFace == 2) {
			if (anim == 0) {
				g.drawImage(im.playerRight, x, y, Game.PLAYER_HEIGHT * Game.SCALE, Game.PLAYER_WIDTH * Game.SCALE, null);
			} else if (anim <= Game.ANIMATION_TICK) {
				g.drawImage(im.playerRightAnim1, x, y, Game.PLAYER_HEIGHT * Game.SCALE, Game.PLAYER_WIDTH * Game.SCALE, null);
			} else if (anim <= Game.ANIMATION_TICK * 2) {
				g.drawImage(im.playerRightAnim2, x, y, Game.PLAYER_HEIGHT * Game.SCALE, Game.PLAYER_WIDTH * Game.SCALE, null);
			} else if (anim <= Game.ANIMATION_TICK * 3) {
				g.drawImage(im.playerRightAnim3, x, y, Game.PLAYER_HEIGHT * Game.SCALE, Game.PLAYER_WIDTH * Game.SCALE, null);
			} else if (anim <= Game.ANIMATION_TICK * 4) {
				g.drawImage(im.playerRightAnim4, x, y, Game.PLAYER_HEIGHT * Game.SCALE, Game.PLAYER_WIDTH * Game.SCALE, null);
			} else if (anim <= Game.ANIMATION_TICK * 5) {
				g.drawImage(im.playerRightAnim5, x, y, Game.PLAYER_HEIGHT * Game.SCALE, Game.PLAYER_WIDTH * Game.SCALE, null);
			} else {
				anim = 0;
				g.drawImage(im.playerRightAnim5, x, y, Game.PLAYER_HEIGHT * Game.SCALE, Game.PLAYER_WIDTH * Game.SCALE, null);
			}
			
		} else if (playerFace == 3) {
			//g.drawImage(im.playerDown, x, y, Game.PLAYER_HEIGHT * Game.SCALE, Game.PLAYER_WIDTH * Game.SCALE, null);
			if (anim == 0) {
				g.drawImage(im.playerDown, x, y, Game.PLAYER_HEIGHT * Game.SCALE, Game.PLAYER_WIDTH * Game.SCALE, null);
			} else if (anim <= Game.ANIMATION_TICK) {
				g.drawImage(im.playerDownAnim1, x, y, Game.PLAYER_HEIGHT * Game.SCALE, Game.PLAYER_WIDTH * Game.SCALE, null);
			} else if (anim <= Game.ANIMATION_TICK * 2) {
				g.drawImage(im.playerDownAnim2, x, y, Game.PLAYER_HEIGHT * Game.SCALE, Game.PLAYER_WIDTH * Game.SCALE, null);
			} else if (anim <= Game.ANIMATION_TICK * 3) {
				g.drawImage(im.playerDownAnim3, x, y, Game.PLAYER_HEIGHT * Game.SCALE, Game.PLAYER_WIDTH * Game.SCALE, null);
			} else if (anim <= Game.ANIMATION_TICK * 4) {
				g.drawImage(im.playerDownAnim4, x, y, Game.PLAYER_HEIGHT * Game.SCALE, Game.PLAYER_WIDTH * Game.SCALE, null);
			} else if (anim <= Game.ANIMATION_TICK * 5) {
				g.drawImage(im.playerDownAnim5, x, y, Game.PLAYER_HEIGHT * Game.SCALE, Game.PLAYER_WIDTH * Game.SCALE, null);
			} else {
				anim = 0;
				g.drawImage(im.playerDownAnim5, x, y, Game.PLAYER_HEIGHT * Game.SCALE, Game.PLAYER_WIDTH * Game.SCALE, null);
			}
		} else if (playerFace == 4) {
			//g.drawImage(im.playerLeft, x, y, Game.PLAYER_HEIGHT * Game.SCALE, Game.PLAYER_WIDTH * Game.SCALE, null);
			if (anim == 0) {
				g.drawImage(im.playerLeft, x, y, Game.PLAYER_HEIGHT * Game.SCALE, Game.PLAYER_WIDTH * Game.SCALE, null);
			} else if (anim <= Game.ANIMATION_TICK) {
				g.drawImage(im.playerLeftAnim1, x, y, Game.PLAYER_HEIGHT * Game.SCALE, Game.PLAYER_WIDTH * Game.SCALE, null);
			} else if (anim <= Game.ANIMATION_TICK * 2) {
				g.drawImage(im.playerLeftAnim2, x, y, Game.PLAYER_HEIGHT * Game.SCALE, Game.PLAYER_WIDTH * Game.SCALE, null);
			} else if (anim <= Game.ANIMATION_TICK * 3) {
				g.drawImage(im.playerLeftAnim3, x, y, Game.PLAYER_HEIGHT * Game.SCALE, Game.PLAYER_WIDTH * Game.SCALE, null);
			} else if (anim <= Game.ANIMATION_TICK * 4) {
				g.drawImage(im.playerLeftAnim4, x, y, Game.PLAYER_HEIGHT * Game.SCALE, Game.PLAYER_WIDTH * Game.SCALE, null);
			} else if (anim <= Game.ANIMATION_TICK * 5) {
				g.drawImage(im.playerLeftAnim5, x, y, Game.PLAYER_HEIGHT * Game.SCALE, Game.PLAYER_WIDTH * Game.SCALE, null);
			} else {
				anim = 0;
				g.drawImage(im.playerLeftAnim5, x, y, Game.PLAYER_HEIGHT * Game.SCALE, Game.PLAYER_WIDTH * Game.SCALE, null);
			}
		}
		
	}


}
