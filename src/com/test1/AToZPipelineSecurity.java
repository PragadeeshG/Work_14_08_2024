package com.test1;

public class AToZPipelineSecurity {
	private Integer id;
	private String variableGroupOwner;
	private String systemCode;
	private String appName;
	private Integer variableName;
	private boolean secretVariable;
	private boolean orgUpdateAvailable;
	private String adminPassword;
	private String devMode;
	private String recentRun;
	private String makerCheckerMode;
	private String taskGroup;
	private String deployGroups;
	private String entityState;

	public AToZPipelineSecurity() {

	}

	public AToZPipelineSecurity(Integer id, String variableGroupOwner, String systemCode, String appName,
			Integer variableName, boolean secretVariable, boolean orgUpdateAvailable, String adminPassword,
			String devMode, String recentRun, String makerCheckerMode, String taskGroup, String deployGroups,
			String entityState) {
		super();
		this.id = id;
		this.variableGroupOwner = variableGroupOwner;
		this.systemCode = systemCode;
		this.appName = appName;
		this.variableName = variableName;
		this.secretVariable = secretVariable;
		this.orgUpdateAvailable = orgUpdateAvailable;
		this.adminPassword = adminPassword;
		this.devMode = devMode;
		this.recentRun = recentRun;
		this.makerCheckerMode = makerCheckerMode;
		this.taskGroup = taskGroup;
		this.deployGroups = deployGroups;
		this.entityState = entityState;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVariableGroupOwner() {
		return variableGroupOwner;
	}

	public void setVariableGroupOwner(String variableGroupOwner) {
		this.variableGroupOwner = variableGroupOwner;
	}

	public String getSystemCode() {
		return systemCode;
	}

	public void setSystemCode(String systemCode) {
		this.systemCode = systemCode;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public Integer getVariableName() {
		return variableName;
	}

	public void setVariableName(Integer variableName) {
		this.variableName = variableName;
	}

	public boolean isSecretVariable() {
		return secretVariable;
	}

	public void setSecretVariable(boolean secretVariable) {
		this.secretVariable = secretVariable;
	}

	public boolean isOrgUpdateAvailable() {
		return orgUpdateAvailable;
	}

	public void setOrgUpdateAvailable(boolean orgUpdateAvailable) {
		this.orgUpdateAvailable = orgUpdateAvailable;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public String getDevMode() {
		return devMode;
	}

	public void setDevMode(String devMode) {
		this.devMode = devMode;
	}

	public String getRecentRun() {
		return recentRun;
	}

	public void setRecentRun(String recentRun) {
		this.recentRun = recentRun;
	}

	public String getMakerCheckerMode() {
		return makerCheckerMode;
	}

	public void setMakerCheckerMode(String makerCheckerMode) {
		this.makerCheckerMode = makerCheckerMode;
	}

	public String getTaskGroup() {
		return taskGroup;
	}

	public void setTaskGroup(String taskGroup) {
		this.taskGroup = taskGroup;
	}

	public String getDeployGroups() {
		return deployGroups;
	}

	public void setDeployGroups(String deployGroups) {
		this.deployGroups = deployGroups;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
