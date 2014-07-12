package com.duapp.eripark.backend;

/**
 * News Title Entry information
 */
public class NewsTitleEntry {
    private String id;
    private String title;

    /**
     * Creates a new instance of <code>NewsTitleEntriesEntry</code>.
     * 
     * @param id
     * @param title
     */
    public NewsTitleEntry(String id, String title) {
        this.id = id;
        this.title = title;
    }

    /**
     * @return Returns the id.
     */
    public String getId() {
        return id;
    }

    /**
     * @param id The id to set.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return Returns the title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title The title to set.
     */
    public void setTitle(String title) {
        this.title = title;
    }

}
