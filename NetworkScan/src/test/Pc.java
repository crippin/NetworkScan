package test;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import jcifs.smb.SmbFile;

public class Pc {
	private String name;
	private ArrayList<String> mappa;

	// private SmbFile[] pcs;
	public Pc(String name, ArrayList mappa) {
		setName(name);
		setMaps(mappa);
	}

	public void printOut() {
		System.out.println("----------");
		System.out.println(name);
		System.out.println("Maps:");
		for (String s : mappa) {
			System.out.println(s);
		}
	}
	public void writeOut() throws FileNotFoundException, UnsupportedEncodingException{
		PrintWriter writer = new PrintWriter("data","UTF-8");
		writer.println("--------------");
		writer.println(name);
		for(String s: mappa){
			writer.println(s);
		}
		writer.close();
	}

	public String getName() {
		return name;
	}

	public ArrayList<String> getMaps() {
		return mappa;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMaps(ArrayList<String> maps) {
		this.mappa = maps;
	}
}
