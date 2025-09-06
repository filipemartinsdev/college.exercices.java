import java.util.List;

public class Quiz {
    private static int pontos = 0;

    public static void iniciar(){

        System.out.println();
        System.out.println("+-------------------------------------+");
        System.out.println("|              JAVA QUIZ              |");
        System.out.println("+-------------------------------------+");
        System.out.println("+  15 Questões  |");
        System.out.println("+---------------+");
        System.out.println();


        Questao q1 = new Questao(
                1, "Qual é o paradigma da linugagem Java?",
                new String[]{
                        "Funcional", "Orientado a Objetos", "Orientado a Eventos", "Procedural", "Lógico"
                },
                "B"
        );
        q1.escrevaQuestao();
        if(q1.isCorreta(q1.leiaResposta())) pontos++;

        System.out.println("---------------------------------------\n");

        Questao q2 = new Questao(
                2, "Qual o nome do Framework da biblioteca padrão Java que possui estruturas de dados?",
                new String[]{"Spring Boot", "Java Collections", "JavaFX", "Java Swing", "React Native"},
                "B"

        );
        q2.escrevaQuestao();
        if(q2.isCorreta(q2.leiaResposta())) pontos++;

        System.out.println("---------------------------------------\n");

        Questao q3 = new Questao();
        q3.pergunta = "[3] Como se chama o método usado para inicializar objetos?";
        q3.opcaoA = "Método abstrato";
        q3.opcaoB = "Malloc";
        q3.opcaoC = "Getter";
        q3.opcaoD = "Setter";
        q3.opcaoE = "Construtor";
        q3.correta = "E";
        q3.escrevaQuestao();
        if(q3.isCorreta(q3.leiaResposta())) pontos++;

        System.out.println("---------------------------------------\n");

        Questao q4 = new Questao();
        q4.pergunta = "[4] Qual tipo de Classe no java usamos para armazenar valores imutáveis?";
        q4.opcaoA = "Interface";
        q4.opcaoB = "Classe abstrata";
        q4.opcaoC = "Enum";
        q4.opcaoD = "ArrayList";
        q4.opcaoE = "Exception";
        q4.correta = "C";
        q4.escrevaQuestao();
        if(q4.isCorreta(q4.leiaResposta())) pontos++;

        System.out.println("---------------------------------------\n");

        Questao q5 = new Questao();
        q5.pergunta = "[5] Qual pacote do java armazena o Collection Framework";
        q5.opcaoA = "java.net";
        q5.opcaoB = "java.lang";
        q5.opcaoC = "java.math";
        q5.opcaoD = "java.io";
        q5.opcaoE = "java.util";
        q5.correta = "E";
        q5.escrevaQuestao();
        if(q5.isCorreta(q5.leiaResposta())) pontos++;

        System.out.println("---------------------------------------\n");

        Questao q6 = new Questao();
        q6.pergunta = "[6] Qual trecho de codigo a seguir não será compilado pelo javac?";
        q6.opcaoA = "System.out.println(\"hello\");";
        q6.opcaoB = "int x;";
        q6.opcaoC = "string str = \"hello\";";
        q6.opcaoD = "char c;";
        q6.opcaoE = "String str;";
        q6.correta = "C";
        q6.escrevaQuestao();
        if(q6.isCorreta(q6.leiaResposta())) pontos++;

        System.out.println("---------------------------------------\n");

        Questao q7 = new Questao();
        q7.pergunta = "[7] Qual palavra reservada define um campo como visivel somente no escopo do Package atual?";
        q7.opcaoA = "public";
        q7.opcaoB = "private";
        q7.opcaoC = "static";
        q7.opcaoD = "default";
        q7.opcaoE = "protected";
        q7.correta = "E";
        q7.escrevaQuestao();
        if(q7.isCorreta(q7.leiaResposta())) pontos++;

        System.out.println("---------------------------------------\n");

        Questao q8 = new Questao();
        q8.pergunta = "[8] Qual alternativa representa um nome ilegal de variavel?";
        q8.opcaoA = "var";
        q8.opcaoB = "123var";
        q8.opcaoC = "var123";
        q8.opcaoD = "var_123";
        q8.opcaoE = "VAR_VAR";
        q8.correta = "B";
        q8.escrevaQuestao();
        if(q8.isCorreta(q8.leiaResposta())) pontos++;

        System.out.println("---------------------------------------\n");

        Questao q9 = new Questao();
        q9.pergunta = "[9] Qual API padrão java é usada para lidar dinamicamente com fluxo de dados?";
        q9.opcaoA = "Stream API";
        q9.opcaoB = "Java Script";
        q9.opcaoC = "Java Data API";
        q9.opcaoD = "JDBC";
        q9.opcaoE = "JPA";
        q9.correta = "A";
        q9.escrevaQuestao();
        if(q9.isCorreta(q9.leiaResposta())) pontos++;

        System.out.println("---------------------------------------\n");

        Questao q10 = new Questao();
        q10.pergunta = "[10] Qual Design Pattern é muito utilizado em java para gerenciar conexões com banco de dados?";
        q10.opcaoA = "Observer Pattern";
        q10.opcaoB = "Repository Pattern";
        q10.opcaoC = "Transformer Pattern";
        q10.opcaoD = "Compass Pattern";
        q10.opcaoE = "Optimus Pattern";
        q10.correta = "B";
        q10.escrevaQuestao();
        if(q10.isCorreta(q10.leiaResposta())) pontos++;


        System.out.println("---------------------------------------\n");

        System.out.println("Voce fez um total de "+pontos+" pontos!");
    }

}
