package Assuntos.a11Heranca.EXteams;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //OBS: foi utilizado IA para melhor formatação dos dados
        //Mas eu contrui a lógica do código!

        // Cria os funcionários
        Funcionario Daniel = new Gerente("Daniel", "xxxxx", 2500, "Vendas");
        Funcionario Richard = new Desenvolvedor("Rich", "xxxxxx", 9800, "Java");
        Funcionario Rasmussen = new Desenvolvedor("Rasmussen", "xxxxxx", 1621, "Python");

        // Cria o Projeto
        Projeto novoInstagram = new Projeto("Newgram", "cópia do instagram", ((Desenvolvedor) Richard));
        Projeto Saas = new Projeto("Newgram", "cópia do instagram", ((Desenvolvedor) Rasmussen));

        // Cria o ArrayList
        ArrayList<Projeto> projetos = new ArrayList<>();
        // add um projeto ao ArrayList de projetos
        projetos.add(novoInstagram);
        projetos.add(Saas);

        // Cria a empresa
        Empresa FabricaDeSoftware = new Empresa((Gerente) Daniel, projetos, "Nubank");

        System.out.println(FabricaDeSoftware);

    }
}
