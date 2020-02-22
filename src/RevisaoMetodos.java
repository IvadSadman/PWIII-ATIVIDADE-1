
public class RevisaoMetodos {
	public static void main(String[] args) {
		int proximo = proximo (20);
		System.out.println("Proximo numero será: " + proximo);
		int dobra = dobroProximo (2);
		System.out.println("Dobro do próximo será: " + dobra);
		int quadrado = quadradoNumero(5);
		System.out.println("Quadrado do numero é: " + quadrado);
		int cubo = cuboNumero(5);
		System.out.println("Cubo do numero é: " + cubo);
	}
	public static int proximo (int numeroProximo) {
		return numeroProximo + 1;
	}
	public static int dobroProximo(int numeroDobrado) {
		//return (numeroDobrado + 1) * 2;
		int valor = proximo(numeroDobrado);
		return valor * 2;
	}
	public static int quadradoNumero(int numeroQuadrado) {
		return numeroQuadrado * numeroQuadrado;
	}
	public static int cuboNumero(int numeroCubo) {
		return numeroCubo * numeroCubo * numeroCubo;
	}
	
}
