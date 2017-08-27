package com.tagadvance.deck;

import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

public class CardImageFactory implements ImageFactory {

	private static final int DEFAULT_DPI = 72;

	private static final double WIDTH = 2.5, HEIGHT = 3.5;

	private final int dpi;

	// TODO: unit test
	public static CardImageFactory newInstance() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		int dpi = GraphicsEnvironment.isHeadless() ? DEFAULT_DPI : toolkit.getScreenResolution();
		return new CardImageFactory(dpi);
	}

	public CardImageFactory(int dpi) {
		super();
		this.dpi = dpi;
	}

	@Override
	public BufferedImage createBufferedImage() {
		int width = (int) (dpi * WIDTH);
		int height = (int) (dpi * HEIGHT);
		return new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
	}

}
