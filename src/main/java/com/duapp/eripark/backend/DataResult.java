package com.duapp.eripark.backend;

/**
 * Simple class containing data information
 */
public class DataResult {
    private Integer resultCode;
    private String resultMessage;

    /**
     * @return Returns the resultCode.
     */
    public Integer getResultCode() {
        return resultCode;
    }

    /**
     * @param resultCode The resultCode to set.
     */
    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    /**
     * @return Returns the resultMessage.
     */
    public String getResultMessage() {
        return resultMessage;
    }

    /**
     * @param resultMessage The resultMessage to set.
     */
    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

}
