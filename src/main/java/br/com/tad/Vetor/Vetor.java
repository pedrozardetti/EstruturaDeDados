package br.com.tad.Vetor;

public class Vetor {
    private int vetor[];

    private int quantidade;

    public Vetor(int tamanho) {
        this.vetor = new int[tamanho];
        this.quantidade = 0;


    }

    public boolean isEmpty() {

        if (quantidade == 0) {
            return true;
        }

        return false;
    }

    public boolean isFull() {
        if (quantidade == vetor.length) {
            return true;
        }

        return false;
    }

    public boolean add(int valor) {
        if (isFull()) {
            System.out.println("Vetor cheio!");
            return false;
        } else {
            vetor[quantidade] = valor;
            quantidade++;
            return true;
        }


    }


    public boolean get(int valor) {
        int i;
        for (i = 0; i < quantidade; i++) {
            if (vetor[i] == valor)
                break;
        }

        if (i == quantidade)
            return false;
        else
            return true;
    }

    public void display() {
        for (int i = 0; i < quantidade; i++) {
            System.out.println(vetor[i] + " ");

            System.out.println("");

        }
    }

    public boolean remover(int valor) {
        int i;
        for (i = 0; i < quantidade; i++) {
            if (valor == vetor[i]) {
                break;
            }
        }

        if (i == quantidade) {
            return false;
        } else {
            for (int j = i; j < quantidade; j++) {
                if (j == vetor.length - 1) {
                    vetor[j] = 0;
                } else {
                    vetor[j] = vetor[j+1];
                }

            }

            quantidade--;
            return true;
        }

    }

    public int getPosition(int valor) {
        int i;
        for (i = 0; i < quantidade; i++) {
            if (vetor[i] == valor) {
                break;
            }

        }
        if (i == quantidade) {

            return -1;
        } else {
            return i;
        }
    }

    public boolean alterar(int atual, int novo) {
        if (isEmpty()) {
            return false;
        }

        int i;
        for (i = 0; i < quantidade; i++) {
            if (vetor[i] == atual) {
                break;
            }
        }

        if (i == quantidade) {
            return false;

        } else {
            vetor[i] = novo;
            return true;
        }
    }

}
