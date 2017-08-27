package com.tagadvance.deck;

import static com.google.common.base.Preconditions.checkNotNull;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class BufferedImageCanvas implements Canvas {

	private final BufferedImage image;

	public BufferedImageCanvas(BufferedImage image) {
		super();
		this.image = checkNotNull(image, "image must not be null");
	}

	@Override
	public void paint(Paintbrush paintbrush) {
		Graphics2D g = image.createGraphics();
		paintbrush.paint(g);
		g.dispose();
	}

}
