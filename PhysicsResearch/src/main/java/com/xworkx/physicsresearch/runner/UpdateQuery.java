package com.xworkx.physicsresearch.runner;

import com.xworkx.physicsresearch.Servicer.ResearchService;
import com.xworkx.physicsresearch.Servicer.ResearchServiceImpl;

public class UpdateQuery {

	public static void main(String[] args) {
		

		   ResearchService service = new ResearchServiceImpl();
		   boolean isUpdated = service.updateQuery(1, "Completed");
	}

}
