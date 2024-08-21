package br.com.tad.ArrayList;

public class GenericArrayList {

    public class ArrayList<T> {
        private Object vetor[];
        private int quantidade;

        public ArrayList(int tamanho) {
            this.vetor = new Object[tamanho];
            this.quantidade = 0;
        }

        public ArrayList() {
            this.vetor = new Object[5];
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

        private Object[] copyVector(Object[] vector) {
            Object vetor2[] = new Object[vector.length * 2];
            for (int i = 0; i < vector.length; i++) {
                vetor2[i] = vector[i];
            }


            return vetor2;
        }

        public boolean add(T valor) {
            if (isFull()) {
                vetor = copyVector(vetor);
            } else {
                vetor[quantidade] = valor;
                quantidade++;
                return true;
            }

            vetor[quantidade] = valor;
            quantidade++;
            return true;
        }

        public boolean get(T valor) {
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

        public boolean remover(T valor) {
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

        public int getPosition(T valor) {
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

        public boolean alterar(T atual, T novo) {
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
}
