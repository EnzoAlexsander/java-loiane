package modulo3_intermediario.aula13.string.tokenizer;

import java.util.StringTokenizer;

public class Tokenizer {
    public static void main(String[] args) {

        String doArquivo = "1;Antonio;30;";

        StringTokenizer st = new StringTokenizer(doArquivo, ";");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}