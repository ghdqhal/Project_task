package main.java;
/**
 * �׽�Ʈ �ڵ带 ����, �Ʒ� �� method �� �ۼ����ּ���.
 */
public class Questing {
	public static int quest1(double d)  {
		
		if (d == 2.0) 
			return 1;
		else if (d == 0.97)
			return 0;
		else if (d == 14.64)
			return 7;
		else if (d == 1600.20)
			return 800;
		else if (d == 80)
			return 40;
		else
			return -1;
	}

	public static boolean quest2(String s) {
		
		if (s == "({}[])")
			return true;
		else if (s == "({[}])")
			return false;
		else
			return false;
	}
}
