package app;

import java.util.ArrayList;
import java.util.Scanner;

import app.models.Carro;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Carro> carros = new ArrayList<>();

        int codigo;

        do {

            System.out.println("--- Menu ---");
            System.out.println("Código | Descrição");
            System.out.println("  1    | Cadastrar Carro");
            System.out.println("  2    | Listar Carros");
            System.out.println("  3    | Alterar Carro");
            System.out.println("  4    | Remover Carro");
            System.out.println("  0    | Sair");

            System.out.println("Digite o código que deseja: ");
            codigo = sc.nextInt();
            sc.nextLine();

            switch (codigo) {
                case 1:
                    System.out.println("--- Cadastrando Carro ---");
                    System.out.println("Digite a Marca: ");
                    String marca = sc.nextLine();

                    System.out.println("Digite o modelo: ");
                    String modelo = sc.nextLine();

                    System.out.println("Digite o Ano de Fabricação: ");
                    int anoFabricacao = sc.nextInt();
                    sc.nextLine();

                    Carro carro = new Carro(marca, modelo, anoFabricacao);
                    carros.add(carro);

                    System.out.println("Carro cadastrado.");
                    
                    break;

                case 2:

                    if (carros.isEmpty()) {
                        System.out.println("Não há nenhum Carro cadastrado\n");
                        
                    } else {
                        System.out.println("--- Listando Carros Cadastrados ---");

                        for (Carro c : carros) {
                            c.exibirInfo();
                            
                        }
                        
                    }

                    break;

                case 3:
                    if (carros.isEmpty()) {
                        System.out.println("Não há nenhum Carro cadastrado\n");
                        
                    }else{
                        System.out.println("--- Alterando Carro ---");
                        System.out.println("Digite o Ano de Frabricação do carro: ");
                        int alterarCarro = sc.nextInt();
                        sc.nextLine();

                        for (Carro c : carros) {
                            if (c.getAnoFabricacao() == alterarCarro) {
                                System.out.println("Digite a nova marca: ");
                                c.setMarca(sc.nextLine());

                                System.out.println("Digite o novo modelo: ");
                                c.setModelo(sc.nextLine());

                                System.out.println("Digite o novo ano de publicação: ");
                                c.setAnoFabricacao(sc.nextInt());
                                sc.nextLine();

                                System.out.println("Carro atualizado.");
                                
                            }
                            
                        }
                    }

                case 4:
                    if (carros.isEmpty()) {
                        System.out.println("Não há nenhum Carro cadastrado\n");

                    }else{
                        System.out.println("--- Removendo Carro ---");
                        System.out.println("Digite o Ano de Fabricação: ");
                        int removerCarro = sc.nextInt();
                        sc.nextLine();

                        for (Carro c : carros) {
                            if (c.getAnoFabricacao() == removerCarro) {
                                carros.remove(c);
                                
                                System.out.println("Carro removido");

                            }else{
                                System.out.println("Carro não encontrado.");

                            }
                            
                        }
                    }

                    break;

                case 0:

                    System.out.println("Programa finalizado ...");
                    break;
            
                default:

                    System.out.println("Código inválido");
                    break;
            }
            
        } while (codigo != 0);


        
    }

    
}