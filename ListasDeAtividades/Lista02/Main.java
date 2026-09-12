package ListasDeAtividades.Lista02;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int v = 0;
        Zoologico z = new Zoologico();

        while (v != 6) {

            System.out.println("\n\n\nMENU DO ZOOLÓGICO");
            System.out.println("=================");
            System.out.println("1. Adicionar animal");
            System.out.println("2. Listar todos os animais");
            System.out.println("3. Remover animal");
            System.out.println("4. Emitir som de um animal");
            System.out.println("5. Testar habilidade de um animal");
            System.out.println("6. Sair");
            System.out.println("==================");

            v = sc.nextInt();
            sc.nextLine();

            switch (v) {
                case 1:

                    System.out.println("\n\nEscolha o tipo de animal que quer criar");
                    System.out.println("==================");
                    System.out.println("1. Gato");
                    System.out.println("2. Cachorro");
                    System.out.println("3. Passaro");
                    System.out.println("==================");
                    int o = sc.nextInt();
                    sc.nextLine();
                    if (o == 1) {

                        System.out.println("Digite o id do Gato");
                        Long id = sc.nextLong();
                        sc.nextLine();
                        System.out.println("Digite o nome do Gato");
                        String nome = sc.nextLine();
                        System.out.println("Digite a idade do Gato");
                        int idade = sc.nextInt();

                        System.out.println("Digite o peso do Gato");
                        double peso = sc.nextDouble();
                        sc.nextLine();

                        Animal gato = new Gato(id, nome, idade, peso);
                        if (z.adicionarAnimal(gato)) {
                            System.out.println("\n\nGato cadastrado");

                        } else {
                            System.out.println("Erro, já existe um animal com esse ID!");
                        }
                    }

                    if (o == 2) {

                        System.out.println("Digite o id do Cachorro");
                        Long id = sc.nextLong();
                        sc.nextLine();
                        System.out.println("Digite o nome do Cachorro");
                        String nome = sc.nextLine();
                        System.out.println("Digite a idade do Cachorro");
                        int idade = sc.nextInt();

                        System.out.println("Digite o peso do Cachorro");
                        double peso = sc.nextDouble();
                        sc.nextLine();

                        Animal cachorro = new Cachorro(id, nome, idade, peso);
                        if (z.adicionarAnimal(cachorro)) {
                            System.out.println("Cachorro cadastrado");
                        } else {
                            System.out.println("Erro, já existe um animal com esse ID!");
                        }
                    }

                    if (o == 3) {

                        System.out.println("Digite o id do Passaro");
                        Long id = sc.nextLong();
                        sc.nextLine();
                        System.out.println("Digite o nome do Passaro");
                        String nome = sc.nextLine();
                        System.out.println("Digite a idade do Passaro");
                        int idade = sc.nextInt();

                        System.out.println("Digite o peso do Passaro");
                        double peso = sc.nextDouble();
                        sc.nextLine();

                        Animal passaro = new Passaro(id, nome, idade, peso);
                        if (z.adicionarAnimal(passaro)) {
                            System.out.println("Passaro cadastrado");
                        } else {
                            System.out.println("Erro, já existe um animal com esse ID!");
                        }
                    }

                    break;

                case 2:
                    if (z.listarAnimais().isEmpty()) {
                        System.out.println("\n\nNão existem animais nesse zoológico");
                    } else {
                        int c = 1;
                        for (int j = 0; j < z.listarAnimais().size(); j++) {
                            Animal animal = z.listarAnimais().get(j);
                            String tipo = null;
                            if (animal instanceof Cachorro) {
                                tipo = "Cachorro";
                            } else if (animal instanceof Gato) {
                                tipo = "Gato";
                            } else if (animal instanceof Passaro) {
                                tipo = "Passaro";
                            } else {
                                tipo = "outro";
                            }

                            System.out.println(
                                    "\n\n" + c + "º" + " Animal" + ":" + "\nID: "
                                            + animal.getId() + "\nTipo: " + tipo + "\nNome: "
                                            + animal.getNome()
                                            + "\nIdade: "
                                            + animal.getIdade() + "\nPeso: " + animal.getPeso());
                            c++;
                        }

                    }

                    break;

                case 3:

                    System.out.println("Digite o ID do animal que deseja remover");
                    long id = sc.nextLong();
                    sc.nextLine();
                    Animal a = z.buscarAnimal(id);
                    if (a != null) {
                        System.out.println("O animal " + a.getNome() + " ID:" + id + " foi removido");
                        z.removerAnimal(id);
                    } else {
                        System.out.println("O animal não existe, tente novamente");
                    }

                    break;

                case 4:
                    System.out.println("Digite qual id do animal você deseja emitir um som");
                    long id2 = sc.nextLong();
                    sc.nextLine();
                    Animal animal = z.buscarAnimal(id2);
                    if (animal != null) {
                        System.out.println(animal.getNome() + " diz " + animal.emitirSom());
                    } else {
                        System.out.println("Esse animal não existe, tente novamente!\n");
                    }

                    break;

                case 5:
                    System.out.println("Digite o id do animal que deseja testar a habilidade");
                    long id5 = sc.nextLong();
                    sc.nextLine();
                    System.out.println("Digite a habilidade do animal");
                    String h = sc.nextLine();
                    Animal animal5 = z.buscarAnimal(id5);
                    if (animal5 != null) {
                        System.out.println(animal5.realizarHabilidade(h));
                    } else {
                        System.out.println("Esse animal não existe");
                    }

                    break;

                case 6:
                    System.out.println("\n\nObrigado por usar, encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida! Digite um número de 1 a 6.");

            }

        }
    }
}