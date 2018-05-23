package exercicio6_2;

public class TesteOrdenacao {
	public static void main(String[] args) {
		int[] vetor4 = {5312, 4342, 42311,2,-4,-1,-1321};
		int[] vetor3 = {5312, 4342, 42311,2,-4,-1,-1321};
		int[] vetor2 = {5312, 4342, 42311,2,-4,-1,-1321};
		int[] vetor1 = {5312, 4342, 42311,2,-4,-1,-1321};
		
		Ordenacao insert = new InsertSort();
		Ordenacao bubble = new Bolha();
		Ordenacao selection = new SelectionSort();
		Ordenacao quick = new Quicksort();
		
		insert.ordens(vetor1);
		
		for(int i = 0; i < vetor1.length; i++) {
			System.out.println(vetor1[i]);
		}
		
	}
}
