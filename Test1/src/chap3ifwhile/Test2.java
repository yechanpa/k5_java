package chap3ifwhile;

public class Test2 {

	public static void main(String[] args) {

		int i = 6;
		if(i%2 == 0) {
			if (i%3 == 0)
				System.out.println("6은 2,3의 배수이다");
			
		}
		
		for (int c = 1; c<15; c++)
			for (int j = 1; j < 16; j++)
				System.out.println(c + "X" + j + "="+ c*j);
	}

}
