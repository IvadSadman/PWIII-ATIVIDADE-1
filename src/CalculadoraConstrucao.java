
public class CalculadoraConstrucao {
	public static void main(String[] args) {
		//CALCULOS CASA
		double area = area(20, 20);
		double percentual = 50;
		double areaConstru = area * percentual/100;
		double custoCasa = areaConstru * 60;
		System.out.println("O Custo da casa é: " + custoCasa);
		//CALCULOS PISCINA
		double diametroPerConstrucao = total(6, 75);
		System.out.println("O Custo da piscina é: " + diametroPerConstrucao);
		
		//TOTAL
		System.out.println("O Total da construção é: " + diametroPerConstrucao + custoCasa);
	
	}
	public static double area (double largura, double comprimento) {
		double area = largura * comprimento;
		return area;
	}
	public static double areaConstruida (double largura, double comprimento) {
		double areaConstru = area(largura, comprimento) * 50;
		return areaConstru;
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