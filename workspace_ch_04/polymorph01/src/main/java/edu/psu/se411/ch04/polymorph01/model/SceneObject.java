package edu.psu.se411.ch04.polymorph01.model;

public abstract class SceneObject implements ISceneObject {

	private final String id;
	
	public SceneObject(String _id) {
		this.id = _id;
	}
	
	public String getId() {
		return this.id;
	}
}
