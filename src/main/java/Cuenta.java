import java.util.Vector;

public class Cuenta {
	private CarroCompras carrito;
	private Cliente cliente;
	private Vector<Pedido> pedidos = new Vector<Pedido>();
	private Vector<MedioPago> medios_de_pago = new Vector<MedioPago>();
}