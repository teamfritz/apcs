package projects;

public class ArrayList {
	private Object array[];
	int logicSize;
	
	public ArrayList() {
		array = new Object[5];
	}
	
	public ArrayList(int size) {
		array = new Object[size];
	}
	
	public ArrayList(Object[] iArray) {
		logicSize = 0;
		this.array = new Object[array.length];
		for (int i = 0; i < array.length; i++) {
			array[i] = iArray[i];
			logicSize++;
		}
	}
	
	public String toString() {
		String result = "";
	}
}
