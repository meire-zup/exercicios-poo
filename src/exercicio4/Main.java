package exercicio4;
//Por último, crie uma classe main de forma a ter um jardim zoológico com os seguintes animais: camelo, tubarão, urso-do-canadá, iguana, leão, mico-leão-dourado.
public class Main {
    public static void main(String[] args) {

        //Instanciando objetos:

        Mamifero camelo = new Mamifero("camelo", 3,"marrom","deserto", 65, "vegetais");
        Peixe tubarao = new Peixe("tubarao", 4,"preto","mar", 65, "impar", "heterocerca");
        Urso ursoDoCanada = new Urso("urso do canadá", 4,"neve", 65);
        Animal iguana = new Animal("iguana", 3, "marrom", "deserto", 65);
        Mamifero leao = new Mamifero("leao", 3,"marrom","deserto", 65, "vegetais");
        Mamifero micoLeaoDouraDO = new Mamifero("nico leao dourado", 3,"marrom","deserto", 65, "vegetais");

        //Imprimindo Animal:

        camelo.imprimeAnimal();
        tubarao.imprimeAnimal();
        ursoDoCanada.imprimeAnimal();
        iguana.imprimeAnimal();
        leao.imprimeAnimal();
        micoLeaoDouraDO.imprimeAnimal();





    }
}
