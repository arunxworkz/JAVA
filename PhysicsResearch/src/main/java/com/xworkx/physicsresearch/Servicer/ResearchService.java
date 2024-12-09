package com.xworkx.physicsresearch.Servicer;

import java.util.List;

import com.xworkx.physicsresearch.entity.ResearchEntity;

public interface ResearchService {
	boolean save(List<ResearchEntity> li);
	boolean updateQuery(int is, String sttaus);
}
