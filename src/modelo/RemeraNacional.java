package modelo;

public class RemeraNacional extends Remera {
	private double precioUnitario;

	public RemeraNacional(double precioUnitario) {
		super(precioUnitario);
	}

	@Override
	protected double aplicarRecargo(double precio) {
		return precio * 1.015;
	}

	@Override
	protected double aplicarImpuestoAduanero(double precio) {
		return precio * 1.2;
	}

	@Override
	protected double aplicarPrecioComercial(double precio) {
		return precio * 1.15;
	}
}
