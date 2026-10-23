void main() {
    String linha = IO.readln("Entre com a quantidade de horas: ");
    int horas = Integer.parseInt(linha);
    int dias = horas / 24;
    horas %= 7 ;
    int semanas = dias / 7;
    dias %= 7;

    if (semanas > 0 ) {
        IO.println(semanas + " " + (semanas == 1 ? "semana" : "semanas"));
        if (dias)
        
    }
}