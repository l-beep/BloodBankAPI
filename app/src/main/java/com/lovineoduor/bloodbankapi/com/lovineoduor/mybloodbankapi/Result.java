
package com.lovineoduor.bloodbankapi.com.lovineoduor.mybloodbankapi;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Result {

    @SerializedName("fields")
    @Expose
    private List<Field> fields = null;
    @SerializedName("resource_id")
    @Expose
    private List<String> resourceId = null;
    @SerializedName("limit")
    @Expose
    private Integer limit;
    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("records")
    @Expose
    private List<Record> records = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Result() {
    }

    /**
     * 
     * @param resourceId
     * @param total
     * @param records
     * @param limit
     * @param fields
     */
    public Result(List<Field> fields, List<String> resourceId, Integer limit, Integer total, List<Record> records) {
        super();
        this.fields = fields;
        this.resourceId = resourceId;
        this.limit = limit;
        this.total = total;
        this.records = records;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    public List<String> getResourceId() {
        return resourceId;
    }

    public void setResourceId(List<String> resourceId) {
        this.resourceId = resourceId;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("fields", fields).append("resourceId", resourceId).append("limit", limit).append("total", total).append("records", records).toString();
    }

}
