package com.springml.salesforce.wave.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class JobInfo implements Serializable {
    private static final long serialVersionUID = 2403943099992427787L;

    @JsonIgnore
    private String contentType;
    @JsonIgnore
    private String object;
    @JsonIgnore
    private String operation;
    @JsonIgnore
    private String apiVersion;
    // dont ignore
    private String concurrencyMode;
    @JsonIgnore
    private String createdById;
    @JsonIgnore
    private String createdDate;
    @JsonIgnore
    private String externalIdFieldName;
    @JsonIgnore
    private String fastPathEnabled;
    @JsonIgnore
    private String numberBatchesCompleted;
    @JsonIgnore
    private String numberBatchesFailed;
    @JsonIgnore
    private String numberBatchesInProgress;
    @JsonIgnore
    private String numberBatchesQueued;
    @JsonIgnore
    private String numberBatchesTotal;
    @JsonIgnore
    private String numberRecordsFailed;
    @JsonIgnore
    private String numberRecordsProcessed;
    @JsonIgnore
    private String numberRetries;
    @JsonIgnore
    private String state;
    @JsonIgnore
    private String systemModstamp;
    @JsonIgnore
    private String totalProcessingTime;
    @JsonIgnore
    private String id;

    public JobInfo(String contentType, String object, String operation) {
        this.contentType = contentType;
        this.object = object;
        this.operation = operation;
    }

    public JobInfo(String state) {
        this.state = state;
    }

    // For Jackson
    public JobInfo() {}

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getConcurrencyMode() {
        return concurrencyMode;
    }

    public void setConcurrencyMode(String concurrencyMode) {
        this.concurrencyMode = concurrencyMode;
    }

    public String getCreatedById() {
        return createdById;
    }

    public void setCreatedById(String createdById) {
        this.createdById = createdById;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getExternalIdFieldName() {
        return externalIdFieldName;
    }

    public void setExternalIdFieldName(String externalIdFieldName) {
        this.externalIdFieldName = externalIdFieldName;
    }

    public String getFastPathEnabled() {
        return fastPathEnabled;
    }

    public void setFastPathEnabled(String fastPathEnabled) {
        this.fastPathEnabled = fastPathEnabled;
    }

    public String getNumberBatchesCompleted() {
        return numberBatchesCompleted;
    }

    public void setNumberBatchesCompleted(String numberBatchesCompleted) {
        this.numberBatchesCompleted = numberBatchesCompleted;
    }

    public String getNumberBatchesFailed() {
        return numberBatchesFailed;
    }

    public void setNumberBatchesFailed(String numberBatchesFailed) {
        this.numberBatchesFailed = numberBatchesFailed;
    }

    public String getNumberBatchesInProgress() {
        return numberBatchesInProgress;
    }

    public void setNumberBatchesInProgress(String numberBatchesInProgress) {
        this.numberBatchesInProgress = numberBatchesInProgress;
    }

    public String getNumberBatchesQueued() {
        return numberBatchesQueued;
    }

    public void setNumberBatchesQueued(String numberBatchesQueued) {
        this.numberBatchesQueued = numberBatchesQueued;
    }

    public String getNumberBatchesTotal() {
        return numberBatchesTotal;
    }

    public void setNumberBatchesTotal(String numberBatchesTotal) {
        this.numberBatchesTotal = numberBatchesTotal;
    }

    public String getNumberRecordsFailed() {
        return numberRecordsFailed;
    }

    public void setNumberRecordsFailed(String numberRecordsFailed) {
        this.numberRecordsFailed = numberRecordsFailed;
    }

    public String getNumberRecordsProcessed() {
        return numberRecordsProcessed;
    }

    public void setNumberRecordsProcessed(String numberRecordsProcessed) {
        this.numberRecordsProcessed = numberRecordsProcessed;
    }

    public String getNumberRetries() {
        return numberRetries;
    }

    public void setNumberRetries(String numberRetries) {
        this.numberRetries = numberRetries;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getSystemModstamp() {
        return systemModstamp;
    }

    public void setSystemModstamp(String systemModstamp) {
        this.systemModstamp = systemModstamp;
    }

    public String getTotalProcessingTime() {
        return totalProcessingTime;
    }

    public void setTotalProcessingTime(String totalProcessingTime) {
        this.totalProcessingTime = totalProcessingTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
