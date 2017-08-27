package com.tagadvance.deck;

public enum Rank {

	/**
	 * Ace
	 */
	ACE("A", "Ace"),
	/**
	 * A.K.A. <strong>deuce</strong>.
	 */
	TWO("2", "Two"),
	/**
	 * A.K.A. <strong>treys</strong>.
	 */
	THREE("3", "Three"),
	/**
	 * 
	 */
	FOUR("4", "Four"),
	/**
	 * 
	 */
	FIVE("5", "Five"),
	/**
	 * 
	 */
	SIX("6", "Six"),
	/**
	 * 
	 */
	SEVEN("7", "Seven"),
	/**
	 * 
	 */
	EIGHT("8", "Eight"),
	/**
	 * 
	 */
	NINE("9", "Nine"),
	/**
	 * 
	 */
	TEN("10", "Ten"),
	/**
	 * 
	 */
	JACK("J", "Jack"),
	/**
	 * 
	 */
	QUEEN("Q", "Queen"),
	/**
	 * 
	 */
	KING("K", "King");

	private String symbol;
	private String rank;

	private Rank(String symbol, String rank) {
		this.symbol = symbol;
		this.rank = rank;
	}

	public String getSymbol() {
		return symbol;
	}

	public String getRank() {
		return rank;
	}

}
