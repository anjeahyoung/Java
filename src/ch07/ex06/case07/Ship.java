package ch07.ex06.case07;

import java.util.List;

public class Ship {
	private List<Container<?>> containers;
	
	public Ship() {
		containers = new Container<>();
	}
	
	public void put(Container<?> container) {
		this.containers.add(container);
	}
}
