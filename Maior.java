int maiordeTres( int a, int b, int c) {
    
    int maior = a;

    if( b > maior) {
        maior = b;
    }

    if(c > b) 
        maior = c;
        
    return maior;
}

void main() {

    int resultado;
    
    resultado = maiordeTres(4, 2, 9);
    IO.println("O maior é: " + resultado);
}
