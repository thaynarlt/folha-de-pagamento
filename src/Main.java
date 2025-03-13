import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Definição do salário mínimo para todos os empregados
        Empregado.setSalarioMinimo(1500.00);
        
        // Criando lojas e adicionando empregados
        Loja loja1 = new Loja("12.345.678/0001-99", "Paloma", new Gerente(1, 800));
        loja1.adicionar(new Empregado(1));
        loja1.adicionar(new Empregado(1));
        
        Loja loja2 = new Loja("15.125.688/0001-55", "Armazém Paraíba", new Gerente(1, 500));
        loja2.adicionar(new Empregado(2));
        loja2.adicionar(new Empregado(2));
        
        // LOJA 2
        System.out.println("EMPREGADOS LOJA 2:");
        for (Empregado e : loja2.getEmpregados()) {
            System.out.println("   MATRÍCULA = " + e.getMatricula() + " (Quantidade = " + e.getQuantidade() + ") => Salário = " + e.getSalario() + " / " + e.getLoja().getNome());
        }
        System.out.println("\n--- Removendo o último empregado da LOJA 2 ---\n");

        // Remover o último empregado da loja 2
        if (!loja2.getEmpregados().isEmpty()) {
            loja2.remover(loja2.getEmpregados().get(loja2.getEmpregados().size() - 1));
        }

        System.out.println("EMPREGADOS ATUALIZADOS DA LOJA 2:");
        for (Empregado e : loja2.getEmpregados()) {
            System.out.println("   MATRÍCULA = " + e.getMatricula() + " (Quantidade = " + e.getQuantidade() + ") => Salário = " + e.getSalario() + " / " + e.getLoja().getNome());
        }
        System.out.println("-- LISTA DE EMPREGADOS DA LOJA 2 ATUALIZADA ---\n");


        // LOJA 1
        System.out.println("\n--- LOJA 1 ---\n");
        System.out.println("CNPJ: " + loja1.getCnpj());
        System.out.println("Nome: " + loja1.getNome());
        System.out.println("Gerente: " + loja1.getGerente().getMatricula()+ ", " + " Gratificação = " + loja1.getGerente().getGratificacao());
        System.out.println("Empregados:");
        for (Empregado e : loja1.getEmpregados()) {
            System.out.println("   Matrícula = " + e.getMatricula() + " (Quantidade = " + e.getQuantidade() + ") => Salário = " + e.getSalario() + " | " + e.getLoja().getNome() + " | " + e.getDataAdmissao());
        }
        System.out.println("Salário Total = " + loja1.getSalarioTotal());
        System.out.println("Desconto Total = " + loja1.getDescontoTotal());
        Empregado maraja1 = loja1.getMaraja();
        if (maraja1 != null) {
            System.out.println("Maraja = " + maraja1.getMatricula() + ", Salario = " + maraja1.getSalario());
        }

        // LOJA 2
        System.out.println("\n--- LOJA 2 ---\n");
        System.out.println("CNPJ: " + loja2.getCnpj());
        System.out.println("NOME: " + loja2.getNome());
        System.out.println("GERENTE: " + loja2.getGerente().getMatricula() + " Gratificação = " + loja2.getGerente().getGratificacao());
        System.out.println("EMPREGADOS:");
        for (Empregado e : loja2.getEmpregados()) {
            System.out.println("   MATRÍCULA = " + e.getMatricula() + " (Quantidade = " + e.getQuantidade() + ") => Salário = " + e.getSalario() + " / " + e.getLoja().getNome());
        }
        System.out.println("SALÁRIO TOTAL = " + loja2.getSalarioTotal());
        System.out.println("DESCONTO TOTAL = " + loja2.getDescontoTotal());
        Empregado maraja2 = loja2.getMaraja();
        if (maraja2 != null) {
            System.out.println("MARAJA = " + maraja2.getMatricula() + ", Salário = " + maraja2.getSalario());
        }

        // Listagem Final
        System.out.println("\n--- Listar todos os empregados:");
        ArrayList<Empregado> todos = new ArrayList<>();
        todos.addAll(loja1.getEmpregados());
        todos.addAll(loja2.getEmpregados());

        for (Empregado e : todos) {
            System.out.println("   MATRÍCULA = " + e.getMatricula() + " (Quantidade = " + e.getQuantidade() + ") => Salário = " + e.getSalario() + " / " + e.getLoja().getNome());
        }
    }
}
