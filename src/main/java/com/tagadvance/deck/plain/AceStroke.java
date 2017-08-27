package com.tagadvance.deck.plain;

import static com.google.common.base.Preconditions.checkNotNull;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import com.tagadvance.deck.Card;
import com.tagadvance.deck.Rank;
import com.tagadvance.deck.Stroke;

public class AceStroke implements Stroke {

	private Card card;

	public AceStroke(Card card) {
		super();
		this.card = checkNotNull(card, "card must not be null");
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = checkNotNull(card);
	}

	@Override
	public void paint(Graphics2D g) {
		Rectangle bounds = g.getClipBounds();

		Font font = g.getFont();
		float fontSize = (float) (bounds.height * .6);
		font = font.deriveFont(fontSize);
		g.setFont(font);

		FontMetrics metrics = g.getFontMetrics();
		Rank rank = card.getRank();
		String symbolString = rank.getSymbol();
		int symbolWidth = metrics.stringWidth(symbolString);
		int metricsHeight = metrics.getHeight(), ascent = metrics.getAscent();
		int x = (bounds.width - symbolWidth) / 2;
		// http://stackoverflow.com/a/27740330/625688
		int y = ((bounds.height - metricsHeight) / 2) + ascent;
		g.drawString(symbolString, x, y);
	}

}
