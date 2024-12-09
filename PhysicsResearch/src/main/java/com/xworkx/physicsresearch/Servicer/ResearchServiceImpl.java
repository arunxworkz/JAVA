package com.xworkx.physicsresearch.Servicer;

import java.util.List;

import com.xworkx.physicsresearch.Repository.ResearchRepo;
import com.xworkx.physicsresearch.Repository.ResearchRepoImpl;
import com.xworkx.physicsresearch.entity.ResearchEntity;

public class ResearchServiceImpl implements ResearchService{

	@Override
	public boolean save(List<ResearchEntity> li) {
		
		System.out.println(li);
		
		ResearchRepo repo = new ResearchRepoImpl();
		repo.save(li);
		
		return false;
	}


	@Override
	public boolean updateQuery(int is, String sttaus) {
		
		return false;
	}

}
