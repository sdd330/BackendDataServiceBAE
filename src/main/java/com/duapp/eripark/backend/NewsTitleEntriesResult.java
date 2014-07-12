package com.duapp.eripark.backend;

import java.util.List;

/**
 * Simple class containing News Title Entries information
 */
public class NewsTitleEntriesResult extends DataResult {
    private List<NewsTitleEntry> newsTitleEntries;

    /**
     * @return Returns the newsTitleEntries.
     */
    public List<NewsTitleEntry> getNewsTitleEntries() {
        return newsTitleEntries;
    }

    /**
     * @param newsTitleEntries The newsTitleEntries to set.
     */
    public void setNewsTitleEntries(List<NewsTitleEntry> newsTitleEntries) {
        this.newsTitleEntries = newsTitleEntries;
    }
}
