package edu.psu.se411.ch04.polymorph01;

import edu.psu.se411.ch04.polymorph01.model.SceneAsset;
import edu.psu.se411.ch04.polymorph01.model.SceneManager;

public class App {

	public static void main(String[] args) {
		SceneManager manager = new SceneManager();
		
		String[] ids = {"1", "2", "3", "4"};
		
		
		for(String id: ids) {
			manager.getSceneObjects().add(new SceneAsset(id));
		}

		manager.getSceneObjects().forEach(so -> so.draw());
		
	}

}
