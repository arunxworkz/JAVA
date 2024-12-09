package com.xworkx.physicsresearch.Repository;

import java.util.List;

import javax.persistence.*;
import com.xworkx.physicsresearch.entity.ResearchEntity;

public class ResearchRepoImpl implements ResearchRepo{

	@Override
	public boolean save(List<ResearchEntity> li) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xworkz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		try {
			
			
			et.begin();
			for(ResearchEntity entity: li) {
				em.persist(entity);
			}
			et.commit();
			
			
		}catch(Exception e) {
			if(et.isActive())
				et.rollback();
		}finally {
			em.close();
			emf.close();
		}
		return false;
	}

	@Override
	public boolean updfateQuery(int id, String newStatus) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xworkz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		try
		{
			et.begin();
			Query query = em.createNamedQuery("updateQuery");
			query.setParameter("status", newStatus);
			query.setParameter("id", id);
			query.executeUpdate();
			query.commit();
			
		}catch(Exception e) {
			if(et.isActive())
				et.rollback();
			e.printStackTrace();
		}finally {
			em.close();
			emf.close();
		}
		return false;
	}

}
