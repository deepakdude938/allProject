package TestCase;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.List;

import com.opencsv.CSVReader;

public class CSVHandling {
	public static void main(String[] args) throws IOException {
		String path="D:\\Assignments\\POI2.csv";
		Reader read=new FileReader(path);
		CSVReader csv=new CSVReader(read);
		List<String []> list=csv.readAll();
	//	System.out.println(list);
		int size=list.size();
		Iterator<String[]> itr=list.iterator();
		String []s=new String[size];
		System.out.println(size);
		while(itr.hasNext()) {
			 s=itr.next();
		//	System.out.println(itr.next());
		}
		for (int i = 0; i < s.length; i++) {
			
			 System.out.println(s[i]); 
		}
	}

}
