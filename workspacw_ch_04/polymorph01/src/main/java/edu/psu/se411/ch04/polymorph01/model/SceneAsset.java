package edu.psu.se411.ch04.polymorph01.model;

public class SceneAsset extends SceneObject {

	public SceneAsset(String _id) {
		super(_id);
	}
	
	@Override
	public void draw() {
		System.out.printf("Drawing SceneAsset object %s%n", getId());
	}

}
