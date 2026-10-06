double hipotenusas(int a, int b) {

    double Catetos = Math.pow(a, 2) + Math.pow(b, 2);
    double raiz = Math.sqrt(Catetos);
    double hipotenusa = raiz;

    return hipotenusa;
}

void main() {

    double resultado;
    
    resultado = hipotenusas(3,8);
    IO.println("Hipotenusa = " + resultado);

}