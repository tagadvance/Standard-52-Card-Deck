package com.tagadvance.deck;

import java.awt.Graphics2D;
import java.util.Collection;

public class CompositeStroke implements Stroke {

	private final Collection<Stroke> strokes;

	public CompositeStroke(Collection<Stroke> strokes) {
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
