public class Poligonos {

    public static void main(String[] args) {
        Poligon quadrado = new Poligon();
        Poligon triangulo = new Poligon();

        triangulo.setAngulos(triangulo.calcularAngulos());
        triangulo.setNome("Quadrado");
    }
}
