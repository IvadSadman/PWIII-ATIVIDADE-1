
public class Casa {
	public static void main(String[] args) {
		
		double area = area(20, 20);
		System.out.println(area);
		double percentual = 50;
		double areaConstru = area * percentual/100;
		System.out.println(areaConstru);
		double custo = areaConstru * 60;
		System.out.println(custo);
	}
	public static double area (double largura, double comprimento) {
		double area = largura * comprimento;
		return area;
	}
	public static double areaConstruida (double largura, double comprimento) {
		double areaConstru = area(largura, comprimento) * 50;
		return areaConstru;
	}
}