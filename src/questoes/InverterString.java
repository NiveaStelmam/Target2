package questoes;

public class InverterString {
    public static void main(String[] args) {
        String stringOriginal = "hello target";
        String stringInvertida = inverterString(stringOriginal);
        System.out.println("A string invertida de '" + stringOriginal + "' é '" + stringInvertida + "'.");
    }

    public static String inverterString(String s) {
        char[] caracteres = s.toCharArray();
        int esquerda = 0;
        int direita = caracteres.length - 1;

        while (esquerda < direita) {
            // Troca os caracteres nas posições esquerda e direita
            char temp = caracteres[esquerda];
            caracteres[esquerda] = caracteres[direita];
            caracteres[direita] = temp;

            // Avança para a próxima posição
            esquerda++;
            direita--;
        }

        return new String(caracteres);
    }
}

