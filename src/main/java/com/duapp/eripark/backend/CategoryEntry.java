package com.duapp.eripark.backend;

/**
 * Category Entry information
 */
public class CategoryEntry {
    private String id;
    private String name;

    /**
     * Creates a new instance of <code>CategoryEntry</code>.
     * 
     * @param id
     * @param name
     */
    public CategoryEntry(String id, String name) {
        this.id = id;
        this.name = name;
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
     * @return Returns the name.
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

}
