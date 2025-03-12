import java.util.ArrayList;
import java.util.List;

public class Loja {
    
    private String cnpj;
    private String nome;
    private ArrayList<Empregado> empregados;

    public Loja(String cnpj, String nome, Gerente gerente) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.empregados = new ArrayList<Empregado>();
        adicionar(gerente);
    }
    

    public String getCnpj() {
        return this.cnpj;
    }
    public String getNome() {
        return this.nome;
    }


    // Adicionar e Remover empregado
    public void adicionar(Empregado empregado) {
        empregado.setLoja(this);
        this.empregados.add(empregado);
    }

    public void remover(Empregado empregado) {
        empregado.setLoja(null);
        this.empregados.remove(empregado);
    }

    // Get Salario Total
    public double getSalarioTotal() {
        double total = 0;
        for (Empregado empregado : this.empregados) {
            total += empregado.getSalario();
        }
        return total;
    }

    // Get Desconto Total
    public double getDescontoTotal() {
        return empregados.size() * (0.1 * Empregado.salarioMinimo);
    }

    public List<Empregado> getEmpregados() {
        return this.empregados;
    }

    //Get Gerente
    public Gerente getGerente() {
        for (Empregado e : empregados) {
            if (e instanceof Gerente) {
                return (Gerente) e;
            }
        }
        return null;
    }

    //Get Maraja
    public Empregado getMaraja() {
        if (empregados.isEmpty()) {
            return null;
        }
        Empregado maraja = empregados.get(0);
        for (Empregado e : empregados) {
            if (e.getSalario() > maraja.getSalario()) {
                maraja = e;
            }
        }
        return maraja;
    }

}
