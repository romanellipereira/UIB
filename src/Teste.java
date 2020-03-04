
public class Teste {

	public static void main(String[] args) {
		
		//cria um objeto Cliente onde é atribuido um espaço de memoria onde será gravado os atributos nome e cpf
		
		Cliente cliente = new Cliente(); //declarei uma variavel do tipo Cliente; criei um objeto e atribuí a variável
		cliente.nome = "Seu Jair"; //atrubui um nome a variavel nome
		cliente.cpf = "123"; //atribui 123 à variavel CPF
		
		Conta conta = new Conta(); //criei uma variavel do tipo conta; criei um novo objeto e atribui a variável - criou o bolde, a bola com os 3 quadrados abaixo
		conta.numero = "123-1"; //atribuiu 123-1 ao quadrado numero da conta
		conta.saldoDaConta = 100; //atribuiu 100 ao quadrado do saldo 
		conta.cliente = cliente; //declarei uma variavel; apontei ela para a classe cliente (gravei a referencia para a bola cliente)
		
		cliente.cpf = "987"; //atribui 987 a variavel CPF, sobrescrevendo 123
		
		System.out.println(cliente.nome);
		System.out.println(conta.cliente.cpf);
	}
}
