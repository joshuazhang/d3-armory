package com.sdfteam.d3armory.domain.equip;

import java.util.List;

import com.sdfteam.d3armory.domain.artisanblacksmith.Item;

/**
 * 宝石
 * @author joshuazhang
 *
 */
public class Gem {

	private Item item;
	
	private List<String> attributes;

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public List<String> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<String> attributes) {
		this.attributes = attributes;
	}
}
