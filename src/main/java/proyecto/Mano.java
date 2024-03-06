package proyecto;

import java.util.ArrayList;

public class Mano {
    private ArrayList<Carta> cartas;

    public Mano() {
        this.cartas = new ArrayList<>();
    }

// Con este metodo obtendremos el valor de las cartas que tenemos en nuestra mano
    public int valorMano() {
        int valor = 0;
        for (Carta carta : cartas) {
            valor += carta.getValor();
        }
        return valor;
    }

// Con este metodo verificamos si las cartas que tenenmos en la mano se han pasado de 21 o no
    public boolean finDeJuego() {
        return valorMano() > 21;
    }
// Con el metodo "toString" representamos la cadena de la mano
    @Override
    public String toString() {
        StringBuilder resultado = new StringBuilder();
        for (Carta carta : cartas) {
            resultado.append(carta.toString()).append("\n");
        }
        resultado.append("Puntuación: ").append(valorMano()).append("\n");
        return resultado.toString();
    }
// Con este metodo pediremos una carta para que nos la den del mazo
    public void pedirCarta(Mazo m) {
        Carta carta = m.solicitarCarta();
        if (carta != null) {
            cartas.add(carta);
        }
    }
}