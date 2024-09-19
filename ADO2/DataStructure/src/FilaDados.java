public class FilaDados {
    private String[] filaComum;
    private String[] filaPrioridade;
    private int comumCount;
    private int prioridadeCount;
    private int prioridadeAtendida = 0;

    public FilaDados() {
        filaComum = new String[10];
        filaPrioridade = new String[5];
    }

    public String[] getFilaComum() {
        return filaComum;
    }

    public String[] getFilaPrioridade() {
        return filaPrioridade;
    }

    public int getComumCount() {
        return comumCount;
    }

    public void setComumCount(int comumCount) {
        this.comumCount = comumCount;
    }

    public int getPrioridadeCount() {
        return prioridadeCount;
    }

    public void setPrioridadeCount(int prioridadeCount) {
        this.prioridadeCount = prioridadeCount;
    }

    public int getPrioridadeAtendida() {
        return prioridadeAtendida;
    }

    public void setPrioridadeAtendida(int prioridadeAtendida) {
        this.prioridadeAtendida = prioridadeAtendida;
    }
}
