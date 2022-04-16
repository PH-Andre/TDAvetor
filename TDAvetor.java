public class TDAvetor {
    private int[] vetor;  // não criou ainda, apenas uma referencia
    private int num;  // espaço pro num

    public TDAvetor() {
        this.vetor = new int[10];
        this.num = 0;
    }

    public int TotalAlocado() {
        return this.vetor.length;
    }
    public int Tamanho(){
        return this.num;
    }

    public boolean estaCheia(){
      return this.num == this.vetor.length; // consulta valor maximo na hora da criação

    }

    public void inserFinal(int elem) {
        this.aumentaTamanho();
        if (! estaCheia()) {
            this.vetor[this.num] = elem;
            this.num = this.num + 1;
        }
        else {
            System.out.println("Vetor esta cheio");
        }}

    public void inserInicio(int elem){
        this.aumentaTamanho();
        if (! estaCheia()) {
            for (int i = this.num-1; i >= 0; i--){
                this.vetor[i+1] = this.vetor[i];
            }
            this.vetor[0] = elem;
            this.num = this.num + 1;
        }
        else {
            System.out.println("Vetor esta cheio");
        }}


    public void insere(int pos, int valor) {
        this.aumentaTamanho();
        if (! estaCheia()) {
            for (int i = this.num-1; i >= pos-1; i--){
                this.vetor[i+1] = this.vetor[i];
            }
            this.vetor[pos-1] = valor;
            this.num = this.num + 1;
        }
        else {
            System.out.println("Vetor esta cheio");
        }
   }





    public void imprime(){
        for (int i = 0; i < this.num ; i++) {
            System.out.println(this.vetor[i]);

        }
        return ;
    }

    public boolean estaVazia(){
        return this.num == 0;
    }

    public void removeFinal(){
        if(estaVazia()) {
            System.out.println("esta vazio");
        }
        else{
            //this.vetor[this.num-1] = null;

            this.num = this.num -1;
        }
    }

    public void remove(int pos){
        if(estaVazia()) {
            System.out.println("esta vazio");
        }
        else{
            for (int i = pos; i <this.num; i++){
                this.vetor[i-1] = this.vetor[i];
            }
            this.num = this.num-1;

        }
    }

    public void removeInicio(){
        if(estaVazia()) {
            System.out.println("esta vazio");
        }
        else{
            for (int i = 1; i <this.num; i++){
                this.vetor[i-1] = this.vetor[i];
            }
            this.num = this.num-1;

        }
    }

    public int acessa(int pos){
        if (pos >= 0 && pos < this.num){
            return this.vetor[pos];
        }
        else {
            System.out.println("posição inexistente");
            return -1;
        }
    }

    public void altera(int pos, int valor) {
        if(pos < this.num){
            this.vetor[pos-1] = valor;
        }

        else {System.out.println("POSIÇAO FORA DOS LIMITES DA ESTRUTURA");}
    }

    public void limpa() {
        this.num = 0;
    }

    public boolean pesquisa(int elem){
        for (int i = 0; i < this.num; i++) {
            if (this.vetor[i] == elem) {
                return true;
            }
        }
        return false;}

    public void aumentaTamanho() {
        if (this.num == this.vetor.length) {
            int[] newvetor = new int[this.vetor.length * 2];
            for (int i = 0; i < this.vetor.length; i++) {
                newvetor[i] = this.vetor[i];
            }
            this.vetor = newvetor;
        }
    }

    @Override
    public String toString() {
        System.out.println(" Elementos: ");
        for (int i = 0; i < this.num ; i++) {
            System.out.println( this.vetor[i]);

        }

        return "\r\nnumero de elementos = " + this.num;};
    }









