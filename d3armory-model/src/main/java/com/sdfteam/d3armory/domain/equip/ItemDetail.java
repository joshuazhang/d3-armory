package com.sdfteam.d3armory.domain.equip;

import java.util.List;

import com.sdfteam.d3armory.service.annotation.DataType;
import com.sdfteam.d3armory.service.annotation.RemoteConfiguration;
import com.sdfteam.d3armory.service.annotation.RemoteData;
import com.sdfteam.d3armory.service.remote.RemoteEntity;

/**
 * url ::= <host> "/api/d3/data/item/" <item-data>
 * GET /api/d3/data/item/COGHsoAIEgcIBBXIGEoRHYQRdRUdnWyzFB2qXu51MA04kwNAAFAKYJMD
 * Host: us.battle.net
 * 
 * @author joshuazhang
 */
@RemoteConfiguration(url = "http://<host>/api/d3/data/item/<item-data>")
public class ItemDetail extends RemoteEntity {

	private String displayColor;
	@RemoteData(type = DataType.IMAGE)
	private String icon;
	private String name;
	@RemoteData(type = DataType.HTML)
	private String tooltipParams;
	private Number requiredLevel;
	//以下是我自己加的
	private Number itemLevel;
	private Number bonusAffixes;
	private Number bonusAffixesMax;
	private Boolean accountBound;
	private String typeName;
	private ItemType type;
	private NumbericRange dps;
	private NumbericRange attacksPerSecond;
	private NumbericRange minDamage;
	private NumbericRange maxDamage;
	private List<String> attributes;
	private AttributesRaw attributesRaw;
	private NumbericRange armor;
	private List<Gem> gems;
	private List<SalvageItem> salvage;
	
	public List<String> getAttributes() {
		return attributes;
	}
	public void setAttributes(List<String> attributes) {
		this.attributes = attributes;
	}
	public NumbericRange getArmor() {
		return armor;
	}
	public void setArmor(NumbericRange armor) {
		this.armor = armor;
	}
	public List<Gem> getGems() {
		return gems;
	}
	public void setGems(List<Gem> gems) {
		this.gems = gems;
	}
	public List<SalvageItem> getSalvage() {
		return salvage;
	}
	public void setSalvage(List<SalvageItem> salvage) {
		this.salvage = salvage;
	}
	public String getDisplayColor() {
		return displayColor;
	}
	public void setDisplayColor(String displayColor) {
		this.displayColor = displayColor;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTooltipParams() {
		return tooltipParams;
	}
	public void setTooltipParams(String tooltipParams) {
		this.tooltipParams = tooltipParams;
	}
	public Number getRequiredLevel() {
		return requiredLevel;
	}
	public void setRequiredLevel(Number requiredLevel) {
		this.requiredLevel = requiredLevel;
	}
	public Number getItemLevel() {
		return itemLevel;
	}
	public void setItemLevel(Number itemLevel) {
		this.itemLevel = itemLevel;
	}
	public Number getBonusAffixes() {
		return bonusAffixes;
	}
	public void setBonusAffixes(Number bonusAffixes) {
		this.bonusAffixes = bonusAffixes;
	}
	public Number getBonusAffixesMax() {
		return bonusAffixesMax;
	}
	public void setBonusAffixesMax(Number bonusAffixesMax) {
		this.bonusAffixesMax = bonusAffixesMax;
	}
	public Boolean getAccountBound() {
		return accountBound;
	}
	public void setAccountBound(Boolean accountBound) {
		this.accountBound = accountBound;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public ItemType getType() {
		return type;
	}
	public void setType(ItemType type) {
		this.type = type;
	}
	public NumbericRange getDps() {
		return dps;
	}
	public void setDps(NumbericRange dps) {
		this.dps = dps;
	}
	public NumbericRange getAttacksPerSecond() {
		return attacksPerSecond;
	}
	public void setAttacksPerSecond(NumbericRange attacksPerSecond) {
		this.attacksPerSecond = attacksPerSecond;
	}
	public NumbericRange getMinDamage() {
		return minDamage;
	}
	public void setMinDamage(NumbericRange minDamage) {
		this.minDamage = minDamage;
	}
	public NumbericRange getMaxDamage() {
		return maxDamage;
	}
	public void setMaxDamage(NumbericRange maxDamage) {
		this.maxDamage = maxDamage;
	}
	public AttributesRaw getAttributesRaw() {
		return attributesRaw;
	}
	public void setAttributesRaw(AttributesRaw attributesRaw) {
		this.attributesRaw = attributesRaw;
	}
}
