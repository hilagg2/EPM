public class Servicio {
    private int id;
    private String tipo;
    private double valor;


    public Servicio(int id, String tipo, double valor) {
        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
    }


    public int getId() { return id; }
    public String getTipo() { return tipo; }
    public double getValor() { return valor; }


    public void setId(int id) { this.id = id; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public void setValor(double valor) { this.valor = valor; }


    @Override
    public String toString() {
        return "Servicio{" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                ", valor=" + valor +
                '}';
    }
}
