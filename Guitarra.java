package unidade_1;
import java.text.NumberFormat;

//Declaração da Classe
class Guitarra {
	
	// Atributos (Privados)
	private String numeroSerie, fabricante, modelo, tipo, madeira;
	private double preco;
	
	// Método Constructor
	public Guitarra(String numeroSerie, String fabricante, 
			String modelo, String tipo, String madeira, double preco) {
		this.numeroSerie = numeroSerie;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.tipo = tipo;
		this.madeira = madeira;
		this.preco = preco;
	}
	
	// Metódos Getters e Setters
	// Gerar automáticamente utilizando Eclipse:
	// Botão direito -> Source -> Generate Getters and Setters
	
	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMadeira() {
		return madeira;
	}

	public void setMadeira(String madeira) {
		this.madeira = madeira;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void imprimirFichaTecnica() {
		System.out.println("****** FICHA TÉCNICA **********");
		System.out.println("N° Série..: " + this.getNumeroSerie());
		System.out.println("Fabricante: " + this.getFabricante());
		System.out.println("Modelo....: " + this.getModelo());
		System.out.println("Tipo......: " + this.getTipo());
		System.out.println("Madeira...: " + this.getMadeira());
		//System.out.println("Preço R$..: " + this.getPreco());
		System.out.println("Preço.....: " + NumberFormat.getCurrencyInstance().format(this.getPreco()));
		System.out.println("******************************");
	}

	// Método Main
	public static void main(String[] args) {
		
		   // Criando o Objeto minhaGuitarra do tipo -> Guitarra
		   Guitarra minhaGuitarra = new Guitarra("93200", "Les Paul", "Standard Sunburst","Elétrica","Mogno", 2237000.00);
		 
		   // Testando dados do Objeto + Métodos Gets
		   minhaGuitarra.imprimirFichaTecnica();
	}

}