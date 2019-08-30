package com.askmeipaas;

/*
 * The Singleton's purpose is to control object creation, 
 * limiting the number of objects to only one. 
 * Since there is only one Singleton instance, 
 * any instance fields of a Singleton will occur only once per class, 
 * just like static fields. 
 * Singletons often control access to resources, 
 * such as database connections or sockets.
 */

public class Singleton {

	static private Singleton instance = null;

	// Exists only to defeat instantiation.
	private Singleton() {
	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

}
