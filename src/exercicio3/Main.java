package exercicio3;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Dicionario dicionario = new Dicionario();

        dicionario.objetos.put("bola","azul");
        dicionario.objetos.put("boneca","amarela");
        dicionario.objetos.put("dado","rosa");

        for (String objeto : dicionario.objetos.keySet()) {
            System.out.println(objeto + " -> " + dicionario.objetos.get(objeto));
        }

    }
}