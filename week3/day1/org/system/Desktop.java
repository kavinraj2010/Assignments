package org.system;
//single inheritance example

public class Desktop extends Computer{
	public void desktopSize() {
		System.out.println("8GB RAM");
	}
	public static void main(String[] args) {
		Desktop get=new Desktop();
		get.computerModel();
		get.desktopSize();
		
	}
}
