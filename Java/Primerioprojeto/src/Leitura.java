import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in); //aqui é o que a estabelece um classe de qual o usuário poderá perguntar

        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine(); //nextLine é ver o que o digitei e armazenar na variável filme

        System.out.println("Qual o ano de lançamento");
        int anoDeLancamento = leitura.nextInt(); //aqui eu pegaria um valor int então fica nextInt()

        System.out.println("Diga sua avaliação para o filme");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);




    }
}
