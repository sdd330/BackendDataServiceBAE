package com.duapp.eripark.backend;

import java.util.List;

/**
 * Simple class containing Category Entries information
 */
public class CategoryEntriesResult extends DataResult {
    private List<CategoryEntry> categoryEntries;

    /**
     * @return Returns the categoryEntries.
     */
    public List<CategoryEntry> getCategoryEntries() {
        return categoryEntries;
    }

    /**
     * @param categoryEntries The categoryEntries to set.
     */
    public void setCategoryEntries(List<CategoryEntry> categoryEntries) {
        this.categoryEntries = categoryEntries;
    }
}
