package com.amanecer.seguros.persistencia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.amanecer.seguros.modelo.Seguro;

public class SeguroDAOImpl extends GenericDAOImpl<Seguro,Integer> implements SeguroDAO     
{
	public List<Object[]> getNifNombre()
	{
		EntityManager em= Utilidades.getEntityManagerFactory().createEntityManager();
		TypedQuery<Object[]> q= em.createQuery("select s.nif, s.nombre from Seguros", 
				Object[].class);
		
		return q.getResultList();
	}
	public String nifPorNombre(String nombre, String ape1, String ape2)
	{
		EntityManager em= Utilidades.getEntityManagerFactory().createEntityManager();
		TypedQuery<String> q= em.createQuery(
				"select s.nif, s.nombre from Seguro s", 
				String.class);
		
		return q.getSingleResult();
	}
	
	public List<Object[]> getAllNifNombre()
	{
		EntityManager em= Utilidades.getEntityManagerFactory().createEntityManager();
		TypedQuery<Object[]> q = em.createQuery("select s.nif, s.nombre from "
				+ "Seguro s", Object[].class);
		
		return q.getResultList();
	}
}
