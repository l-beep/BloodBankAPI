
package com.lovineoduor.bloodbankapi.com.lovineoduor.mybloodbankapi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
//import org.apache.commons.lang.builder.ToStringBuilder;

public class Record {

    @SerializedName("year")
    @Expose
    private String year;
    @SerializedName("blood_bank_center")
    @Expose
    private String bloodBankCenter;
    @SerializedName("unit_type")
    @Expose
    private String unitType;
    @SerializedName("units_count")
    @Expose
    private String unitsCount;
    @SerializedName("entry_id")
    @Expose
    private String entryId;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Record() {
    }

    /**
     * 
     * @param unitType
     * @param year
     * @param bloodBankCenter
     * @param unitsCount
     * @param entryId
     */
    public Record(String year, String bloodBankCenter, String unitType, String unitsCount, String entryId) {
        super();
        this.year = year;
        this.bloodBankCenter = bloodBankCenter;
        this.unitType = unitType;
        this.unitsCount = unitsCount;
        this.entryId = entryId;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getBloodBankCenter() {
        return bloodBankCenter;
    }

    public void setBloodBankCenter(String bloodBankCenter) {
        this.bloodBankCenter = bloodBankCenter;
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    public String getUnitsCount() {
        return unitsCount;
    }

    public void setUnitsCount(String unitsCount) {
        this.unitsCount = unitsCount;
    }

    public String getEntryId() {
        return entryId;
    }

    public void setEntryId(String entryId) {
        this.entryId = entryId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder().append("year", year).append("bloodBankCenter", bloodBankCenter).append("unitType", unitType).append("unitsCount", unitsCount).append("entryId", entryId).toString();
    }

}
