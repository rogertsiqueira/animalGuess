package animalTest

import game.Animal;
import grails.transaction.Transactional;

@Transactional
class AnimalService {

	/**
	*This method is responsable for create the root tree with the initial animals
	*/
	public void beginningTree(){
		Animal root = new Animal();
		root.ask = "vive na água";
		root.save(flush:true)

		Animal left = new Animal();
		left.ask = "Tubarão";
		left.save(flush:true)
		root.left = left

		Animal right = new Animal();
		right.ask = "Macaco";
		right.save(flush:true)

		root.right = right
		root.save(flush:true)
	}

	/**
	*This method is responsable for insert the new animal uncovered of this node
	*/
	public void learn(Long currentId, String correctAnimal, String newQuestion) {
		Animal current = Animal.get(currentId)

		Animal left = new Animal()
		left.ask = correctAnimal
		left.save(flush:true)

		current.left = left

		Animal right = new Animal()
		right.ask = current.ask
		right.save(flush:true)

		current.right = right
		current.ask = newQuestion

		current.save(flush:true)
	}
	
	/**
	*This method is responsable for check is the data base is empty
	*@Return true if the DB is empty or false if it isn't empty 
	*/
	public boolean checkExists(){
		return Animal.list().isEmpty()
	}

	/**
	*This method is responsable for clear data base
	*/
	public void clearDatabase() {
		Animal.executeUpdate("delete from Animal")
	}
}
