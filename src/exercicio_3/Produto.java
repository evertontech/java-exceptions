package exercicio_3;

public class Produto {
    private String nome;
    private int quantidade;
    private double precoUnitario;

    public Produto(String nome, int quantidade, double precoUnitario) {
        if (nome.isBlank()) {
           throw new NomeException("O Nome não pode estar em branco.");
        }

        if (nome.length() <= 3) {
            throw new NomeException("O nome precisa ser maior que três caracteres.");
        }

        if (quantidade < 0) {
            throw new QuantidadeException("A Quantidade não pode ser negativa.");
        }

        if (precoUnitario <= 0) {
            throw new PrecoException("O Preço não pode ser zero ou negativo.");
        }

        this.precoUnitario = precoUnitario;
        this.nome = nome;
        this.quantidade = quantidade;
        Logs.emTodos("Novo produto criado.", Logs.Severidade.INFO);


    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public double getPrecoUnitario() {
        return this.precoUnitario;
    }
}
