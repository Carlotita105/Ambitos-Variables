package Main;

public class main {

	public static int a=5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FuncionUno();
		System.out.println("valor de a en el Main" +a);
		
	}
	static void FuncionUno() {
		int b=3;
		while (a<6) {
			int c=7;
			System.out.println("Valor de a:" + a+ "\nValor de b:"+ b+"\nValor de c:" +c);
			++a;
			++b;
			++c;
			
		}
	}
}
