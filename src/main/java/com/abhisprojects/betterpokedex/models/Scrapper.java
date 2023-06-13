package com.abhisprojects.betterpokedex.models;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Scrapper {
    
    public static void main(String[] args) {
        final String url = "https://bulbapedia.bulbagarden.net/wiki/List_of_moves";
        try{
            final Document doc = Jsoup.connect(url).get();
            Element movesList = doc.select("tbody").first().select("tr").first().select("td").first();
            movesList = movesList.select("table").first().select("tbody").first();
            Element move = movesList.select("tr").last();
            String moveText = move.text();
            System.out.println(moveText);
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
 