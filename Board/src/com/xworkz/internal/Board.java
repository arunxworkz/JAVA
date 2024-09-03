package com.xworkz.internal;

public class Board {

	private String chockPieceColor;
	private String dusterColor;
	
	protected Board() {
		System.out.println("This is no argument constructor in Board");
	}
	
	public Board(String chockPieceColor, String dusterColor) {
		this.dusterColor= dusterColor;
		this.chockPieceColor= chockPieceColor;
		System.out.println("Duster color: "+dusterColor);
		System.out.println("Chock piece color: "+chockPieceColor);
	}
	
}
