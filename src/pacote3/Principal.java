package pacote3;

import java.util.ArrayList;
import java.util.Scanner;

import pacote1.Funcionario;
import pacote1.Pessoa;
import pacote2.Cliente;
import pacote2.Gerente;
import pacote2.Supervisor;

public class Principal {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		ArrayList<Pessoa> lista = new ArrayList<>();
		
		while(true) {
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Listar");
			System.out.println("3 - Sair");
			System.out.print("Opção: ");
			String opcao = teclado.nextLine();
			
			if(opcao.equals("1")) {
				System.out.println("Opção cadastro selecionada!");
				System.out.println("1 - Pessoa");
				System.out.println("2 - Funcionario");
				System.out.println("3 - Gerente");
				System.out.println("4 - Supervisor");
				System.out.println("5 - Cliente");
				System.out.print("Opção: ");
				opcao = teclado.nextLine();
				
				if(opcao.equals("1")) {
					System.out.print("Nome: ");
					String nome = teclado.nextLine();
					System.out.print("CPF: ");
					String cpf = teclado.nextLine();
					Pessoa p = new Pessoa();
					p.setNome(nome);
					p.setCpf(cpf);
					lista.add(p);
					
				} else if(opcao.equals("2")) {
					System.out.print("Nome: ");
					String nome = teclado.nextLine();
					System.out.print("CPF: ");
					String cpf = teclado.nextLine();
					System.out.print("Matricula: ");
					String matricula = teclado.nextLine();
					System.out.print("Salário: ");
					double salario = teclado.nextDouble();
					teclado.nextLine();
					
					Funcionario f = new Funcionario();
					f.setNome(nome);
					f.setCpf(cpf);
					f.setMatricula(matricula);
					f.setSalario(salario);
					lista.add(f);					
				} else if(opcao.equals("3")) {
					System.out.print("Nome: ");
					String nome = teclado.nextLine();
					System.out.print("CPF: ");
					String cpf = teclado.nextLine();
					System.out.print("Matricula: ");
					String matricula = teclado.nextLine();
					System.out.print("Salário: ");
					double salario = teclado.nextDouble();
					teclado.nextLine();
					System.out.print("Tipo: ");
					String tipo = teclado.nextLine();
					
					Gerente g = new Gerente();
					g.setNome(nome);
					g.setCpf(cpf);
					g.setMatricula(matricula);
					g.setSalario(salario);
					g.setTipo(tipo);
					lista.add(g);	
				} else if(opcao.equals("4")) {
					System.out.print("Nome: ");
					String nome = teclado.nextLine();
					System.out.print("CPF: ");
					String cpf = teclado.nextLine();
					System.out.print("Matricula: ");
					String matricula = teclado.nextLine();
					System.out.print("Salário: ");
					double salario = teclado.nextDouble();
					teclado.nextLine();
					System.out.print("Formação: ");
					String formacao = teclado.nextLine();
					
					Supervisor s = new Supervisor();
					s.setNome(nome);
					s.setCpf(cpf);
					s.setMatricula(matricula);
					s.setSalario(salario);
					s.setFormacao(formacao);
					lista.add(s);	
				} 
				else if(opcao.equals("5")) {
					System.out.print("Nome: ");
					String nome = teclado.nextLine();
					System.out.print("CPF: ");
					String cpf = teclado.nextLine();
					System.out.println("Codigo");
					String codigo = teclado.nextLine();
					Cliente c = new Cliente();
					c.setNome(nome);
					c.setCpf(cpf);
					c.setCodigo(codigo);
				}
				else {
					System.out.println("Opção inválida!");
				}
				
			} else if(opcao.equals("2")) {
				System.out.println("Opção Listar selecionada!");
				System.out.println("1 - Todos");
				System.out.println("2 - Funcionario");
				System.out.println("3 - Gerente");
				System.out.println("4 - Supervisor");
				System.out.println("5 - Cliente");
				System.out.print("Opção: ");
				opcao = teclado.nextLine();
				
				if(opcao.equals("1")) {
					System.out.println("Listagem de pessoas selecionadas!");
					for (Pessoa pessoa : lista) {
						System.out.println(pessoa.recuperarInformacao());
						System.out.println(pessoa.recuperarInformacao());
					}
					
				} else if(opcao.equals("2")) {
					System.out.println("Listagem de funcionarios selecionadas!");
					for (Pessoa pessoa : lista) {
						if (pessoa instanceof Funcionario) {
							
							System.out.println(pessoa.recuperarInformacao());
						}						
					}
				} else if(opcao.equals("3")) {
					System.out.println("Listagem de gerentes selecionadas!");
					for (Pessoa pessoa : lista) {
						if (pessoa instanceof Gerente) {
							System.out.println(pessoa.recuperarInformacao());							
						}						
					}
				} else if(opcao.equals("4")) {
					System.out.println("Listagem de supervisores selecionadas!");
					for (Pessoa pessoa : lista) {
						if (pessoa instanceof Supervisor) {
							
							System.out.println(pessoa.recuperarInformacao());
						}						
					}
				} 
				else if(opcao.equals("5")) {
					System.out.println("Listagem de Clientes selecionados");
					for(Pessoa pessoa :lista) {
						if(pessoa instanceof Cliente) {
							System.out.println(pessoa.recuperarInformacao());
						}
					}
					
				}
			} else if(opcao.equals("3")) {
				System.out.println("Opção 3 selecionada");
				break;
			} else {
				System.out.println("Opção inválida!!");
			}
		}
		System.out.println("Até logo!");
	}
}
