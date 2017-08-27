package com.tagadvance.deck;

import static com.google.common.base.Preconditions.checkNotNull;

import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class RenderingHintsPaintbrushDecorator implements Stroke {

	private final Stroke paintbrush;
	private final RenderingHints hints;

	public RenderingHintsPaintbrushDecorator(Stroke stroke, RenderingHints hints) {
		super();
		this.paintbrush = checkNotNull(stroke, "stroke must not be null");
		this.hints = checkNotNull(hints, "hints must not be null");
	}

	@Override
	public void paint(Graphics2D g) {
		g.setRenderingHints(hints);
		paintbrush.paint(g);
	}

}
