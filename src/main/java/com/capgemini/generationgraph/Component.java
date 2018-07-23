package com.capgemini.generationgraph;

public class Component
{
	private String name;
	/**
	 * enumeration de composants
	 */
	private ComponentType enumeration;
	/**
	 * composant "parent" qui contiendra d'autres composants
	 */
	private Component parent;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the enumeration
	 */
	public ComponentType getEnumeration() {
		return enumeration;
	}
	/**
	 * @param enumeration the enumeration to set
	 */
	public void setType(ComponentType enumeration) {
		this.enumeration = enumeration;
	}
	/**
	 * @return the parent
	 */
	public Component getParent() {
		return parent;
	}
	/**
	 * @param parent the parent to set
	 */
	public void setParent(Component parent) {
		this.parent = parent;
	}
	

	

}
