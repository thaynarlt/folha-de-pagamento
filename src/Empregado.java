import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Empregado {
    protected int matricula;
    protected String dataAdmissao;
    protected double quantidade;
    protected Loja loja;

    protected static int contador = 0;
    protected static double salarioMinimo;

    // Constructor
    public Empregado(double quantidade) {
        this.matricula = ++contador;
        this.dataAdmissao = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.quantidade = quantidade;
    }

    // Getters
    public int getMatricula() {
        return this.matricula;
    }

    public String getDataAdmissao() {
        return this.dataAdmissao;
    }

    public double getQuantidade() {
        return this.quantidade;
    }

    public double getSalario() {
        return (quantidade * salarioMinimo) - (0.1 * salarioMinimo);
    }

    public Loja getLoja() {
        return this.loja;
    }

    // Setters

    public void setLoja(Loja loja) {
        this.loja = loja;
    }

    public static void setSalarioMinimo(double valor) {
        salarioMinimo = valor;
    }

    public static void resetContador() {
        contador = 0;
    }

    
    
}
