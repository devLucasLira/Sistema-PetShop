public class Banho {

    private boolean limpo;

    private int agua;

    private int Shampoo;

    private Pet pet;

    public void banhoDoPET(){
        if (this.pet == null){
            System.out.println("Coloque o PET na plataforma de banho.");
            return;
        }
        this.agua -= 10;
        this.Shampoo -= 2;
        pet.setLimpo(true);
            System.out.println("Banho terminado, por favor remova o" +pet.getNome()+ "Da plataforma de banho.");
    }
    public void coloqueAgua(){
        if (agua == 30){
            System.out.println("A capacidade do reservatório de agua esta no máximo.");
            return;
        }
        agua += 2;
    }
    public void coloqueShampoo() {
        if (agua == 10) {
            System.out.println("A capacidade do reservatorio de Shampoo esta no máximo.");
            return;
        }
        agua += 2;
        }

    public int getShampoo() {
        return Shampoo;
    }

    public int getAgua() {
        return agua;
    }

    public boolean TemPet(){
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (!this.limpo){
            System.out.println("Para colocar o pet, é necessário realizar a limpeza da plataforma de banho.");
            return;

        }
        if (TemPet()){
            System.out.println("O pet"+ this.pet.getNome()+ "ja esta tomando banho na plataforma.");
            return;
        }
        this.pet = pet;
    }

    public void BanhoFinalizado(){
        this.limpo = this.pet.isLimpo();
            System.out.println("o Banho do"+ pet.getNome()+ "foi finalizado com sucesso!");
        this.pet = null;
    }

    public void LimpezaDaPlataforma(){
        this.agua -= 10;
        this.Shampoo -= 2;
        this.limpo = true;
            System.out.println("A Limpeza da plataforma foi concluída com sucesso!");
    }

}

