package proyecto;

import java.util.ArrayList;

public class Carta {
    public enum Palo {
        TREBOL, DIAMANTES, CORAZONES, PICAS
    }

    private int numero;
    private Palo palo;

    public Carta(int numero, Palo palo) {
    // Con esto verificamos que el número de la carta se encuantra entre el 1 y el 13
        if (numero < 1 || numero > 13) {
            throw new IllegalArgumentException("El número de la carta debe estar entre 1 y 13.");
        }
        this.numero = numero;
        this.palo = palo;
    }

    // Estos son los metododos Getter de las clase private
    public int getNumero() {
        return numero;
    }

    public Palo getPalo() {
        return palo;
    }

    // Con este metodo optenemos los valores de la carta
    public int getValor(){
    // Con esto asignamos los valores para las cartas "AS, J, Q, K"
        if (numero == 1) {
            return 11;
        } else if (numero >= 11 && numero <= 13) {
            return 10;
        } else {
    // Con esto le damos los valores a las demas cartas
            return numero;
        }
    }

    // Con este metodo obtendremos el número de la carta
    public String mostrarNumero() {
        if (numero == 1) {
            return "AS";
        } else if (numero >= 11 && numero <= 13) {
            return String.valueOf((char) ('A' + numero - 11));
        } else {
            return String.valueOf(numero);
        }
    }
    // Con el metodo "toString" representamos la cadena de la carta
    @Override
    public String toString() {
        return "[" + mostrarNumero() + " - " + palo + "]";
    }
}