package Banca;


public class Persona {


	
	//Clase "Persona" con los atributos: nombre, apellidos, dni, sueldo.

		private String nombre;
		private String apellidos;
		private String DNI;
		private double sueldo;
		private CuentaCorriente Cuenta;
	
		
	
	//Constructores

		/**
		 * @param nombre
		 * @param apellidos
		 * @param dNI
		 * @param sueldo
		 * @param CuentaCorriente
		 */
		public Persona(String nombre, String apellidos, String dNI, double sueldo, CuentaCorriente Cuenta) {
			super();
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.DNI = dNI;
			this.sueldo = sueldo;
			this.Cuenta = Cuenta;
		}


		
//Getters y Setters
		public String getNombre() {
			return nombre;
		}



		public void setNombre(String nombre) {
			this.nombre = nombre;
		}



		public String getApellidos() {
			return apellidos;
		}



		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}



		public String getDNI() {
			return DNI;
		}



		public void setDNI(String dNI) {
			DNI = dNI;
		}



		public double getSueldo() {
			return sueldo;
		}



		public void setSueldo(double sueldo) {
			this.sueldo = sueldo;
		}


		
       public CuentaCorriente getCuentaCorriente() {
	   return Cuenta;
       }
       
       public void setCuentaCorriente(CuentaCorriente Cuenta) {
    	   this.Cuenta = Cuenta;
       }
		
//Métodos
		
		public void cobrarSueldo(double cantidad) {
			this.sueldo=this.sueldo + cantidad;
		}
		
		public void sacarPasta(double cantidad) {
			if(sueldo>=cantidad) {
				this.sueldo = this.sueldo - cantidad;
				System.out.println("Perfecto, ya has sacado la pasta");
			}else {
				System.out.println("ERROR: el saldo no es suficiente");
			
				}
				
			}
		public void subirSueldo(double nuevoSueldo) {
			this.setSueldo(nuevoSueldo);
		}



		//To String

		@Override
		public String toString() {
			return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", DNI=" + DNI + ", sueldo=" + sueldo
					+ ", Cuenta=" + Cuenta + "]";
		}
		
		
      
		
}
