public class Fila extends FilaDados {

    public void adicionarComum(String senha) {
        if (getComumCount() < getFilaComum().length) {
            getFilaComum()[getComumCount()] = senha;
            setComumCount(getComumCount() + 1);
        } else {
            System.out.println("Fila comum cheia!");
        }
    }

    public void adicionarPrioridade(String senha) {
        if (getPrioridadeCount() < getFilaPrioridade().length) {
            getFilaPrioridade()[getPrioridadeCount()] = senha;
            setPrioridadeCount(getPrioridadeCount() + 1);
        } else {
            System.out.println("Fila de prioridade cheia!");
        }
    }

    public String chamarProximo() {
        if (getPrioridadeAtendida() == 3 || getPrioridadeCount() == 0) {
            if (getComumCount() > 0) {
                setPrioridadeAtendida(0);
                return atenderComum();
            } else if (getPrioridadeCount() > 0) {
                return atenderPrioridade();
            } else {
                return "Fila vazia!";
            }
        } else {
            return atenderPrioridade();
        }
    }

    private String atenderComum() {
        if (getComumCount() > 0) {
            String senhaAtendida = getFilaComum()[0];
            shiftLeft(getFilaComum(), getComumCount());
            setComumCount(getComumCount() - 1);
            return "Atendendo paciente comum: " + senhaAtendida;
        } else {
            return "Não há pacientes comuns na fila!";
        }
    }

    private String atenderPrioridade() {
        if (getPrioridadeCount() > 0) {
            String senhaAtendida = getFilaPrioridade()[0];
            shiftLeft(getFilaPrioridade(), getPrioridadeCount());
            setPrioridadeCount(getPrioridadeCount() - 1);
            setPrioridadeAtendida(getPrioridadeAtendida() + 1);
            return "Atendendo paciente prioritário: " + senhaAtendida;
        } else {
            return "Não há pacientes prioritários na fila!";
        }
    }

    public void listarSenhas() {
        System.out.println("Senhas Comuns:");
        for (int i = 0; i < getComumCount(); i++) {
            System.out.println(getFilaComum()[i]);
        }

        System.out.println("\nSenhas Prioritárias:");
        for (int i = 0; i < getPrioridadeCount(); i++) {
            System.out.println(getFilaPrioridade()[i]);
        }
    }

    public String proximoVisualizar() {
        if (getPrioridadeAtendida() == 3 || getPrioridadeCount() == 0) {
            return getComumCount() > 0 ? "Próximo paciente comum: " + getFilaComum()[0] : "Nenhum paciente comum na fila!";
        } else {
            return getPrioridadeCount() > 0 ? "Próximo paciente prioritário: " + getFilaPrioridade()[0] : "Nenhum paciente prioritário na fila!";
        }
    }

    private void shiftLeft(String[] fila, int tamanho) {
        for (int i = 0; i < tamanho - 1; i++) {
            fila[i] = fila[i + 1];
        }
        fila[tamanho - 1] = null;
    }

    public void excluirSenha(String tipo) {
        if (tipo.equalsIgnoreCase("comum") && getComumCount() > 0) {
            System.out.println("Excluindo paciente comum: " + getFilaComum()[0]);
            shiftLeft(getFilaComum(), getComumCount());
            setComumCount(getComumCount() - 1);
        } else if (tipo.equalsIgnoreCase("prioridade") && getPrioridadeCount() > 0) {
            System.out.println("Excluindo paciente prioritário: " + getFilaPrioridade()[0]);
            shiftLeft(getFilaPrioridade(), getPrioridadeCount());
            setPrioridadeCount(getPrioridadeCount() - 1);
        } else {
            System.out.println("Tipo de paciente inválido ou fila vazia.");
        }
    }
}
