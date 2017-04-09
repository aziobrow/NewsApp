package com.example.android.newsapp;

/**
 * Created by teacher on 4/4/17.
 */

public class Article {

    /** Category of the article */
    private String mSectionName;

    /** Title of the article */
    private String mWebTitle;

    /** Date article was published */
    private String mPublicationDate;

    /** Website URL of the article */
    private String mUrl;

    /**
     * Constructs a new Article object.
     *
     * @param sectionName is the news category of the article
     * @param webTitle is the name of the article
     * @param publicationDate is the date the article was published
     * @param url is the website URL to find more details about the article
     */
    public Article(String sectionName, String webTitle, String publicationDate, String url) {
        mSectionName = sectionName;
        mWebTitle = webTitle;
        mPublicationDate = publicationDate;
        mUrl = url;
    }

    public String getSectionName() {
        return mSectionName;
    }

    public String getWebTitle() {
        return mWebTitle;
    }

    public String getPublicationDate() {
        return mPublicationDate;
    }

    public String getUrl() {
        return mUrl;
    }
}
