package animalTest

import game.Animal;

class AnimalController {

	def animalService

	/**
	 * This method redirect to initial page of the game
	 * 
	 */
	def home(){
		render(view:"/animal/index")
	}

	/**
	 * Method responsable for check if the animal tree exist or not, creating when not exists,
	 * and after, return the first element of the tree or root node.
	 */
	def play(){
		Animal root
		if(animalService.checkExists()) animalService.beginningTree()
		root = Animal.list().get(0)

		render(view:"/animal/start",  model:[animal: root])
	}

	/**
	 * Start the game checking if the animal is animal root
	 */
	def start(){
		Animal root = Animal.get(params.id)
		render(view:"/animal/askSkill",  model:[animal: root])
	}

	/**
	 * This method is use if the user confirm the animal skill, if the node is leaf,
	 * the method call the view "askCheckAnimal" of left animal or check the skill 
	 * animal left if it isn't leaf 
	 */
	def yes() {
		Animal animal = Animal.get(params.id)
		if(!animal.left.isLeaf()) {
			render(view:"/animal/askSkill", model:[animal: animal.left])
		} else {
			render(view:"/animal/askCheckAnimal", model:[animal: animal.left])
		}
	}

	/**
	 * This method is use if the user confirm the animal skill, if the node is leaf,
	 * the method call the view "askCheckAnimal" of right animal or check the skill
	 * animal right if it isn't leaf	 
	 */
	def no() {
		Animal animal = Animal.get(params.id)
		if(!animal.right.isLeaf()) {
			render(view:"/animal/askSkill", model:[animal: animal.right])
		} else {
			render(view:"/animal/askCheckAnimal", model:[animal: animal.right])
		}
	}

	/**
	 * This method is responsable for save the new animal
	 */
	def save() {
		animalService.learn(params.long("id"), params.nome, params.carac)

		redirect(action:"play")
	}

	/**
	 * This method is responsable for clear data base
	 */
	def clearDB() {
		animalService.clearDatabase()
		render(view:"/animal/index")
	}
}
