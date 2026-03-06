# Atividade 3: Refatoração do Princípio da Substituição de Liskov (LSP)

Este projeto apresenta a refatoração de um sistema de cálculo de frete da **TechStore**, aplicando os princípios do **SOLID**, especificamente o **LSP (Liskov Substitution Principle)**, utilizando o padrão de projeto **Strategy**.

## 1. O Problema: Violação do LSP

Originalmente, o sistema utilizava herança para gerenciar pedidos com frete grátis. A classe `PedidoComFreteGratis` estendia `Pedido`, mas alterava o comportamento esperado pelo código cliente (`ProcessadorDePagamento`).

### Por que quebrava o LSP?
* **Contrato Violado:** A classe base estabelecia que o frete deveria ser somado ao valor bruto. A subclasse quebrava essa pós-condição ao zerar o frete.
* **Fragilidade:** O `ProcessadorDePagamento` esperava que `valorFinal >= valorBruto`. Ao receber um objeto de frete grátis que não seguia a lógica da superclasse, o sistema gerava estados inconsistentes ou exceções em tempo de execução.
* **Substituição Inválida:** Uma instância de `PedidoComFreteGratis` não podia substituir um `Pedido` comum sem causar efeitos colaterais indesejados no fluxo de negócio.

---

## 2. Solução: Padrão Strategy

A refatoração removeu a lógica de cálculo de dentro da entidade `Pedido` e a delegou para estratégias intercambiáveis.



### Estrutura do Projeto

1.  **Interface `EstrategiaDeFrete`**: Define o contrato único para qualquer cálculo de valor final.
2.  **Implementações Concretas**:
    * `FretePadrao`: Soma o frete ao valor bruto.
    * `FreteGratis`: Ignora o valor do frete, mantendo o valor bruto original (respeitando o limite mínimo).
3.  **Classe `Pedido`**: Agora é uma classe coesa que contém apenas dados do pedido, fechada para modificações de regras de negócio.
4.  **Classe `ProcessadorDePagamento`**: Atua como o cliente que utiliza polimorfismo para processar qualquer estratégia sem necessidade de `if/else` ou verificações de tipo.

---