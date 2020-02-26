package main;

import manager.Manager;
import swing.DBManagerFrame;

public class Main {
	public static void main(String[] args) {
		Manager manager = new Manager();
		DBManagerFrame dbManagerFrame = new DBManagerFrame(manager);
	}
}