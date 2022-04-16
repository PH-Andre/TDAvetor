public class principal {
    public static void main(String[] args) {
        TDAvetor tad1 = new TDAvetor();
        TDAvetor tad2 = new TDAvetor();


        System.out.println(tad1.estaCheia());
        System.out.println(tad1.estaVazia());

        tad1.inserInicio(150);
        tad1.inserInicio(180);
        tad1.inserInicio(16);
        tad1.inserInicio(170);
        tad1.inserFinal(10);
        tad1.inserFinal(30);
        tad1.inserFinal(60);
        tad1.inserFinal(90);
        tad1.inserFinal(10);
        tad1.inserFinal(30);

       tad1.imprime();
       System.out.println("____________remove final______________________");
       tad1.removeFinal();
       tad1.imprime();

       System.out.println("____________remove inicio______________________");
       tad1.removeInicio();
       tad1.imprime();

        System.out.println("____________tamanho______________________");

       System.out.println(tad1.Tamanho());

        System.out.println("____________tamanho_alocado_________________");
        //Consulta tamanho alocado na memória
        System.out.println(tad1.TotalAlocado());

        System.out.println("____________insere_________________");
        tad1.insere(3,3);
        tad1.imprime();

        System.out.println("____________remove______________________");
        tad1.remove(4);
        tad1.imprime();

        System.out.println("____________altera______________________");
        tad1.altera( 1, 22);
        tad1.imprime();

        System.out.println("____________pesquisa______________________");

        System.out.println(tad1.pesquisa(90));

        tad1.toString();

        System.out.println("_____ LIMPA______");

        tad1.limpa();
        tad1.imprime();







    }

}
