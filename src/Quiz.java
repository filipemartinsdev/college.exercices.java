public class Quiz {
    private static int pontos = 0;

    public static void iniciar(){

        System.out.println("\n+---------------------------+");
        System.out.println("|         JAVA QUIZ         |");
        System.out.println("+---------------------------+\n");

        Questao q1 = new Questao();
        q1.pergunta = "qual paradigma da linguagem java?";
        q1.opcaoA = "funcional";
        q1.opcaoB = "orientado a objetos";
        q1.opcaoC = "orientado a eventos";
        q1.opcaoD = "alksjdflkjsd";
        q1.opcaoE = "alskjfdçlkdsjfa";
        q1.correta = "B";

        q1.escrevaQuestao();
        if(q1.isCorreta(q1.leiaResposta())) pontos++;

        Questao q2 = new Questao();
        q2.pergunta = "Qual o nome do framework padrao do java que contem um compilado de estrutura de dados?";
        q2.opcaoA = "Spring Boot";
        q2.opcaoB = "Java Collections";
        q2.opcaoC = "JavaFX";
        q2.opcaoD = "Java Swing";
        q2.opcaoE = "Java React Native";
        q2.correta = "B";

        q2.escrevaQuestao();
        if(q2.isCorreta(q1.leiaResposta())) pontos++;

        System.out.println("Voce fez um total de "+pontos+" pontos!");
    }

}
