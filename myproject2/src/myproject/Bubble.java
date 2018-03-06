package myproject;

public class Bubble {
		String name="A";
		int age=2;
		public Bubble() {
			System.out.println(name);
		}
		public Bubble(String name, int age) {
			this.name = name;
			this.age = age;
		}
//排序
	public static void main(String[] args) {
		int[] n = new int[] { 51, 23, 6, 65, 15 };
		for (int i = 0; i <= 4; i++) {
			for (int j = i + 1; j <= 4; j++) {
				if (n[i] > n[j]) {
					int tmp = n[i];
					n[i] = n[j];
					n[j] = tmp;
				}				

			}

		}
		
		for (int i = 0; i <= 4; i++) 
		System.out.print(n[i]+" ");
		
		Bubble b = new Bubble("B",34);
		System.out.println(b.age);
		System.out.println(b.name);
		
	}
	
}