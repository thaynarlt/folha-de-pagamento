## **Projeto 2**

### **Contexto**

Um sistema de folha de pagamento gerencia os pagamentos dos empregados de várias lojas, cujos salários variam de acordo com a quantidade de salários mínimos (≥ 1). São realizados os seguintes cálculos:

- **Salário de um empregado** = (quantidade * salário mínimo) – desconto, onde o desconto é 10% do salário mínimo. 🆗
- **Salário de um gerente** = salário de empregado (cálculo acima) + gratificação. 🆗
- **Salário total da loja** = soma dos salários dos seus empregados. 🆗
- **Desconto total da loja** = soma dos descontos dos seus empregados. 🆗

---

![image.png](attachment:dfa8038e-9d2f-4978-bd9b-ec9ef0a6a749:image.png)

---

### Observações:

1. Os atributos e métodos sublinhados são estáticos (*static*). 🆗
2. O relacionamento entre **Loja** e **Empregado** é **um-para-muitos bidirecional**, e a lista de empregados da loja é **polimórfica**, ou seja, reunirá objetos das classes **Gerente** e **Empregado**. 🆗
3. A **matrícula** de um empregado é **sequencial** (1, 2, ...) e **única**, sendo obtida a partir do **contador de objetos** da classe **Empregado**. 🆗
4. O **salário mínimo** é **único** para todos os empregados de todas as lojas e deve ser definido pelo método `setSalarioMinimo()`. 🆗
5. A **data de admissão** de um empregado será obtida do computador da seguinte forma: 🆗
    
    ```java
    dataAdmissao = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    ```
    
6. Uma **Loja** será instanciada com **CNPJ, nome e o gerente da loja**, que será o **primeiro** a ser adicionado à lista de empregados da loja. 🆗
7. Os métodos `getSalario()` calcularão os salários conforme descrito no enunciado. 🆗
8. O método `getEmpregados()` retornará **todos os empregados** da loja, incluindo o gerente. 🆗
9. O método `getMaraja()` retornará o **empregado com maior salário** da loja. 🆗
