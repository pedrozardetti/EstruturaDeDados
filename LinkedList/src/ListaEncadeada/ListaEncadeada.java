package ListaEncadeada;
public class ListaEncadeada<Tipo> {
    private No inicio;
    private No fim;
    private int tamanho;

    public No getInicio() {
        return inicio;
    }
    public void setInicio(No inicio) {
        this.inicio = inicio;
    }
    public No getFim() {
        return fim;
    }
    public void setFim(No fim) {
        this.fim = fim;
    }
    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "ListaEncadeada [inicio=" + inicio + "]";
    }

    public void adiciona (Tipo elemento) {
        No<Tipo> celula = new No<Tipo>(elemento);
        if (this.inicio  == null &&  this.fim == null) {
            this.inicio = celula;
            this.fim = celula;
        }  else {
            this.fim.setProximo(celula);
            this.fim = celula;
    }
    this.tamanho++;

    
}

    public void remover (Tipo elemento) {
        No anterior = null;
        No atual = this.inicio;
        for (int i = 0; i < this.getTamanho(); i++) {
            if (atual.getElemento().equals(elemento)) {
                anterior.setProximo(atual.getProximo());
                atual = null;
                this.tamanho--;
                break;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }


}


