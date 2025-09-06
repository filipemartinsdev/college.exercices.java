public class Quiz {
    private static int pontos = 0;

    public static void iniciar(){

//        INICIALIZAÇÃO DAS QUESTÕES

        Questao q1 = new Questao(
                1, "Qual é o paradigma da linugagem Java?",
                new String[]{
                        "Funcional", "Orientado a Objetos", "Orientado a Eventos", "Procedural", "Lógico"
                },
                "B"
        );

        Questao q2 = new Questao(
                2, "Qual o nome do Framework da biblioteca padrão Java que possui estruturas de dados?",
                new String[]{"Spring Boot", "Java Collections", "JavaFX", "Java Swing", "React Native"},
                "B"

        );

        Questao q3 = new Questao(
                3, "Como se chama o método usado para inicializar objetos?",
                new String[]{"Malloc", "Getter", "Setter", "Método abstrato", "Construtor"},
                "E"
        );

        Questao q4 = new Questao(
                4, "Qual tipo de Classe no java usamos para armazenar valores imutáveis?",
                new String[]{"Interface", "Classe abstrata", "Enum", "ArrayList", "Exception"},
                "C"
        );

        Questao q5 = new Questao(
                5, "Qual pacote do java armazena o Collection Framework",
                new String[]{"java.net", "java.lang", "java.math", "java.io", "java.util"},
                "E"
        );

        Questao q6 = new Questao(
                6, "Qual trecho de codigo a seguir não será compilado pelo javac?",
                new String[]{"System.out.println(\"Hello World!\");", "int x;", "string str;", "char c;", "String str"},
                "C"
        );

        Questao q7 = new Questao(
                7, "Qual palavra reservada define um campo como visivel somente no escopo do Package atual??",
                new String[]{"public", "private", "static", "default", "protected"},
                "E"
        );

        Questao q8 = new Questao(
                8, "Qual alternativa representa um nome ilegal de variavel?",
                new String[]{"varr", "123var", "var123", "var_123", "VAR_VAR"},
                "B"
        );

        Questao q9 = new Questao(
                9, "Qual API padrão java é usada para lidar dinamicamente com fluxo de dados?",
                new String[]{"Stream API", "Java Script", "JDBC", "JPA", "Java Collections"},
                "A"
        );

        Questao q10 = new Questao(
                10, "Qual Design Pattern é muito utilizado em java para gerenciar conexões com banco de dados?",
                new String[]{"Observer", "Repository", "Transformer", "Factory", "Nenhuma das alternativas"},
                "B"
        );

        Questao q11 = new Questao(
                11, "Qual palavra chave impede herança de uma classe?",
                new String[]{"static", "public", "private", "final", "void"},
                "D"
        );

        Questao q12 = new Questao(
                12, "A classe ArrayList do pacote java.util implementa qual interface?",
                new String[]{"List", "Map", "HashMap", "Queue", "Nenhuma das alternativas"},
                "A"
        );

        Questao q13 = new Questao(
                13, "Qual das alternativas a seguir é uma palavra reservada?",
                new String[]{"remove", "create", "insert", "let", "new"},
                "E"
        );

        Questao q14 = new Questao(
                14, "Qual das alternativas a seguir NÃO é uma palavra reservada?",
                new String[]{"do", "Float", "float", "throw", "new"},
                "B"
        );

        Questao q15 = new Questao(
                15, "O que significa a sigla JVM?",
                new String[]{"Java Volatile Memory ", "Java Virtual Mechanic", "Java Virtual Memory", "Jupiter Venus Marte", "java Virtual Machine"},
                "E"
        );


//        EXECUÇÃO DO PROGRAMA

        System.out.println();
        System.out.println("+-------------------------------------+");
        System.out.println("|              JAVA QUIZ              |");
        System.out.println("+-------------------------------------+");
        System.out.println("+  15 Questões  |");
        System.out.println("+---------------+");
        System.out.println();

        q1.escrevaQuestao();
        if(q1.isCorreta(q1.leiaResposta())) pontos++;

        System.out.println("---------------------------------------\n");
        q2.escrevaQuestao();
        if(q2.isCorreta(q2.leiaResposta())) pontos++;

        System.out.println("---------------------------------------\n");
        q3.escrevaQuestao();
        if(q3.isCorreta(q3.leiaResposta())) pontos++;

        System.out.println("---------------------------------------\n");
        q4.escrevaQuestao();
        if(q4.isCorreta(q4.leiaResposta())) pontos++;

        System.out.println("---------------------------------------\n");
        q5.escrevaQuestao();
        if(q5.isCorreta(q5.leiaResposta())) pontos++;

        System.out.println("---------------------------------------\n");
        q6.escrevaQuestao();
        if(q6.isCorreta(q6.leiaResposta())) pontos++;

        System.out.println("---------------------------------------\n");
        q7.escrevaQuestao();
        if(q7.isCorreta(q7.leiaResposta())) pontos++;

        System.out.println("---------------------------------------\n");
        q8.escrevaQuestao();
        if(q8.isCorreta(q8.leiaResposta())) pontos++;

        System.out.println("---------------------------------------\n");
        q9.escrevaQuestao();
        if(q9.isCorreta(q9.leiaResposta())) pontos++;

        System.out.println("---------------------------------------\n");
        q10.escrevaQuestao();
        if(q10.isCorreta(q10.leiaResposta())) pontos++;

        System.out.println("---------------------------------------\n");
        q11.escrevaQuestao();
        if(q11.isCorreta(q11.leiaResposta())) pontos++;

        System.out.println("---------------------------------------\n");
        q12.escrevaQuestao();
        if(q12.isCorreta(q12.leiaResposta())) pontos++;

        System.out.println("---------------------------------------\n");
        q13.escrevaQuestao();
        if(q13.isCorreta(q13.leiaResposta())) pontos++;

        System.out.println("---------------------------------------\n");
        q14.escrevaQuestao();
        if(q14.isCorreta(q14.leiaResposta())) pontos++;

        System.out.println("---------------------------------------\n");
        q15.escrevaQuestao();
        if(q15.isCorreta(q15.leiaResposta())) pontos++;

        System.out.println("---------------------------------------\n");


        System.out.println("Voce fez um total de "+pontos+" pontos!");
    }

}
