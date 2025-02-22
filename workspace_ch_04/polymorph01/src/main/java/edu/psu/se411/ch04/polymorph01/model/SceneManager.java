package edu.psu.se411.ch04.polymorph01.model;

import java.util.ArrayList;
import java.util.List;

public class SceneManager {

	List<ISceneObject> sceneObjects;
	
	public SceneManager() {
		sceneObjects = new ArrayList<ISceneObject>();
	}
	
	public List<ISceneObject> getSceneObjects() {
		return this.sceneObjects;
	}
	
}
