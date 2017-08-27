package com.tagadvance.deck;

import java.awt.Color;

/**
 * http://en.wikipedia.org/wiki/Suit_(cards)
 */
public enum Suit {

	/**
	 * 
	 */
	CLUB('\u2663', Color.BLACK),
	/**
	 * 
	 */
	DIAMOND('\u2666', Color.RED),
	/**
	 * v
	 */
	HEART('\u2665', Color.RED),
	/**
	 * 
	 */
	SPADE('\u2660', Color.BLACK);

	private final char symbol;
	private final Color color;

	private Suit(char symbol, Color color) {
		this.symbol = symbol;
		this.color = color;
	}

	public char getSymbol() {
		return this.symbol;
	}

	public Color getColor() {
		return this.color;
	}

}
