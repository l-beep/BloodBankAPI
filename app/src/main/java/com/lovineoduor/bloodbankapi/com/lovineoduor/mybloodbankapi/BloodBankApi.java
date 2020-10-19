
package com.lovineoduor.bloodbankapi.com.lovineoduor.mybloodbankapi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import retrofit2.Call;
//import org.apache.commons.lang.builder.ToStringBuilder;

public class BloodBankApi {

    @SerializedName("help")
    @Expose
    private String help;
    @SerializedName("success")
    @Expose
    private String success;
    @SerializedName("result")
    @Expose
    private String result;

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
    public BloodBankApi(String help, String success, String result) {
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

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("help", help).append("success", success).append("result", result).toString();
    }

    public Call<BloodBank> getdonate(String donate, String bloodbank) {
        return null;
    }

    public Call<BloodBank> getrequest(String request, String bloodbank) {
        return null;
    }
}
