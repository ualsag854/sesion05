package ual.hmis;

import java.util.Objects;

public class Coche {
    private String marca;
    private String modelo;
    private int anio;
    private int precio;

    // Constructor por defecto
    public Coche() {}

    
    
    public Coche(final String marca, final String modelo, final int anio, final int precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.precio = precio;
	}


	// Getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(final String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(final String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(final int anio) {
        this.anio = anio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(final int precio) {
        this.precio = precio;
    }


	@Override
	public boolean equals(final Object obj) {
        boolean isEquals = false;
		if (this == obj) {
			isEquals = true;
        } else if (obj instanceof Coche) {
            final Coche other = (Coche) obj;
            isEquals = this.anio == other.anio && Objects.equals(marca, other.marca) && Objects.equals(modelo, other.modelo)
				&& precio == other.precio;
        }
        return isEquals;
	}



	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", año=" + anio + ", precio=" + precio + "]";
	}

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, anio, precio);
    }
	
	
    
}