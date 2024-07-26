package list.OperacoesBasicas;

public class Tarefa {
    //atributo
    private String descricao;

    //construtor alt + insert
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    //métodos
    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
