package com.capgemini.generationgraph;


import java.util.ArrayList;
import java.util.List;

public class Graf 
{
/**
 * Une liste est une interface
 * ArrayList est une classe qui implémente l'interface List.
 * égale à "public List<Component> component = new List<Component>();"
 * comme il y à "new" les chevrons  deviennent dispensables
 */
	public List<Component> component;



	public List<Link> link;
	
	/**
	 * constructeur qui à en parametre é listes
	 * @param _component une liste de composants
	 * @param _link une liste de liens
	 */
	public Graf (List<Component>_component,List<Link> _link)
	{
		this.component=_component;
		this.link = _link;
		
	}
	
	
		
		public List getComponent() 
		{
		return component;
		}
		
		public void setComponent(List component) 
		{
			this.component = component;
		}
		
		public List getLink() 
		{
			return link;
		}
		
		public void setLink(List link) 
		{
			this.link = link;
		}
			

}
