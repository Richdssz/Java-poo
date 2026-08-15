package CadastroClientes;

public class Rodar {
    public static void main(String args[]){
        Telefone telefone = new Telefone(81, 8191);
        Data data = new Data(14, 05, 2006);
        Endereco endereco = new Endereco("RuaUm", 66, "Curado", "Recife", "Pe");
        Cliente cliente = new Cliente("Jao", "1324", "123", data, endereco, telefone);
        System.out.println(cliente);
    }
    
}

// Data nascimento;
//     Endereco endereco;
//     Telefone telefone;

// criar Aplicação
//  Criar um objeto do tipo Cliente, a partir de
// dados fornecidos pelo usuário, e ao final,
// imprime os valores dos atributos do objeto
// Cliente criado.