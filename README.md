# Projeto Aluguel de veículos (Java)

## Estrutura do código
### Classe Veiculo

A classe Veiculo representa um veículo disponível para locação. Ela armazena o modelo e o valor da diária e fornece um método para calcular o custo total com desconto baseado no número de dias alugados.

### Construtor
- modelo: nome ou modelo do veículo.
- valorDiaria: valor da diária (precisa ser maior que 0).
- Lança uma Exception se o valor da diária for inválido.

### Método desconto(int dias)

Calcula o valor total da locação com base nos dias e aplica os seguintes descontos:

- Menos de 7 dias: sem desconto.
- De 7 a 13 dias: 10% de desconto.
- De 14 a 20 dias: 20% de desconto.
- De 21 a 27 dias: 30% de desconto.
- 28 dias ou mais: 50% de desconto.

Lança uma Exception se o número de dias for menor ou igual a zero.

## Testes com JUnit

Os testes automatizados cobrem todos os cenários de uso da classe Veiculo, incluindo:

- Cálculo correto do valor com e sem desconto.
- Tratamento de entradas inválidas (diária negativa, dias iguais ou menores que zero).

### Casos de teste cobertos:

- Locação com menos de 7 dias.
- Locação com diferentes faixas de desconto.
- Diária negativa (deve lançar exceção).
- Dias iguais a 0 ou negativos (devem lançar exceção).

## Requisitos

- Java 8 ou superior
- JUnit 5
- Executar preferencialmente no Intellij (onde foi criado o projeto)

# Feito por: Maria Clara - RM 557478 - 2ESPX
