package com.tagadvance.deck;

import static com.google.common.base.Preconditions.checkNotNull;

public class Card {

	private final Rank rank;
	private final Suit suit;

	public Card(Rank rank, Suit suit) {
		this.rank = checkNotNull(rank, "rank must not be null");
		this.suit = checkNotNull(suit, "suit must not be null");
	}

	public Rank getRank() {
		return rank;
	}

	public Suit getSuit() {
		return suit;
	}

}
