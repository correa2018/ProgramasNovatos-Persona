/***********************************************************************
* ContraladorListadoDePersonas.java					     			   *
* Manuel Correa                                                        *
* 11/05/2020                                                           *
*                                                                      *
* Esta clase implementa la clase ListadoDepersonas                     *
***********************************************************************/

import java.util.Scanner;

public class ControladorListadoDePersonas
{
	public static void main(String[] args)
	{
		ListadoDePersonas listado = new ListadoDePersonas();
		
		Scanner stdIn = new Scanner(System.in);
		
		long cedula;
		String apellido;
		String nombre;
		
		int opcion;
		int busqueda;
		
		System.out.println("Creando un Listado de Personas con ArrayList");
		System.out.println();
		
		do
		{
			System.out.println("********* Menú Principal **************");
			System.out.println("1.- Ingresar una persana");
			System.out.println("2.- Buscar una persona");
			System.out.println("3.- Eliminar una persona");
			System.out.println("4.- Imprimir Listado");
			System.out.println("5.- Salir");
			System.out.print("Ingrese su opción: ");
			opcion = stdIn.nextInt();
			stdIn.nextLine();
			System.out.println();
			
			switch (opcion)
			{
				case 1: 
					System.out.print("Ingrese número de Cédula: ");
					cedula = stdIn.nextLong();
					stdIn.nextLine();
					
					if (listado.buscarPersona(cedula) == -1)
					{
						System.out.print("Ingrese el apellido: ");
						apellido = stdIn.nextLine();
					
						System.out.print("Ingrese el nombre: ");
						nombre = stdIn.nextLine();
					
						listado.addPersonas(cedula, apellido, nombre);
					}
					else
					{
						System.out.println("\nLa persona ya se encuentra registrada");
					}
					System.out.println();
					break;
				case 2: 
					if(listado.listadoVacio())
					{
						System.out.println("No existen personas registradas");
					}
					else
					{
						System.out.print("Ingrese el número de Cédula: ");
						cedula = stdIn.nextLong();
						stdIn.nextLine();
						
						busqueda = listado.buscarPersona(cedula);								
						
						if(busqueda == -1)
						{
							System.out.println("La persona no se encuentra registrada");
						}
						else
						{
							listado.imprimirPersona(busqueda);
						}
					}
					System.out.println();
					break;
				case 3:
					if (listado.listadoVacio())
					{
						System.out.println("No hay Personas registradas\n");
					}
					else
					{
						System.out.print("Ingrese número de Cédula: ");
						cedula = stdIn.nextLong();
						stdIn.nextLine();
						
						busqueda = listado.buscarPersona(cedula);
						
						if ( busqueda == -1)
						{
							System.out.println("\nLa persona no se encuentra registrada");
						}
						else
						{
							listado.eliminarPersona(busqueda);
							System.out.println("\nLa persona fue eliminada");
						}
					}
					System.out.println();
					break;
				case 4:
					if(listado.listadoVacio())
					{
						System.out.println("No hay Personas registradas\n");
					}
					else
					{
						listado.imprimirListado();
					}
					break;									
				case 5:
					System.out.println("Saliendo del programa");
					break;							
			}
			System.out.println();
		} while(opcion != 5);
	} //Fin del main
} //Fin de la clase ControladorListadoDePersonas.
			
