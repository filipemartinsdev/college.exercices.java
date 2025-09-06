import java.util.List;
import java.util.Scanner;

public class Questao {
    int indice;
    String pergunta = "";
    String opcaoA = "";
    String opcaoB = "";
    String opcaoC = "";
    String opcaoD = "";
    String opcaoE = "";
    String correta = "";

    public Questao(){}

    public Questao(int indice, String pergunta, String[] opcoes, String opcaoCorreta){

        if (opcoes.length != 5){
            throw new IllegalArgumentException("Agumento opcoes deve ter cinco elementos");
        }

        List<String> alternativas = List.of("A", "B", "C", "D", "E");
        if(!alternativas.contains(opcaoCorreta.toUpperCase())){
            throw  new IllegalArgumentException("opcaoCorreta inexistente");
        }

        this.indice = indice;
        this.pergunta = pergunta;
        this.opcaoA = opcoes[0];
        this.opcaoB = opcoes[1];
        this.opcaoC = opcoes[2];
        this.opcaoD = opcoes[3];
        this.opcaoE = opcoes[4];

        this.correta = opcaoCorreta;
    }


    public boolean isCorreta(String resposta){
        if(resposta.equalsIgnoreCase(this.correta)){
            System.out.println("Parabéns resposta Correta! - Letra: " + this.correta);
            System.out.println("");
            return true;
        } else {
            System.out.println("Resposta Errada!");
            System.out.println("A opção correta é a letra: " + this.correta);
            System.out.println("");
            return false;
        }
    }

    public String leiaResposta() {
        Scanner ler = new Scanner(System.in);
        String resp;
        do {
            System.out.print("Digite a resposta: ");
            resp = ler.next();
        } while (!respostaValida(resp));
        return resp;
    }

    private boolean respostaValida(String resp){
        char charResp = resp.toCharArray()[0];

        if( resp.length() == 1 && ((charResp >= 65 && charResp <= 69) || (charResp >= 97 && charResp <= 101))){
            return true;
        }

        System.out.println("Resposta inválida! Digite opção A, B, C, D ou E. ");
        System.out.println();
        return false;
    }

    public void escrevaQuestao(){
        System.out.println("["+this.indice+"] "+this.pergunta);
        System.out.println();
        System.out.println("A) "+this.opcaoA);
        System.out.println("B) "+this.opcaoB);
        System.out.println("C) "+this.opcaoC);
        System.out.println("D) "+this.opcaoD);
        System.out.println("E) "+this.opcaoE);
        System.out.println();
    }
}
