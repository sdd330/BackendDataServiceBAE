/*------------------------------------------------------------------------------
 * COPYRIGHT Ericsson 2014
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *----------------------------------------------------------------------------*/
package com.duapp.eripark.backend;

/**
 * Simple class containing News information
 */
public class NewsResult extends DataResult {

    private String heading;
    private String title;
    private String content;

    /**
     * Creates a new instance of <code>News</code>.
     * 
     * @param heading
     * @param title
     * @param content
     */
    public NewsResult(String heading, String title, String content) {
        this.heading = heading;
        this.title = title;
        this.content = content;
    }

    /**
     * @return Returns the heading.
     */
    public String getHeading() {
        return heading;
    }

    /**
     * @param heading The heading to set.
     */
    public void setHeading(String heading) {
        this.heading = heading;
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

    /**
     * @return Returns the content.
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content The content to set.
     */
    public void setContent(String content) {
        this.content = content;
    }

}
