package com.tagadvance.deck.plain;

import com.tagadvance.deck.Card;
import com.tagadvance.deck.CompositeStroke;
import com.tagadvance.deck.Rank;
import com.tagadvance.deck.Stroke;
import com.tagadvance.deck.StrokeFactory;

public class PlainCardStrokeFactory implements StrokeFactory {

	public PlainCardStrokeFactory() {

	}

	@Override
	public Stroke createStroke(Card card) {
		Rank rank = card.getRank();
		switch (rank) {
			case ACE:
				return new CompositeStroke(new CardStroke(card), new AceStroke(card));
			default:
				return new CardStroke(card);
		}
	}

}
