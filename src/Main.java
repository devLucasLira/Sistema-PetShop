import java.util.Scanner;

public class Main {

    private final static Scanner scanner= new Scanner(System.in);
    private final static Banho banhoDoPet = new Banho();

    public static void main(String[] args) {
        scanner.useDelimiter("\\n");
        var options = -1;

        do {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("==== Escolha uma Opções ====");
            System.out.println("1 - Dar Banho no Pet.");
            System.out.println("2 - Abastecer a plataforma com Agua.");
            System.out.println("3 - Abastecer a plataforma com Shampoo.");
            System.out.println("4 - Verificar o nível da Agua.");
            System.out.println("5 - Verificar o Shampoo.");
            System.out.println("6 - Verificar se tem pet na plataforma.");
            System.out.println("7 - Colocar o pet na plataforma.");
            System.out.println("8 - Retirar o pet na plataforma.");
            System.out.println("9 - Limpar a plataforma.");
            System.out.println("0 - Sair");
            options = scanner.nextInt();

            switch (options){
                case 1 -> banhoDoPet.banhoDoPET();
                case 2 -> setShampoo();
                case 3 -> setAgua();
                case 4 -> verifyAgua();
                case 5 -> verifyShampoo();
                case 6 -> checkIfTemPetInBanho();
                case 7 -> setPetBanho();
                case 8 -> banhoDoPet.BanhoFinalizado();
                case 9 -> banhoDoPet.LimpezaDaPlataforma();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção invalida, por favor digite novamente.");

            }

        }while (true);
    }

    private static void setShampoo(){
        System.out.println("Tentando colocar agua na plataforma.:");
        banhoDoPet.coloqueShampoo();
    }

    private static void setAgua(){
        System.out.println("Tentando colocar agua na plataforma.:");
        banhoDoPet.coloqueAgua();
    }

    private static void verifyAgua() {
        var amout = banhoDoPet.getAgua();
        System.out.println("A plataforma tem:" + amout + "Litro(s) de Agua");
    }

    private static void verifyShampoo() {
        var amout = banhoDoPet.getShampoo();
        System.out.println("A plataforma tem:" + amout + "Litro(s) de shampoo");
    }

    private static void checkIfTemPetInBanho() {
       var temPet = banhoDoPet.TemPet();
       System.out.println(temPet ? "Tem pet na plataforma!" : "Não tem pet na plataforma!");
    }

    public static void setPetBanho(){
        var nome="";
        while(nome == null || nome.isEmpty()){
            System.out.println("Digite o nome do PET:");
            nome = scanner.next();
        }

        var pet = new Pet(nome);
        banhoDoPet.setPet(pet);
        System.out.println( pet.getNome() + " Foi Cadastrado com sucesso!");

    }



}