package com.sdfteam.d3armory.domain.equip;

import com.google.gson.annotations.SerializedName;

public class AttributesRaw {

	//武器
	private NumbericRange Attacks_Per_Second_Item;
	
	private NumbericRange Durability_Max;
	
	private NumbericRange Sockets;
	
	private NumbericRange Intelligence_Item;
	
	private NumbericRange Durability_Cur;
	
	@SerializedName("Damage_Weapon_Delta#Fire")
	private NumbericRange Damage_Weapon_Delta_Fire;
	
	@SerializedName("Damage_Weapon_Min#Fire")
	private NumbericRange Damage_Weapon_Min_Fire;
	
	@SerializedName("Damage_Weapon_Delta#Cold")
	private NumbericRange Damage_Weapon_Delta_Cold;
	
	@SerializedName("Damage_Weapon_Min#Cold")
	private NumbericRange Damage_Weapon_Min_Cold;
	
	@SerializedName("Damage_Weapon_Delta#Poison")
	private NumbericRange Damage_Weapon_Delta_Poison;
	
	@SerializedName("Damage_Weapon_Min#Poison")
	private NumbericRange Damage_Weapon_Min_Poison;
	
	@SerializedName("Damage_Weapon_Delta#Lightning")
	private NumbericRange Damage_Weapon_Delta_Lightning;
	
	@SerializedName("Damage_Weapon_Min#Lightning")
	private NumbericRange Damage_Weapon_Min_Lightning;
	
	@SerializedName("Damage_Weapon_Delta#Arcane")
	private NumbericRange Damage_Weapon_Delta_Arcane;
	
	@SerializedName("Damage_Weapon_Min#Arcane")
	private NumbericRange Damage_Weapon_Min_Arcane;
	
	@SerializedName("Damage_Weapon_Min#Physical")
	private NumbericRange Damage_Weapon_Min_Physical;
	
	@SerializedName("Resource_Regen_Per_Second#Mana")
	private NumbericRange Resource_Regen_Per_Second_Mana;
	
	private NumbericRange Item_Level_Requirement_Reduction;
	
	@SerializedName("Damage_Weapon_Delta#Physical")
	private NumbericRange Damage_Weapon_Delta_Physical;
	
	private NumbericRange Dexterity_Item;

	//防具
	private NumbericRange Strength_Item;
	
	@SerializedName("Resistance#Arcane")
	private NumbericRange Resistance_Arcane;
	
	@SerializedName("Thorns_Fixed#Physical")
	private NumbericRange Thorns_Fixed_Physical;
	
	private NumbericRange Armor_Item;
	
	private NumbericRange Armor_Bonus_Item;
	
	private NumbericRange Hitpoints_Regen_Per_Second;
	
	@SerializedName("Damage_Weapon_Bonus_Min_X1#Physical")
	private NumbericRange Damage_Weapon_Bonus_Min_X1_Physical;
	
	@SerializedName("Damage_Weapon_Bonus_Delta#Physical")
	private NumbericRange Damage_Weapon_Bonus_Delta_Physical;
	
	public NumbericRange getStrength_Item() {
		return Strength_Item;
	}

	public void setStrength_Item(NumbericRange strength_Item) {
		Strength_Item = strength_Item;
	}

	public NumbericRange getResistance_Arcane() {
		return Resistance_Arcane;
	}

	public void setResistance_Arcane(NumbericRange resistance_Arcane) {
		Resistance_Arcane = resistance_Arcane;
	}

	public NumbericRange getThorns_Fixed_Physical() {
		return Thorns_Fixed_Physical;
	}

	public void setThorns_Fixed_Physical(NumbericRange thorns_Fixed_Physical) {
		Thorns_Fixed_Physical = thorns_Fixed_Physical;
	}

	public NumbericRange getArmor_Item() {
		return Armor_Item;
	}

	public void setArmor_Item(NumbericRange armor_Item) {
		Armor_Item = armor_Item;
	}

	public NumbericRange getArmor_Bonus_Item() {
		return Armor_Bonus_Item;
	}

	public void setArmor_Bonus_Item(NumbericRange armor_Bonus_Item) {
		Armor_Bonus_Item = armor_Bonus_Item;
	}

	public NumbericRange getHitpoints_Regen_Per_Second() {
		return Hitpoints_Regen_Per_Second;
	}

	public void setHitpoints_Regen_Per_Second(
			NumbericRange hitpoints_Regen_Per_Second) {
		Hitpoints_Regen_Per_Second = hitpoints_Regen_Per_Second;
	}

	public NumbericRange getDamage_Weapon_Bonus_Min_X1_Physical() {
		return Damage_Weapon_Bonus_Min_X1_Physical;
	}

	public void setDamage_Weapon_Bonus_Min_X1_Physical(
			NumbericRange damage_Weapon_Bonus_Min_X1_Physical) {
		Damage_Weapon_Bonus_Min_X1_Physical = damage_Weapon_Bonus_Min_X1_Physical;
	}

	public NumbericRange getDamage_Weapon_Bonus_Delta_Physical() {
		return Damage_Weapon_Bonus_Delta_Physical;
	}

	public void setDamage_Weapon_Bonus_Delta_Physical(
			NumbericRange damage_Weapon_Bonus_Delta_Physical) {
		Damage_Weapon_Bonus_Delta_Physical = damage_Weapon_Bonus_Delta_Physical;
	}

	public NumbericRange getAttacks_Per_Second_Item() {
		return Attacks_Per_Second_Item;
	}

	public void setAttacks_Per_Second_Item(NumbericRange attacks_Per_Second_Item) {
		Attacks_Per_Second_Item = attacks_Per_Second_Item;
	}

	public NumbericRange getDurability_Max() {
		return Durability_Max;
	}

	public void setDurability_Max(NumbericRange durability_Max) {
		Durability_Max = durability_Max;
	}

	public NumbericRange getSockets() {
		return Sockets;
	}

	public void setSockets(NumbericRange sockets) {
		Sockets = sockets;
	}

	public NumbericRange getIntelligence_Item() {
		return Intelligence_Item;
	}

	public void setIntelligence_Item(NumbericRange intelligence_Item) {
		Intelligence_Item = intelligence_Item;
	}

	public NumbericRange getDurability_Cur() {
		return Durability_Cur;
	}

	public void setDurability_Cur(NumbericRange durability_Cur) {
		Durability_Cur = durability_Cur;
	}

	public NumbericRange getDamage_Weapon_Delta_Fire() {
		return Damage_Weapon_Delta_Fire;
	}

	public void setDamage_Weapon_Delta_Fire(NumbericRange damage_Weapon_Delta_Fire) {
		Damage_Weapon_Delta_Fire = damage_Weapon_Delta_Fire;
	}

	public NumbericRange getDamage_Weapon_Min_Fire() {
		return Damage_Weapon_Min_Fire;
	}

	public void setDamage_Weapon_Min_Fire(NumbericRange damage_Weapon_Min_Fire) {
		Damage_Weapon_Min_Fire = damage_Weapon_Min_Fire;
	}

	public NumbericRange getDamage_Weapon_Min_Physical() {
		return Damage_Weapon_Min_Physical;
	}

	public void setDamage_Weapon_Min_Physical(
			NumbericRange damage_Weapon_Min_Physical) {
		Damage_Weapon_Min_Physical = damage_Weapon_Min_Physical;
	}

	public NumbericRange getResource_Regen_Per_Second_Mana() {
		return Resource_Regen_Per_Second_Mana;
	}

	public void setResource_Regen_Per_Second_Mana(
			NumbericRange resource_Regen_Per_Second_Mana) {
		Resource_Regen_Per_Second_Mana = resource_Regen_Per_Second_Mana;
	}

	public NumbericRange getItem_Level_Requirement_Reduction() {
		return Item_Level_Requirement_Reduction;
	}

	public void setItem_Level_Requirement_Reduction(
			NumbericRange item_Level_Requirement_Reduction) {
		Item_Level_Requirement_Reduction = item_Level_Requirement_Reduction;
	}

	public NumbericRange getDamage_Weapon_Delta_Physical() {
		return Damage_Weapon_Delta_Physical;
	}

	public void setDamage_Weapon_Delta_Physical(
			NumbericRange damage_Weapon_Delta_Physical) {
		Damage_Weapon_Delta_Physical = damage_Weapon_Delta_Physical;
	}

	public NumbericRange getDexterity_Item() {
		return Dexterity_Item;
	}

	public void setDexterity_Item(NumbericRange dexterity_Item) {
		Dexterity_Item = dexterity_Item;
	}
	
}
