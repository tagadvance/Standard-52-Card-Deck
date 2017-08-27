package com.tagadvance.deck;

import static org.junit.Assert.assertNotNull;

import java.awt.RenderingHints;

import org.junit.Test;

public class RenderingHintsFactoryTest {

	@Test
	public void createSpeedRenderingHintsIsNotNull() {
		RenderingHints hints = RenderingHintsFactory.createSpeedRenderingHints();
		assertNotNull(hints);
	}

	@Test
	public void createBalancedRenderingHintsIsNotNull() {
		RenderingHints hints = RenderingHintsFactory.createBalancedRenderingHints();
		assertNotNull(hints);
	}

	@Test
	public void createQualityRenderingHintsIsNotNull() {
		RenderingHints hints = RenderingHintsFactory.createQualityRenderingHints();
		assertNotNull(hints);
	}

}
