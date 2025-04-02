package org.example;
public class Veiculo {
    private String modelo;
    private double valorDiaria;

    public Veiculo(String modelo, double valorDiaria) throws Exception {
        this.modelo = modelo;
        if (valorDiaria <=0){
            throw new Exception("O valor da Diária deve ser maior que 0.");
        }
        this.valorDiaria = valorDiaria;
    }

    private double calcularCusto(int dias){
        return this.valorDiaria * dias;
    }

    public double desconto(int dias){
        double total = 0;
        if (dias >=7 && dias < 14){
            total = calcularCusto(dias)*0.9;
        }
        else if (dias >= 14 && dias < 21){
            total = calcularCusto(dias)*0.8;
        }
        else if (dias >= 21 && dias < 28){
            total = calcularCusto(dias)*0.7;
        }
        else if (dias >= 28){
            total = calcularCusto(dias)*0.5;
        }
        else{
            total = calcularCusto(dias);
        }
        return total;
    }
}