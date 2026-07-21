import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<String> listNames = new ArrayList<>();

        System.out.println("Registro de Nomes");

        int opc = 1;
        while(opc != 0){
            System.out.println("1 - Cadastrar nome");
            System.out.println("2 - Listar nomes");
            System.out.println("3 - Buscar nome");
            System.out.println("4 - Editar nome");
            System.out.println("5 - Remover nome");
            System.out.println("6 - Quantidade de nomes");
            System.out.println("7 - Limpar nomes");
            System.out.println("8 - Sair");

            System.out.print("Digite a opcao: ");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
                case 1:
                    System.out.print("Informe o nome: ");
                    String name = sc.nextLine();

                    if(listNames.contains(name)){
                        System.out.println("Esse nome já está registrado!");
                        break;
                    } else if(name.trim().isEmpty()) {
                        System.out.println("Precisa ser um nome válido");
                        break;
                    } else {
                        listNames.add(name);
                    }

                    break;
                case 2:
                    if(listNames.isEmpty()){
                        System.out.println("Lista está vazia!");
                        break;
                    }

                    for(String names : listNames){
                        System.out.println(names);
                    }

                    break;
                case 3:
                    System.out.print("Nome a ser buscado: ");
                    name = sc.nextLine();

                    if(listNames.contains(name)){
                        System.out.println("Nome está registrado: " + name);
                        break;
                    } else {
                        System.out.println("Nome não encontrado");
                        break;
                    }
                case 4:
                    System.out.print("Nome a ser buscado: ");
                    name = sc.nextLine();

                    if(listNames.contains(name)){
                        int index = listNames.indexOf(name);

                        System.out.print("Novo nome: ");
                        name = sc.nextLine();

                        if(name.trim().isEmpty()){
                            System.out.println("Nome precisa ser válido");
                        } else if(listNames.contains(name)){
                            System.out.println("Esse nome já está registrado!");
                        } else {
                            listNames.set(index, name);
                            System.out.println("Nome atualizado!");
                        }

                    } else {
                        System.out.println("O nome informado está inválido!");
                    }
                    break;

                case 5:
                    System.out.print("Digite o nome a ser removido: ");
                    name = sc.nextLine();

                    if(listNames.contains(name)){
                        listNames.remove(name);
                        System.out.println("Nome removido com sucesso!");
                    }else {
                        System.out.print("Nome não encontrado!\n");
                    }

                    break;
                case 6:
                    System.out.println("Total de nomes: " + listNames.size());
                    break;
                case 7:
                    System.out.print("Tem certeza? (s/n): ");
                    char confirm = sc.next().charAt(0);

                    if(confirm == 's'){
                        listNames.clear();
                        System.out.println("Todos os nomes foram removidos!");

                    } else {
                        System.out.println("Lista NÃO foi deletada!");
                    }
                    break;
                case 8:
                    opc = 0;
                    break;
                default:
                    System.out.println("Opçâo inválida");
            }
        }
    }
}
