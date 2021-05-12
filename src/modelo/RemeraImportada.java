package modelo;

public class RemeraImportada extends Remera {
	private double precioUnitario;

	public RemeraImportada(double precioUnitario) {
		super(precioUnitario);
	}

	@Override
	public double aplicarRecargo(double precio) {
		return precio * 1.03;
	}

	@Override
	public double aplicarImpuestoAduanero(double precio) {
		return precio * 1.05;
	}

	@Override
	public double aplicarPrecioComercial(double precio) {
		return precio * 1.25;
	}
}
