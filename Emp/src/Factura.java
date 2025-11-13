import java.util.ArrayList;

class Factura {
    private int id;
    private String direccion;
    private double total;
    private ArrayList<Servicio> servicios;
    private Cliente cliente;

    public Factura(int id, String direccion, Cliente cliente) {
        this.id = id;
        this.direccion = direccion;
        this.cliente = cliente;
        this.servicios = new ArrayList<>();
        this.total = 0.0;
    }

    // Métodos
    public void agregarServicio(Servicio servicio) {
        if (servicio != null) {
            servicios.add(servicio);
            total += servicio.getValor();
        }
    }

    public double getTotal() { return total; }
    public ArrayList<Servicio> getServicios() { return servicios; }
    public Cliente getCliente() { return cliente; }
    public String getDireccion() { return direccion; }

    public void mostrarFactura() {
        System.out.println("=== FACTURA #" + id + " ===");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Dirección: " + direccion);
        System.out.println("\n--- Servicios ---");
        for (Servicio s : servicios) {
            System.out.println(s);
        }
        System.out.println("------------------");
        System.out.println("TOTAL: $" + total);
    }
}
