package modelo;

public abstract class Remera {
	private double precioUnitario;

	protected Remera(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public double precioFinal() {
		double monto = precioUnitario;

		monto = this.aplicarRecargo(monto);
		monto = this.aplicarImpuestoAduanero(monto);
		monto = this.aplicarPrecioComercial(monto);

		return monto;
	}

	protected abstract double aplicarRecargo(double precio);

	protected abstract double aplicarImpuestoAduanero(double precio);

	protected abstract double aplicarPrecioComercial(double precio);
}
