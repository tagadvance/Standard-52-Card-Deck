package com.tagadvance.deck;

import static java.awt.RenderingHints.KEY_ALPHA_INTERPOLATION;
import static java.awt.RenderingHints.KEY_ANTIALIASING;
import static java.awt.RenderingHints.KEY_COLOR_RENDERING;
import static java.awt.RenderingHints.KEY_INTERPOLATION;
import static java.awt.RenderingHints.KEY_RENDERING;
import static java.awt.RenderingHints.VALUE_ALPHA_INTERPOLATION_DEFAULT;
import static java.awt.RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY;
import static java.awt.RenderingHints.VALUE_ALPHA_INTERPOLATION_SPEED;
import static java.awt.RenderingHints.VALUE_ANTIALIAS_DEFAULT;
import static java.awt.RenderingHints.VALUE_ANTIALIAS_OFF;
import static java.awt.RenderingHints.VALUE_ANTIALIAS_ON;
import static java.awt.RenderingHints.VALUE_COLOR_RENDER_DEFAULT;
import static java.awt.RenderingHints.VALUE_COLOR_RENDER_QUALITY;
import static java.awt.RenderingHints.VALUE_COLOR_RENDER_SPEED;
import static java.awt.RenderingHints.VALUE_INTERPOLATION_BICUBIC;
import static java.awt.RenderingHints.VALUE_INTERPOLATION_BILINEAR;
import static java.awt.RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR;
import static java.awt.RenderingHints.VALUE_RENDER_DEFAULT;
import static java.awt.RenderingHints.VALUE_RENDER_QUALITY;
import static java.awt.RenderingHints.VALUE_RENDER_SPEED;

import java.awt.RenderingHints;
import java.awt.RenderingHints.Key;
import java.util.HashMap;
import java.util.Map;

public class RenderingHintsFactory {

	private RenderingHintsFactory() {

	}

	/**
	 * ~3x faster than default.
	 * 
	 * @return
	 */
	public static RenderingHints createSpeedRenderingHints() {
		Map<Key, Object> map = new HashMap<>();
		map.put(KEY_ALPHA_INTERPOLATION, VALUE_ALPHA_INTERPOLATION_SPEED);
		map.put(KEY_ANTIALIASING, VALUE_ANTIALIAS_OFF);
		map.put(KEY_COLOR_RENDERING, VALUE_COLOR_RENDER_SPEED);
		map.put(KEY_INTERPOLATION, VALUE_INTERPOLATION_NEAREST_NEIGHBOR);
		map.put(KEY_RENDERING, VALUE_RENDER_SPEED);
		return new RenderingHints(map);
	}

	public static RenderingHints createBalancedRenderingHints() {
		Map<Key, Object> map = new HashMap<>();
		map.put(KEY_ALPHA_INTERPOLATION, VALUE_ALPHA_INTERPOLATION_DEFAULT);
		map.put(KEY_ANTIALIASING, VALUE_ANTIALIAS_DEFAULT);
		map.put(KEY_COLOR_RENDERING, VALUE_COLOR_RENDER_DEFAULT);
		map.put(KEY_INTERPOLATION, VALUE_INTERPOLATION_BILINEAR);
		map.put(KEY_RENDERING, VALUE_RENDER_DEFAULT);
		return new RenderingHints(map);
	}

	/**
	 * ~3x slower than default.
	 * 
	 * @return
	 */
	public static RenderingHints createQualityRenderingHints() {
		Map<Key, Object> map = new HashMap<>();
		map.put(KEY_ALPHA_INTERPOLATION, VALUE_ALPHA_INTERPOLATION_QUALITY);
		map.put(KEY_ANTIALIASING, VALUE_ANTIALIAS_ON);
		map.put(KEY_COLOR_RENDERING, VALUE_COLOR_RENDER_QUALITY);
		map.put(KEY_INTERPOLATION, VALUE_INTERPOLATION_BICUBIC);
		map.put(KEY_RENDERING, VALUE_RENDER_QUALITY);
		return new RenderingHints(map);
	}

}
