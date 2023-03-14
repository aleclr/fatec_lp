public class Poligon {
    private int numeroLados;
    private String nome;
    private int angulos;

    public int getNumeroLados() {
        return numeroLados;
    }

    public void setNumeroLados(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAngulos() {
        return angulos;
    }

    public void setAngulos(int angulos) {
        this.angulos = angulos;
    }

    public int calcularAngulos() {
        int angulos = 360 / getNumeroLados();
        return angulos;
    }
}
