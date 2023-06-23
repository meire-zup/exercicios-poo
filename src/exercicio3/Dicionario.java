package exercicio3;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    Map<String , String> objetos = new HashMap<>();

    public  void adicionarObjetos() {

        System.out.println("--- OBJETOS ---");
        this.objetos.put("bola","azul");
        this.objetos.put("boneca","amarela");
        this.objetos.put("dado","rosa");

    }

    public void imprimir() {
        for (String objeto : this.objetos.keySet()) {
            System.out.println(objeto + " -> " + this.objetos.get(objeto));

        }

    }

}



