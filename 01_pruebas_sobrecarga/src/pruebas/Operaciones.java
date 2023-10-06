package pruebas;

public class Operaciones {
	public int sum(int ... numeros) {
		int suma=0;
		for (int num:numeros){
			suma+=num;
		}
		return suma;
	}
	//si se llama con un int, el orden de preferencia
	// es este:
	public int multi(int s) {
	return 10;
}
	public int multi(long k) {
		return 100 ;
	}
	public int multi(Integer n) {
		return 40;
	}
	public int multi(int...datos) {
		return 30;
	}
	// sobre carga no valida 
	public int div(int ... nums) {
		return 40;
}
	public int div()
}