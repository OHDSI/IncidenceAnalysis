package org.ohdsi.cohortincidence;

public class BuilderOptions {
	public String sourceName;
	public String targetCohortTable;
	public String outcomeCohortTable;
	public String subgroupCohortTable;
	public String cdmSchema;
	public String resultsSchema;
	public String vocabularySchema;
	public Integer refId;
	public boolean useTempTables;
}
