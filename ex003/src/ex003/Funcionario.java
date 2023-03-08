package ex003;

public class Funcionario {
	private int cracha;
	private String nome;
	private char tipoVinculo;
	private float qtdHora;
	private float valorHora;
	private float salario ;
	private float valorDesconto;
	
	public float CalcularValorSalario() {
		if(tipoVinculo == 'h') {
			return (valorHora * qtdHora) - valorDesconto;
		}else {
			return salario - valorDesconto;
		}
	}
	
	public String Imprimir() {
		String salario;
		if(tipoVinculo == 'h') {
			salario =  valorHora + " * " + qtdHora +" = " + valorHora * qtdHora;
		}else {
			salario = ""+ this.salario;
		}
		
		return 
		"Crachá: "+ cracha+
		"\nNome: "+ nome+
		"\nTipo Vinculo: "+ tipoVinculo+
		"\nSalario bruto: " + salario+
		"\nDesconto: "+ valorDesconto+
		"\nValor liquido a receber: "+ CalcularValorSalario();
	}
	
	public int getCracha() {
		return cracha;
	}
	public void setCracha(int cracha) {
		this.cracha = cracha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getTipoVinculo() {
		return tipoVinculo;
	}
	public void setTipoVinculo(char tipoVinculo) {
		this.tipoVinculo = tipoVinculo;
	}
	public float getQtdHora() {
		return qtdHora;
	}
	public void setQtdHora(float qtdHora) {
		this.qtdHora = qtdHora;
	}
	public float getValorHora() {
		return valorHora;
	}
	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public float getValorDesconto() {
		return valorDesconto;
	}
	public void setValorDesconto(float valorDesconto) {
		this.valorDesconto = valorDesconto;
	}
	
}