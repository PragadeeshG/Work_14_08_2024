package com.test1;

public class AToZPipelineRequests {
	private Integer repositoryCode;
	private String pipelineRequsetApproval1;
	private String pipelineRequestApprovalMessage1;
	private String pipelineRequsetApproval2;
	private String pipelineRequestApprova2Message2;
	private String pipelineRequsetApproval3;
	private String pipelineRequestApprovalMessage3;
	private String buildNumber;
	private String consumedArtifacts;
	private String publishedArtifacts;
	private String entityState;

	public AToZPipelineRequests() {

	}

	public AToZPipelineRequests(Integer repositoryCode, String pipelineRequsetApproval1,
			String pipelineRequestApprovalMessage1, String pipelineRequsetApproval2,
			String pipelineRequestApprova2Message2, String pipelineRequsetApproval3,
			String pipelineRequestApprovalMessage3, String buildNumber, String consumedArtifacts,
			String publishedArtifacts, String entityState) {
		super();
		this.repositoryCode = repositoryCode;
		this.pipelineRequsetApproval1 = pipelineRequsetApproval1;
		this.pipelineRequestApprovalMessage1 = pipelineRequestApprovalMessage1;
		this.pipelineRequsetApproval2 = pipelineRequsetApproval2;
		this.pipelineRequestApprova2Message2 = pipelineRequestApprova2Message2;
		this.pipelineRequsetApproval3 = pipelineRequsetApproval3;
		this.pipelineRequestApprovalMessage3 = pipelineRequestApprovalMessage3;
		this.buildNumber = buildNumber;
		this.consumedArtifacts = consumedArtifacts;
		this.publishedArtifacts = publishedArtifacts;
		this.entityState = entityState;
	}

	public Integer getRepositoryCode() {
		return repositoryCode;
	}

	public void setRepositoryCode(Integer repositoryCode) {
		this.repositoryCode = repositoryCode;
	}

	public String getPipelineRequsetApproval1() {
		return pipelineRequsetApproval1;
	}

	public void setPipelineRequsetApproval1(String pipelineRequsetApproval1) {
		this.pipelineRequsetApproval1 = pipelineRequsetApproval1;
	}

	public String getPipelineRequestApprovalMessage1() {
		return pipelineRequestApprovalMessage1;
	}

	public void setPipelineRequestApprovalMessage1(String pipelineRequestApprovalMessage1) {
		this.pipelineRequestApprovalMessage1 = pipelineRequestApprovalMessage1;
	}

	public String getPipelineRequsetApproval2() {
		return pipelineRequsetApproval2;
	}

	public void setPipelineRequsetApproval2(String pipelineRequsetApproval2) {
		this.pipelineRequsetApproval2 = pipelineRequsetApproval2;
	}

	public String getPipelineRequestApprova2Message2() {
		return pipelineRequestApprova2Message2;
	}

	public void setPipelineRequestApprova2Message2(String pipelineRequestApprova2Message2) {
		this.pipelineRequestApprova2Message2 = pipelineRequestApprova2Message2;
	}

	public String getPipelineRequsetApproval3() {
		return pipelineRequsetApproval3;
	}

	public void setPipelineRequsetApproval3(String pipelineRequsetApproval3) {
		this.pipelineRequsetApproval3 = pipelineRequsetApproval3;
	}

	public String getPipelineRequestApprovalMessage3() {
		return pipelineRequestApprovalMessage3;
	}

	public void setPipelineRequestApprovalMessage3(String pipelineRequestApprovalMessage3) {
		this.pipelineRequestApprovalMessage3 = pipelineRequestApprovalMessage3;
	}

	public String getBuildNumber() {
		return buildNumber;
	}

	public void setBuildNumber(String buildNumber) {
		this.buildNumber = buildNumber;
	}

	public String getConsumedArtifacts() {
		return consumedArtifacts;
	}

	public void setConsumedArtifacts(String consumedArtifacts) {
		this.consumedArtifacts = consumedArtifacts;
	}

	public String getPublishedArtifacts() {
		return publishedArtifacts;
	}

	public void setPublishedArtifacts(String publishedArtifacts) {
		this.publishedArtifacts = publishedArtifacts;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
