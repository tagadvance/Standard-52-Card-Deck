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
	public void paint(Stroke stroke) {
		Graphics2D g = image.createGraphics();

		int x = 0, y = 0;
		g.setClip(x, y, image.getWidth(), image.getHeight());

		stroke.paint(g);
		g.dispose();
	}

}
