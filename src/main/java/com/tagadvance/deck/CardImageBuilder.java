package com.tagadvance.deck;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CardImageBuilder {

	private final ImageFactory imageFactory;
	private final List<Stroke> paintbrushes;

	public CardImageBuilder(ImageFactory imageFactory, Stroke... paintbrushes) {
		super();
		this.imageFactory = imageFactory;
		this.paintbrushes = new ArrayList<>(Arrays.asList(paintbrushes));
	}

	public void addPaintbrush(Stroke paintbrush) {
		paintbrushes.add(paintbrush);
	}

	public void removePaintbrush(Stroke paintbrush) {
		paintbrushes.remove(paintbrush);
	}

	public BufferedImage drawFFS() {
		BufferedImage image = imageFactory.createBufferedImage();
		Canvas canvas = new BufferedImageCanvas(image);
		for (Stroke paintbrush : paintbrushes) {
			canvas.paint(paintbrush);
		}
		return image;
	}

}
