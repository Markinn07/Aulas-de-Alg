double mediadeTres(int num1, int num2, int num3) {

    double media = (num1 + num2 + num3) / 3;
    return media;
}

void main() {
    double resultado;
    resultado = mediadeTres(10, 10, 10);
    IO.println("média de três = " + resultado);
}