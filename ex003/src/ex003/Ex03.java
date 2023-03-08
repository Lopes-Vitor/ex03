package ex003;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
		Funcionario p = new Funcionario();
		int a = 0;
		
		while(a != 4) {
				System.out.println("-- Menu --");
				System.out.println("Digite o numero para selecionar");
				System.out.println("1 - Criar Funcionário");
				System.out.println("2 - Folha de Pagamento");
				System.out.println("3 - Alterar remuneração");
				System.out.println("4 - Sair");
			a = l.nextInt();
			
			switch(a) {
			case 1:
				System.out.println("Digite seu Cracha: ");
				p.setCracha(l.nextInt());
				System.out.println("Digite seu Nome: ");
				p.setNome(l.next());
				System.out.println("Digite o seu tipo de vinculo empregaticio ");
				p.setTipoVinculo(l.next().charAt(0));
				if(p.getTipoVinculo() == 'h') {
					System.out.println("Valor Hora: ");
						p.setValorHora(l.nextFloat());
					System.out.println("Quantidade de horas trabalhadas: ");
						p.setQtdHora(l.nextFloat());
				}else {
					System.out.println("Salario: ");
						p.setSalario(l.nextFloat());
				}
					System.out.println("Digite o valor do desconto: ");
						p.setValorDesconto(l.nextFloat());
				break;
			case 2:
				 System.out.println(p.Imprimir());
				break;
			case 3:
				if(p.getTipoVinculo() == 'h') {
					System.out.println("Valor Hora: ");
						p.setValorHora(l.nextFloat());
					System.out.println("Quantidade de horas trabalhadas: ");
						p.setQtdHora(l.nextFloat());
					System.out.println("Nova remuneração bruta: "+ p.getValorHora() * p.getQtdHora());
				}else {
					System.out.println("Salario: ");
						p.setSalario(l.nextFloat());
						System.out.println("Nova remuneração bruta: "+ p.getSalario());
				}
				break;
			case 4:
					System.out.println("Saindo...");
				break;
			default:
					System.out.println("Opção invalida, escolha novamente: ");
					System.out.println(" ");
			}
		}

	}
}

