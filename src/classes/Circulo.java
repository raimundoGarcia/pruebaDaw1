
package classes;

public class Circulo {

    private double radio;

    public Circulo(double rad) {
        radio = rad;
    }

    public double getRadio() { // método que devuelve el radio
        return radio;
    }

    public void setRadio(double valor) { //método que asigna el valor al radio
        radio = valor;
    }

    public double area() { // método que calcula el área
        return Math.PI * radio * radio;
    }
    
    public double diametro(){
        return radio * 2;
    }
}
