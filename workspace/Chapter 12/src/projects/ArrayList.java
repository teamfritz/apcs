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
		for (int i = 0; i < logicSize; i++) {
			if (!(array[i] == null)) {
				result += array[i] + ",";
			}
		}
		if (result.equals("")) {
			return "";
		} else {
			try {
				result = result.substring(0, (result.length()-1));
			} catch (Exception e) {
				return "failed";
			}
		}
		return result;
	}
	
	//Implementation for project 2:
	
	public int size() {
		return logicSize;
	}
	
	public Object get(int i) {
		return array[i];
	}
	
	//implementation of project 3:
	
	public Object remove(int target) {
		if (target < 0 || target > logicSize - 1) {
			//throw IndexOutOfBoundsException;
		}
		Object temp = array[target];
		for (int i = target; i < logicSize - 1; i++) {
			array[i] = array[i + 1];
		}
			array[logicSize-1] = null;
			logicSize--;
			return temp;
	}
	
	public  boolean add(int target, Object value) {
		if (logicSize == array.length) {
			return false;
		}
		if (target < 0) {
			return false;
		}
		if (target >= logicSize) {
			target = logicSize;
		}
		for (int i = logicSize; i > target; i--) {
		array[i] = array[i-1];
		}
		array[target] = value;
		logicSize++;
		return true;
		}
}
