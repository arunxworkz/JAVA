package com.xworkx.physicsresearch.Repository;

import java.util.List;

import com.xworkx.physicsresearch.entity.ResearchEntity;

public interface ResearchRepo {
	boolean save(List<ResearchEntity> li);
	boolean updfateQuery(int id, String status);
}
