package datastructure;

import databases.ConnectToSqlDB;
import jdk.internal.org.jline.reader.impl.LineReaderImpl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class UseArrayList {

	public static void main(String[] args){
		ArrayList<String> arrList = new ArrayList<String>();
	 	arrList.add("Akbar");
	 	arrList.add("Babara");
	 	arrList.add("Aurangzeb");
	 	arrList.add("Genghis");
	 	arrList.add("Mongol");
	 	arrList.add("Ragnar");


		arrList.add(2,"Rollo");
	 	arrList.remove(1);
		System.out.println(arrList);





	

	}

}
