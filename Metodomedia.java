double mediaNumeros(double num1, double num2) {
    double media = (num1 + num2) / 2;
    return media;

}

void main() {
    double resultado;

    resultado = mediaNumeros(5, 7);
    IO.println("valor da média: " + resultado);

}