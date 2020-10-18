
package com.lovineoduor.bloodbankapi.com.lovineoduor.mybloodbankapi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class BloodBankApi {

    @SerializedName("help")
    @Expose
    private String help;
    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("result")
    @Expose
    private Result result;

    /**
     * No args constructor for use in serialization
     * 
     */
    public BloodBankApi() {
    }

    /**
     * 
     * @param result
     * @param help
     * @param success
     */
    public BloodBankApi(String help, Boolean success, Result result) {
        super();
        this.help = help;
        this.success = success;
        this.result = result;
    }

    public String getHelp() {
        return help;
    }

    public void setHelp(String help) {
        this.help = help;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("help", help).append("success", success).append("result", result).toString();
    }

}
