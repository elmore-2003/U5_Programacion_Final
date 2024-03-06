package proyecto;

import java.util.ArrayList;
import java.util.Collections;

public class Mazo {
    ArrayList<Carta> cartas;

    public Mazo() {
        cartas = new ArrayList<>();
// Con este metodo se llena el mazo con todas las cartas
        for (Carta.Palo palo : Carta.Palo.values()) {
            for (int numero = 1; numero <= 13; numero++) {
                cartas.add(new Carta(numero, palo));
            }
        }
    }

// Este metodo se utiliza para barajar las cartas en el mazo
    public void barajar() {
        Collections.shuffle(cartas);
    }

// Este metodo se utilizara para solicitar una carta al mazo
    public Carta solicitarCarta() {
        if (cartas.isEmpty()) {
            return null;
        }
        return cartas.remove(0);
    }
// Con el metodo "toString" representamos la cadena del mazo
    @Override
    public String toString() {
        StringBuilder resultado = new StringBuilder();
        for (Carta carta : cartas) {
            resultado.append(carta.toString()).append("\n");
        }
        return resultado.toString();
    }
}