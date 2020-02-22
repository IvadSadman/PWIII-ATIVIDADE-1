
public class Piscina {
	public static void main(String[] args) {
		double diametroArea = total(6, 75);
		System.out.println(diametroArea);
	
	
	
	}
	public static double raio (double diametro) {
		double raio = diametro / 2;
		return raio;
	}
	public static double areaPiscina (double diametro) {
		double raio = raio(diametro);
		double area = Math.PI * Math.pow(raio, 2);
		return area;
	}
	public static double total(double diametro, double area) {
		double total = areaPiscina(diametro) * area;
		return total;
	}
	
}
