import java.util.Scanner;

public class App {
    public static String inverter(String frase) {
        Pilha p1 = new Pilha(frase.length());
        StringBuilder resultado = new StringBuilder(frase.length());

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c != ' ') {
                p1.push(c);
            } else {
                while (!p1.esvaziePilha()) {
                    resultado.append(p1.pop());
                }
                resultado.append(' ');
            }
        }

        while (!p1.esvaziePilha()) {
            resultado.append(p1.pop());
        }

        return resultado.toString();
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("O exemplo 1 invertido fica: ");
        String texto1 = "UM CIENTISTA DA COMPUTAÇAO DEVE RESOLVER OS PROBLEMAS LOGICAMENTE";
        System.out.println(inverter(texto1)); 

        System.out.println("O exemplo 2 invertido fica: ");
        String texto2 = "ESARF ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC FI ONAIOG SUPMAC SOHNIRROM HE MU SOD SEROHLEM SOSRUC ED OAÇATUPMOC OD ODATSE ED SAIOG";
        System.out.println(inverter(texto2));

        System.out.println("Digite uma palavra para inveter: ");
        String palavra = entrada.next();
        System.out.println("Essa palavra invertida fica assim: " + inverter(palavra));

        entrada.close();
    }
}
