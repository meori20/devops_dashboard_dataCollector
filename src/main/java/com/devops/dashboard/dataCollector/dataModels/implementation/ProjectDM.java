package com.devops.dashboard.dataCollector.dataModels.implementation;

import java.util.List;

import com.devops.dashboard.dataCollector.dataModels.interfaces.IBuildDM;
import com.devops.dashboard.dataCollector.dataModels.interfaces.IProjectDM;

public class ProjectDM implements IProjectDM {

	private List<IBuildDM> buildList;
	private String projectName;
	
	@Override
	public List<IBuildDM> getBuildList() {
		return buildList;
	}

	@Override
	public void setBuildList(List<IBuildDM> buildList) {
		this.buildList = buildList;
	}

	@Override
	public String getProjectName() {
		return this.projectName;
	}

	@Override
	public void setProjectName(String projName) {
		this.projectName = projName;
	}


}