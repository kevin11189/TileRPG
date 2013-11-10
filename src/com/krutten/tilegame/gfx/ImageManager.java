package com.krutten.tilegame.gfx;

import java.awt.image.BufferedImage;

public class ImageManager {

	public BufferedImage player, playerUp, playerDown, playerLeft, playerRight;
	public BufferedImage borderTileTop, borderTileBottom, borderTileLeft, borderTileRight, borderTileTopLeft, borderTileTopRight, borderTileBottomRight, borderTileBottomLeft;
	public BufferedImage borderTileFenceTop, borderTileFenceTopLeft, borderTileFenceLeft, borderTileFenceBottomLeft, borderTileFenceBottom, borderTileFenceBottomRight, borderTileFenceRight, borderTileFenceTopRight;
	public BufferedImage grassTile, grassTileLong, grassTileLonger, grassTileLongFlower, grassTileLongFlowers,
	playerRightAnim1, playerRightAnim2, playerRightAnim3, playerRightAnim4, playerRightAnim5,
	playerLeftAnim1, playerLeftAnim2, playerLeftAnim3, playerLeftAnim4, playerLeftAnim5,
	playerUpAnim1, playerUpAnim2, playerUpAnim3, playerUpAnim4, playerUpAnim5,
	playerDownAnim1, playerDownAnim2, playerDownAnim3, playerDownAnim4, playerDownAnim5;
	
	public ImageManager(SpriteSheet ss){
		player = ss.crop(122, 2, 19, 23);
		playerUp = ss.crop(212, 123, 17, 22);
		playerUpAnim1 = ss.crop(152, 122, 17, 24);
		playerUpAnim2 = ss.crop(122, 122, 17, 23);
		playerUpAnim3 = ss.crop(92, 123, 17, 22);
		playerUpAnim4 = ss.crop(32, 122, 17, 24);
		playerUpAnim5= ss.crop(2, 122, 17, 23);
		playerDown = ss.crop(33, 3, 16, 22);
		playerDownAnim1 = ss.crop(3, 33, 16, 22); 
		playerDownAnim2 = ss.crop(213, 32, 16, 24);
		playerDownAnim3 = ss.crop(153, 32, 16, 23);
		playerDownAnim4 = ss.crop(123, 33, 16, 22);
		playerDownAnim5= ss.crop(93, 32, 16, 24);
		playerLeft = ss.crop(89, 58, 19, 23);
		playerLeftAnim1 = ss.crop(59, 57, 19, 23); 
		playerLeftAnim2 = ss.crop(32, 57, 18, 24);
		playerLeftAnim3 = ss.crop(3, 58, 19, 24);
		playerLeftAnim4 = ss.crop(151, 57, 18, 24);
		playerLeftAnim5= ss.crop(120, 57, 19, 24);
		playerRight = ss.crop(122, 2, 19, 23);
		playerRightAnim1 = ss.crop(151, 151, 19, 24);
		playerRightAnim2 = ss.crop(177, 151, 18, 24);
		playerRightAnim3 = ss.crop(200, 150, 19, 24);
		playerRightAnim4 = ss.crop(154, 179, 18, 24);
		playerRightAnim5 = ss.crop(177, 179, 19, 23);
		grassTile = ss.crop(48, 0, 16, 16);
		grassTileLong = ss.crop(48, 16, 16, 16);
		grassTileLonger = ss.crop(48, 32, 16, 16);
		grassTileLongFlower = ss.crop(48, 48, 16, 16);
		grassTileLongFlowers = ss.crop(48, 64, 16, 16);
		borderTileTop = ss.crop(96, 176, 16, 16);
		borderTileBottom = ss.crop(96, 192, 16, 16);
		borderTileLeft = ss.crop(112, 176, 16, 16); 
		borderTileRight = ss.crop(112, 192, 16, 16); 
		borderTileTopLeft = ss.crop(64, 176, 16, 16); 
		borderTileTopRight = ss.crop(80, 176, 16, 16);
		borderTileBottomRight = ss.crop(96, 160, 16, 16); 
		borderTileBottomLeft = ss.crop(112, 160, 16, 16);
		borderTileFenceTop = ss.crop(80, 176, 16, 16);
		borderTileFenceTopLeft = ss.crop(80, 176, 16, 16);
		borderTileFenceLeft = ss.crop(224, 80, 16, 16);
		borderTileFenceBottomLeft = ss.crop(192, 96, 16, 16);
		borderTileFenceBottom = ss.crop(192, 96, 16, 16);
		borderTileFenceBottomRight = ss.crop(208, 96, 16, 16);
		borderTileFenceRight = ss.crop(240, 80, 16, 16);
		borderTileFenceTopRight = ss.crop(80, 176, 16, 16);
	}
}