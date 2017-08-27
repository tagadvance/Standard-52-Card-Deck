package com.tagadvance.deck;

import java.awt.Desktop;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.tagadvance.deck.plain.PlainCardStrokeFactory;

public class CreateCards {

	public static void main(String[] args) throws IOException {
		String tmpdir = System.getProperty("java.io.tmpdir");
		File tmp = new File(tmpdir);
		File testDir = new File(tmp, "test");
		testDir.mkdirs();
		System.out.println(testDir);


		ImageFactory imageFactory = CardImageFactory.newInstance();
		RenderingHints hints = RenderingHintsFactory.createQualityRenderingHints();
		StrokeFactory strokeFactory =
				new RenderingHintsStrokeFactory(hints, new PlainCardStrokeFactory());

		String formatName = "PNG";
		for (Rank rank : Rank.values()) {
			for (Suit suit : Suit.values()) {
				Card card = new Card(rank, suit);
				Stroke stroke = strokeFactory.createStroke(card);
				BufferedImage image = imageFactory.createBufferedImage();
				Canvas canvas = new BufferedImageCanvas(image);
				canvas.paint(stroke);

				// ImageIcon icon = new ImageIcon(image);
				// JOptionPane.showMessageDialog(null, icon);
				String name = String.format("%s-of-%ss.png", rank, suit).toLowerCase();
				File output = new File(testDir, name);
				ImageIO.write(image, formatName, output);
			}
		}
		
		Desktop.getDesktop().open(testDir);
	}

}
