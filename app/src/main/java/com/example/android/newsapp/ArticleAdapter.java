package com.example.android.newsapp;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * An ArticleAdapter knows how to create a list item layout for each earthquake
 * in the data source (a list of Article objects).
 *
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */

public class ArticleAdapter extends ArrayAdapter<Article> {

    /**
     * Constructs a new ArticleAdapter
     *
     * @param context of the app
     * @param articles is the list of articles, which is the data source of the adapter
     */
    public ArticleAdapter(Context context, List<Article> articles) {
        super(context, 0, articles);
    }

    /**
     * Returns a list item view that displays information about the article at the given position
     * in the list of articles.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.article_list_item, parent, false);
        }

        // Find the earthquake at the given position in the list of earthquakes
        Article currentArticle = getItem(position);


        TextView sectionNameView = (TextView) listItemView.findViewById(R.id.section_name);
        sectionNameView.setText(currentArticle.getSectionName());

        TextView webTitleView = (TextView) listItemView.findViewById(R.id.web_title);
        webTitleView.setText(currentArticle.getWebTitle());


        TextView publicationDateView = (TextView) listItemView.findViewById(R.id.publication_date);
        publicationDateView.setText(currentArticle.getPublicationDate());

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }
}