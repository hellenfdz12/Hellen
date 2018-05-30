public class Tablero {

	private String [][] tablero8;
	private String [][] tablero10;
	private String [][] tablero12;
	private String letra;

	public Tablero (){

		this.letra = letra;

		String [][] tablero8  = {
			{null, "A", "C", "D", "E", "F", "G", "H", "K"},
			{"1","*","*","*","*","*","*","*","*"},
			{"2","*","*","*","*","*","*","*","*"},
			{"3","*","*","*","*","*","*","*","*"},
			{"4","*","*","*","N","B","*","*","*"},
			{"5","*","*","*","B","N","*","*","*"},
			{"6","*","*","*","*","*","*","*","*"},
			{"7","*","*","*","*","*","*","*","*"},
			{"8","*","*","*","*","*","*","*","*"}
		};
		this.tablero8 = tablero8;

		String [][] tablero10 = {
			{null, "A", "C", "D", "E", "F", "G", "H", "K" ,"L", "M"},
			{"1 ","*","*","*","*","*","*","*","*", "*", "*"},
			{"2 ","*","*","*","*","*","*","*","*", "*", "*"},
			{"3 ","*","*","*","*","*","*","*","*", "*", "*"},
			{"4 ","*","*","*","*","*","*","*","*", "*", "*"},
			{"5 ","*","*","*","N","B","*","*","*", "*", "*"},
			{"6 ","*","*","*","B","N","*","*","*", "*", "*"},
			{"7 ","*","*","*","*","*","*","*","*", "*", "*"},
			{"8 ","*","*","*","*","*","*","*","*", "*", "*"},
			{"9 ","*","*","*","*","*","*","*","*", "*", "*"},
			{"10","*","*","*","*","*","*","*","*", "*", "*"},
		};
		this.tablero10 = tablero10;

		String [][] tablero12 = {
			{null, "A", "C", "D", "E", "F", "G", "H", "K" ,"L", "M", "O", "P"},
			{"1 ","*","*","*","*","*","*","*","*", "*", "*", "*", "*"},
			{"2 ","*","*","*","*","*","*","*","*", "*", "*", "*", "*"},
			{"3 ","*","*","*","*","*","*","*","*", "*", "*", "*", "*"},
			{"4 ","*","*","*","*","*","*","*","*", "*", "*", "*", "*"},
			{"5 ","*","*","*","*","*","*","*","*", "*", "*", "*", "*"},
			{"6 ","*","*","*","*","*","*","*","*", "*", "*", "*", "*"},
			{"7 ","*","*","*","*","*","*","*","*", "*", "*", "*", "*"},
			{"8 ","*","*","*","*","*","*","*","*", "*", "*", "*", "*"},
			{"9 ","*","*","*","*","*","*","*","*", "*", "*", "*", "*"},
			{"10","*","*","*","*","*","*","*","*", "*", "*", "*", "*"},
			{"11","*","*","*","*","*","*","*","*", "*", "*", "*", "*"},
			{"12","*","*","*","*","*","*","*","*", "*", "*", "*", "*"},
		};
		this.tablero12 = tablero12;
	}

	public int tamanioTablero( tamanio){
		int tamanio = JOptionPane.showInputDialog("Elija el tamanio del tablero deseado: ");
		switch () {
			
		}
	}

/*
	public String solicitarCoordenadas(String letra);
		this.letra = JOptionPane.showInputDialog("Digite las coordenadas que desea: ");
		*/




	public int switchLetras(String letra){
		int numeroCoordenada = -1;
		switch(letra){
			case "A":
				numeroCoordenada = 1;
				break;
			case "C":
				numeroCoordenada = 2;
				break;
			case "D":
				numeroCoordenada = 3;
				break;
			case "E":
				numeroCoordenada = 4;
				break;
			case "F":
				numeroCoordenada = 5;
				break;
			case "G":
				numeroCoordenada = 6;
				break;
			case "H":
				numeroCoordenada = 7;
				break;
			case "K":
				numeroCoordenada = 8;
				break;
			case "L":
				numeroCoordenada = 9;
				break;
			case "M":
				numeroCoordenada = 10;
				break;
			case "O":
				numeroCoordenada = 11;
				break;
			case "P":
				numeroCoordenada = 12;
				break;						
		}
		return numeroCoordenada;
	}
	


	public void imprimirTablero (){
		String 
		for (int fila = 0 ; fila < tablero.length; fila++){
			for (int columna = 0; tablero[fila] != null && 
				columna < tablero[fila].length; columna++){
				System.out.print(tablero[fila][columna] +" ");
			}
			System.out.println();
		}
	}

}