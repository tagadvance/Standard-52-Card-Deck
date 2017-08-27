package com.tagadvance.deck;

import java.awt.Graphics2D;

public class CompositeStroke implements Stroke {

	private final Stroke[] strokes;

	public CompositeStroke(Stroke... strokes) {
		super();
		this.strokes = strokes;
	}

	@Override
	public void paint(Graphics2D g) {
		for (Stroke stroke : this.strokes) {
			stroke.paint(g);
		}
	}

}
