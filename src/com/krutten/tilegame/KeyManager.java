package com.krutten.tilegame;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileNotFoundException;

public class KeyManager implements KeyListener {

	

    public void keyTyped(KeyEvent e) {
	}

	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP){
			Game.getPlayer().up = true;
		    Game.getPlayer().playerFace = 1;
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN){
			Game.getPlayer().dn = true;
			Game.getPlayer().playerFace = 3;
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT){
			Game.getPlayer().lt = true;
			Game.getPlayer().playerFace = 4;
		}
		if(e.getKeyCode() == KeyEvent.VK_RIGHT){
			Game.getPlayer().rt = true;
			Game.getPlayer().playerFace = 2;
		}
		if(e.getKeyCode() == KeyEvent.VK_S){
			Game.save.saveFile();
		}
		if(e.getKeyCode() == KeyEvent.VK_L){
			try {
				Game.save.loadFile();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP){
			Game.getPlayer().up = false;
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN){
			Game.getPlayer().dn = false;
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT){
			Game.getPlayer().lt = false;
		}
		if(e.getKeyCode() == KeyEvent.VK_RIGHT){
			Game.getPlayer().rt = false;
		}
	}
}
