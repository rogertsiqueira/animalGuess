package animalTest

import game.Animal;

class ConfirmAnimalController {
	
	/**
	*If animal is correct, render to screen "checkOk"
	*/
	def yes() {
		render(view:"/animal/checkOk")
	}

	/**
	*This method send to screen insert new animal in this node "animal"
	*/
	def no() {
		Animal animal = Animal.get(params.id)
		render(view:"/animal/whatAnimal", model:[animal: animal])
	}
}
