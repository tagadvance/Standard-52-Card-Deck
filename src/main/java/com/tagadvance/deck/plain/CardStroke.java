package com.tagadvance.deck.plain;

import static com.google.common.base.Preconditions.checkNotNull;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.RoundRectangle2D;

import com.tagadvance.deck.Card;
import com.tagadvance.deck.Stroke;
import com.tagadvance.deck.Rank;
import com.tagadvance.deck.Suit;

public class CardStroke implements Stroke {

	private Card card;

	public CardStroke(Card card) {
		super();
		this.card = checkNotNull(card, "card must not be null");
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = checkNotNull(card, "card must not be null");
	}

	@Override
	public void paint(Graphics2D g) {
		Rectangle bounds = g.getClipBounds();

		// background
		g.setColor(Color.WHITE);
		// g.fillRect(0, 0, width, height);
		double x = 0, y = 0, w = bounds.width - 1, h = bounds.height - 1, arcW = 45, arcH = 45;
		RoundRectangle2D roundedRectangle = new RoundRectangle2D.Double(x, y, w, h, arcW, arcH);
		g.fill(roundedRectangle);

		Suit suit = card.getSuit();
		Color color = suit.getColor();
		g.setColor(color);

		Rank rank = card.getRank();
		String rankSymbol = rank.getSymbol();
		char symbol = suit.getSymbol();
		String symbolString = Character.toString(symbol);

		drawCorners(g, bounds.width, bounds.height, rankSymbol, symbolString);
	}

	protected void drawCorners(Graphics2D g, int width, int height, String rankSymbol,
			String symbolString) {
		Font font = g.getFont();
		float fontSize = (float) (height * .15);
		font = font.deriveFont(fontSize);
		g.setFont(font);

		/*
		 * Top left
		 */
		FontMetrics metrics = g.getFontMetrics();
		int margin = (int) (width * .05);
		int ascent = metrics.getAscent(), descent = metrics.getDescent();
		int x1 = margin, y1 = margin + ascent - descent;
		g.drawString(rankSymbol, x1, y1);

		int rankSymbolWidth = metrics.stringWidth(rankSymbol);
		int symbolWidth = metrics.stringWidth(symbolString);
		int symbolOffsetX = (rankSymbolWidth - symbolWidth) / 2;
		int x2 = margin + symbolOffsetX;
		int marginOffset = margin / 2;
		int y2 = (y1 * 2) - marginOffset;
		g.drawString(symbolString, x2, y2);

		/*
		 * Bottom Right
		 * 
		 * @see http://stackoverflow.com/a/9559043/625688
		 */
		AffineTransform originalTransform = g.getTransform();
		try {
			double sx = -1, sy = -1;
			AffineTransform transform = AffineTransform.getScaleInstance(sx, sy);
			transform.translate(-width, -height);
			g.transform(transform);
			g.drawString(rankSymbol, x1, y1);
			g.drawString(symbolString, x2, y2);
		} finally {
			g.setTransform(originalTransform);
		}
	}

}
