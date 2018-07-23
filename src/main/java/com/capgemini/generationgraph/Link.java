package com.capgemini.generationgraph;

/**
 * @author mihamidi
 *
 */

public class Link 
{
	
	protected	String name;
	protected	ComponentType LinkType ;
	protected	Component from;
	protected	Component to;
		
	/**
	 * @author mihamidi
	 *constructeur de lien avec un nom,un type et deux directions
	 */	
	public Link(String _name,ComponentType _LinkType,Component _from,Component  _to)
	{
		this.name=_name;
		this.LinkType=_LinkType;
		this.to=_to;
		this.from=_from;
	}


	/**
	 * @return the name
	 */
	public String getName() 
	{
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) 
	{
		this.name = name;
	}


	/**
	 * @return the linkType
	 */
	public ComponentType getLinkType() 
	{
		return LinkType;
	}


	/**
	 * @param linkType the linkType to set
	 */
	public void setLinkType(ComponentType linkType) 
	{
		LinkType = linkType;
	}


	/**
	 * @return the from
	 */
	public Component getFrom() 
	{
		return from;
	}


	/**
	 * @param from the from to set
	 */
	public void setFrom(Component from) 
	{
		this.from = from;
	}


	/**
	 * @return the to
	 */
	public Component getTo()
	{
		return to;
	}


	/**
	 * @param to the to to set
	 */
	public void setTo(Component to) 
	{
		this.to = to;
	}

}
