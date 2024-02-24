package test;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, String> diccionario = getStringStringMap();


        String[] arr =  diccionario.keySet().toArray(new String[0]);
        int count = 1;
        int palabrasCorrectas = 0;
        for (int i = 0; i < 5; i++) {
            int numeroRandom = (int) Math.floor((Math.random() * diccionario.size()));

            System.out.println("LA PALABRA N#" +count + "/5 A TRADUCIR ES");
            System.out.println( (count++) +" : " + arr[numeroRandom]);
            String palabraTraducida = scanner.next();
            if (diccionario.get(arr[numeroRandom]).equals(palabraTraducida)){
                System.out.println("Muy bien la palabra esta traducida correctamente");
                ++palabrasCorrectas;
            }else{
                System.out.println("Muy mal la palabra esta traducida incorrectamente");
            }
        }

        System.out.println("Tus palabras correctas fueron :" + palabrasCorrectas);
        System.out.println("Tus palabras incorrectas fueron :" + (5 - palabrasCorrectas));
    }

    private static Map<String, String> getStringStringMap() {
        Map<String,String> diccionario = new HashMap<>();

        diccionario.put("perro", "dog");
        diccionario.put("pepino", "cucumber");
        diccionario.put("macarrones", "macarrounis");
        diccionario.put("crema", "cream");
        diccionario.put("flor", "flower");
        diccionario.put("tomate", "tomate");
        diccionario.put("cebolla", "onion");
        diccionario.put("bebe", "baby");
        diccionario.put("amor", "love");
        diccionario.put("odio", "hate");
        diccionario.put("hierba", "cocaine");
        diccionario.put("feliz", "happy");
        diccionario.put("triste", "sad");
        diccionario.put("aleatorio", "random");
        diccionario.put("gato", "cat");
        diccionario.put("jirafa", "giraffe");
        diccionario.put("zorro", "fox");
        diccionario.put("gafas", "glasses");
        diccionario.put("muro", "wall");
        diccionario.put("raro", "weird");
        return diccionario;
    }
}