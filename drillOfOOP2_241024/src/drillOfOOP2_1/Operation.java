package drillOfOOP2_1;

public interface Operation {
	int perform(int x, int y);
}

class Add implements Operation {
	public int perform(int x, int y) {
		return x + y;
	}
}

class Subtract implements Operation {
	public int perform(int x, int y) {
		return x - y;
	}
}

class Divide implements Operation {
	public int perform(int x, int y) {
		if(y == 0)
			return -1;
		return x / y;
	}
}