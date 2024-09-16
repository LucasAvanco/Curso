public class Main {
    public static void main(String[] args) {
        System.out.println((10 - 5) + "Repostas tem que ser 5:");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2023;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        // lembre-se métodos e variáveis letra minúscula no começo e depois letra maiúscula para outra palavra na mesma
        //variável lembrando que devem ser juntas
        // Classe Letra maiúscula no começo sempre e constante todas as letras maiúscula separado por underline se
        // precisar

        double media = (9.8 + 6.3) / 2;
        System.out.println(media);
        String sinopse;
        //aspas triplas é uma forma de formatação não se preocupa com isso só aspas já formula uma strings
        sinopse = """
                Filme top Gun
                Filme de aventura com galã dos anos 80
                Muito Bom!
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse + "\n");



        int classificacao =(int)(media / 2);
        System.out.println(classificacao);

        double temperatura = 38;
        double fahrenheit = (temperatura * 1.8) + 32;
        System.out.println(fahrenheit);
        //%f = double %s = strings
    }
}