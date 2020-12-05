package com.xworkz.LibraryUtil;

import com.xworkz.Library.Library;

public class LibraryUtil {
		public static void main(String[] args) {
			String [] sectionsByAuthors ={"Chethan baghat","Abdul kalam"};
			Library library = new Library("Gnanagangothri", sectionsByAuthors,"private");
			System.out.println(library.name + " "+ library.type);	
			for(String string: sectionsByAuthors)
			{
			System.out.println(string);
		}
			
	}
}
