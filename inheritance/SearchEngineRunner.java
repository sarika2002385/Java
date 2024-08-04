package com.search.SearchEngine;
import com.search.searchengineapplication.Google;
import com.search.searchengineapplication.Meshoo;
import com.search.searchengineapplication.Myntra;
import com.search.searchengineapplication.SearchEngine;
import com.search.searchengineapplication.Yahoo;

public class SearchEngineRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Yahoo yahoo=new Yahoo();
		Myntra myntra=new Myntra();
		Google google=new Google();
		Meshoo mesho=new Meshoo();
		
		System.out.println(google.display());
        System.out.println();
        System.out.println(myntra.display());
        System.out.println();
        System.out.println(yahoo.display());
        System.out.println();
        System.out.println(mesho.display());
        
	}

}
