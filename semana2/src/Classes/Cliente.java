package Classes;

import java.util.Scanner;

public class Cliente {
	private String nome;
	private int idade;
	private String cpf;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	public Cliente(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		idade = 0;
	}

public static void main(String[] args) { 
	String nome, cpf;
	int idade;
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Digite o nome: ");
	nome = scanner.nextLine();
	System.out.println("Digite o cpf: ");
	cpf = scanner.nextLine();
	
	Cliente cliente = new Cliente(nome, cpf);
	
	System.out.println("Dados do cliente");	
	System.out.println("Seu nome: " + cliente.getNome());
	System.out.println("Seu cpf: " + cliente.getCpf());
	System.out.println("Sua idade: " + cliente.getIdade());
	System.out.println("Nova Idade");
	System.out.println("Digite a nova idade");
	idade = scanner.nextInt();
	cliente.setIdade(idade);
	System.out.println("Novos dados");
	System.out.println("Seu nome: " + cliente.getNome());
	System.out.println("Seu cpf: " + cliente.getCpf());
	System.out.println("Sua idade: " + cliente.getIdade());
	
}

}