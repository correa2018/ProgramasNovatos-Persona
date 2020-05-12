/***********************************************************************
* Persona.java                                                         *
* Manuel Correa                                                        *
* 11/05/2020                                                           *
*                                                                      *
* Clase que describe los datos que identifica una Persona.             *
***********************************************************************/

public class Persona
{
	private  long cedula;
	private  String apellido;
	private  String nombre;

	//******************************************************************
	
	public Persona(Long cedula, String apellido, String nombre)
	{
		this.cedula = cedula;
		this.apellido = apellido;
		this.nombre = nombre;
	}
	
	//******************************************************************
	
	// métodos que permiten tomar los datos privados.
	
	public long getCedula()
	{
		return cedula;
	}	
	
	public String getApellido()
	{
		return apellido;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	
	//******************************************************************
	
	public void imprimirPersona()
	{
		System.out.println(apellido + "  " + nombre + "\n");
	}
	
	//******************************************************************
	
	public void imprimirListado()
	{
		final String LISTADO = "%-10d%1s%25s%1s%25s\n";
		
		System.out.printf("%-10d%1s%25s%1s%25s\n",cedula, "|",
				apellido, "|", 
				nombre);
	}
		
}
