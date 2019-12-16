
package Modelo;

public class Aluguel {
    private int cod;
    private int coddvd;
    private int codcliente;
    private String data_aluga;
    private String horario;
    private String data_devolucao;

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getCoddvd() {
        return coddvd;
    }

    public void setCoddvd(int coddvd) {
        this.coddvd = coddvd;
    }

    public int getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(int codcliente) {
        this.codcliente = codcliente;
    }

    public String getData_aluga() {
        return data_aluga;
    }

    public void setData_aluga(String data_aluno) {
        this.data_aluga = data_aluno;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getData_devolucao() {
        return data_devolucao;
    }

    public void setData_devolucao(String data_devolucao) {
        this.data_devolucao = data_devolucao;
    }
}
