/***********************************************************************
* ListadoDePersonas.java											   *
* Manuel Correa                                                        *
* 11/05/2020                                                           *
*                                                                      *
* Esta clase implementa un Listado de personas.                        *
***********************************************************************/

import java.util.Scanner;
import java.util.ArrayList;

public class ListadoDePersonas
{
	ArrayList<Persona> listado = new ArrayList<Persona>();
	
	//******************************************************************
	
	public void addPersonas(Long cedula, String apellido, String nombre)
	{
		int indice = posicionDeInsertar(cedula);
		
		if (indice == -1)
		{
			listado.add(new Persona(cedula, apellido, nombre));
		}
		else
		{
			listado.add(indice, new Persona(cedula, apellido, nombre));
		}
	}
	
	//******************************************************************
	
	public void eliminarPersona(int indice)
	{
		listado.remove(indice);
	}
	
	//******************************************************************
	
	public int buscarPersona(long cedula)
	{
		int i=0;
		for(Persona persona : listado)
		{
			if (persona.getCedula() == cedula)
			{
				return i;
			}
			i++;
		}
		return -1;
	}
	
	//******************************************************************
	
	private int posicionDeInsertar(long cedula)
	{	
		
		if (listado.size() == 0) return 0;
		
		int i=0;		
		for(Persona persona : listado)
		{
			if (cedula < persona.getCedula()) return i;
			i++;
		}		
		return -1;
	}
		
	//******************************************************************
		
	
	public void imprimirListado()
	{
		final String ENCABEZADO = "%-10s%1s%25s%1s%25s\n";
		System.out.println("\n\n******************** Listado de Personas" +
			" *********************\n");
		System.out.printf(ENCABEZADO, "Cédula", "|", "Apellido", "|", "Nombre");
		System.out.printf(ENCABEZADO, "----------","|", "-------------------------","|",
			"-------------------------");
		
		for(Persona persona : listado)
		{
			persona.imprimirListado();
		}
	}
	
	//******************************************************************
	
	public void imprimirPersona(int i)
	{
		
		listado.get(i).imprimirPersona();
	}
	
	//******************************************************************
	
	public boolean listadoVacio()
	{
		if (listado.size() == 0) return true;
		return false;
	}
}
	
