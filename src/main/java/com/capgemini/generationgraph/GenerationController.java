package com.capgemini.generationgraph;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenerationController 
{
	
	@RequestMapping("/Graf")
	public Graf graf()
	{
		/**
		 * créé un nouveau composant parent
		 * le nomme
		 * lui donne un type de la classe componentType
		 */
		Component parent = new Component();
		parent.setName("ServiceRest");
		parent.setType(ComponentType.subsysteme);
		
		
		/**
		 * créé un nouveau composant
		 * le nomme
		 * lui donne un type de la classe componentType
		 * le met enfant du composant parent ServiceRest
		 */
		Component controller = new Component();
		controller.setName("controller");
		controller.setType(ComponentType.orchestration);
		controller.setParent(parent);
		
		Component projetRepository =new Component();
		projetRepository.setName("projetRepository");
		projetRepository.setType(ComponentType.businessService);
		controller.setParent(parent);
		
		Component CRUD =new Component();
		projetRepository.setName("CRUD");
		projetRepository.setType(ComponentType.subsysteme);
		controller.setParent(parent);
		
		Component BDD =new Component();
		projetRepository.setName("BDD");
		projetRepository.setType(ComponentType.bdd);
		controller.setParent(parent);
		
		
		/**
		 * créé de liens à partir du constructeur dans la class Link
		 * le nomme
		 * lui donne un depart puis un destination
		 */
		Link liensController = new Link("parent-controller",ComponentType.orchestration,controller,parent);
		Link liensprojetRepository = new Link("parent-projetRepository",ComponentType.businessService,projetRepository,parent);
		
		List<Component>components = new ArrayList();
		components.add(BDD);
		components.add(CRUD);
		components.add(projetRepository);
		components.add(controller);
		components.add(parent);
		
		List<Link> links = new ArrayList();
		links.add(liensprojetRepository);
		links.add(liensController);
		
		Graf graf = new Graf(components,links);
		
		return graf;
		
	}
}
