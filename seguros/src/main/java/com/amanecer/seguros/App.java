package com.amanecer.seguros;

import java.util.List;

import javax.persistence.EntityManager;

import com.amanecer.seguros.modelo.Seguro;
import com.amanecer.seguros.persistencia.Utilidades;

public class App
{
	static EntityManager em = null;
			
    public static void main( String[] args )
    {
    	try 
    	{
    		em = Utilidades.getEntityManagerFactory().createEntityManager();
    		Seguro seguro1= new Seguro();
    		List<Object[]> seguros = em.createQuery("select s from Seguro s").getResultList();
    		for(Object[] seguro: seguros)
    		{
    			System.out.println("Seguro: " + seguro.toString());
    		}

    	}
    	catch (Exception e){
    		System.out.println("Error al acceder a los datos");
    		e.printStackTrace();
    	}
    }

}
