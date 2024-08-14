package com.test1;

public class AToZPipelineComponents {
	private Integer runBy;
	private String timeStarted;
	private String timeElapsed;
	private String linkedArtifacts;
	private String stages;
	private boolean codeCoverageApplicable;
	private boolean artifactsUpload;
	private boolean scanApplicable;
	private String artifactLink;
	private String scanResultLink;
	private Integer releaseChecks;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public AToZPipelineComponents() {

	}

	public AToZPipelineComponents(Integer runBy, String timeStarted, String timeElapsed, String linkedArtifacts,
			String stages, boolean codeCoverageApplicable, boolean artifactsUpload, boolean scanApplicable,
			String artifactLink, String scanResultLink, Integer releaseChecks, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.runBy = runBy;
		this.timeStarted = timeStarted;
		this.timeElapsed = timeElapsed;
		this.linkedArtifacts = linkedArtifacts;
		this.stages = stages;
		this.codeCoverageApplicable = codeCoverageApplicable;
		this.artifactsUpload = artifactsUpload;
		this.scanApplicable = scanApplicable;
		this.artifactLink = artifactLink;
		this.scanResultLink = scanResultLink;
		this.releaseChecks = releaseChecks;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getRunBy() {
		return runBy;
	}

	public void setRunBy(Integer runBy) {
		this.runBy = runBy;
	}

	public String getTimeStarted() {
		return timeStarted;
	}

	public void setTimeStarted(String timeStarted) {
		this.timeStarted = timeStarted;
	}

	public String getTimeElapsed() {
		return timeElapsed;
	}

	public void setTimeElapsed(String timeElapsed) {
		this.timeElapsed = timeElapsed;
	}

	public String getLinkedArtifacts() {
		return linkedArtifacts;
	}

	public void setLinkedArtifacts(String linkedArtifacts) {
		this.linkedArtifacts = linkedArtifacts;
	}

	public String getStages() {
		return stages;
	}

	public void setStages(String stages) {
		this.stages = stages;
	}

	public boolean isCodeCoverageApplicable() {
		return codeCoverageApplicable;
	}

	public void setCodeCoverageApplicable(boolean codeCoverageApplicable) {
		this.codeCoverageApplicable = codeCoverageApplicable;
	}

	public boolean isArtifactsUpload() {
		return artifactsUpload;
	}

	public void setArtifactsUpload(boolean artifactsUpload) {
		this.artifactsUpload = artifactsUpload;
	}

	public boolean isScanApplicable() {
		return scanApplicable;
	}

	public void setScanApplicable(boolean scanApplicable) {
		this.scanApplicable = scanApplicable;
	}

	public String getArtifactLink() {
		return artifactLink;
	}

	public void setArtifactLink(String artifactLink) {
		this.artifactLink = artifactLink;
	}

	public String getScanResultLink() {
		return scanResultLink;
	}

	public void setScanResultLink(String scanResultLink) {
		this.scanResultLink = scanResultLink;
	}

	public Integer getReleaseChecks() {
		return releaseChecks;
	}

	public void setReleaseChecks(Integer releaseChecks) {
		this.releaseChecks = releaseChecks;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
