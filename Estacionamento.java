void main () {
    IO.println(calculadoraAdicional);

}

double obtemTarifaBase(String tipo){
    tarifaBase;
    switch (tipo) {
        case "m" -> tarifaBase = 5.0;
        case "c" -> tarifaBase = 10.0;
        case "CE" -> tarifaBase = 20.0;
        default -> throw new RuntimeException("Veículo inválido");

    }
    return tarifaBase;

}

double calculaAdicional(double horas) {
    double adicional;
    double minutos = horas * 60.0;
    if (minutos <= 30.0) {
        adicional = 0.0;
    } else if (minutos <= 120.0) {
        adicional = 8.0;
    } else if (minutos <= 360.0) {
        adicional = 20.0;
    
    } else {
        adicional = 30.0 + 0,05 * (minutos - 360.0);
    }
}
