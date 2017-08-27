package com.tagadvance.deck;

import static com.google.common.base.Preconditions.checkNotNull;

import java.awt.RenderingHints;

public class RenderingHintsStrokeFactory implements StrokeFactory {

	private final RenderingHints hints;
	private final StrokeFactory factory;

	public RenderingHintsStrokeFactory(RenderingHints hints, StrokeFactory factory) {
		super();
		this.hints = checkNotNull(hints, "hints must not be null");
		this.factory = checkNotNull(factory, "factory must not be null");
	}

	@Override
	public Stroke createStroke(Card card) {
		Stroke stroke = this.factory.createStroke(card);
		return new RenderingHintsPaintbrushDecorator(stroke, hints);
	}

}
