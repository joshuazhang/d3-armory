package com.sdfteam.d3armory.domain.equip;

import com.sdfteam.d3armory.domain.artisanblacksmith.Item;

public class SalvageItem {

	private Item item;
	
	private Number chance;
	
	private Number quantity;

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Number getChance() {
		return chance;
	}

	public void setChance(Number chance) {
		this.chance = chance;
	}

	public Number getQuantity() {
		return quantity;
	}

	public void setQuantity(Number quantity) {
		this.quantity = quantity;
	}
}
