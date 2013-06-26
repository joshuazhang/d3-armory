package com.sdfteam.d3armory.domain.hero;

import java.util.List;

public class HeroSkillContainer {
	private List<SkillWithRune> active;
	private List<SkillWithRune> passive;
	public List<SkillWithRune> getActive() {
		return active;
	}
	public void setActive(List<SkillWithRune> active) {
		this.active = active;
	}
	public List<SkillWithRune> getPassive() {
		return passive;
	}
	public void setPassive(List<SkillWithRune> passive) {
		this.passive = passive;
	}
}
