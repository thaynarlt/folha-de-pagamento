public class Main {
    public static void main(String[] args) {
        // Definição do salário mínimo para todos os empregados
        Empregado.setSalarioMinimo(1500.00);
        
        /* 
        * O parâmetro "quantidade" representa o número de salários mínimos que o empregado recebe.
        * Exemplo:
        * - Se "quantidade" for 2, o salário do empregado será (2 * salário mínimo) - (0.1 * salário mínimo).
        * - A dedução de 10% sobre o salário mínimo representa um desconto fixo aplicado a todos.
        */
        
        // Criando um gerente (que também é um empregado, mas recebe gratificação adicional)
        Gerente gerente = new Gerente(3, 2000); // Ganha 3 salários mínimos + R$2000 de gratificação
        
        // Criando uma loja e adicionando o gerente
        Loja loja = new Loja("12.345.678/0001-99", "Paloma", gerente);
        
        // Criando empregados normais com diferentes quantidades de salário mínimo
        Empregado emp1 = new Empregado(2);   // Ganha 2 salários mínimos - desconto de 10% do salário mínimo
        Empregado emp2 = new Empregado(1.5); // Ganha 1.5 salários mínimos - desconto de 10% do salário mínimo
        Empregado emp3 = new Empregado(4);   // Ganha 4 salários mínimos - desconto de 10% do salário mínimo
        
        // Adicionando empregados à loja
        loja.adicionar(emp1);
        loja.adicionar(emp2);
        loja.adicionar(emp3);
        
        // Exibindo informações da loja e dos salários
        System.out.println("Loja: " + loja.getNome() + " | CNPJ: " + loja.getCnpj());
        System.out.println("Salário Total da Loja: R$" + loja.getSalarioTotal());
        System.out.println("Desconto Total da Loja: R$" + loja.getDescontoTotal());
        System.out.println("Empregado com maior salário (Marajá): Matrícula " + loja.getMaraja().getMatricula());
        
        // Removendo um empregado e exibindo os valores atualizados
        loja.remover(emp2);
        System.out.println("\nApós remover um empregado:");
        System.out.println("Salário Total da Loja: R$" + loja.getSalarioTotal());
        System.out.println("Desconto Total da Loja: R$" + loja.getDescontoTotal());
        System.out.println("Empregado com maior salário (Marajá): Matrícula " + loja.getMaraja().getMatricula());
    }
}
