package test;

import jcifs.smb.SmbFile;


public class Main {

	public static void main(String[] args) {
		SmbFile[] files = null;

		try {
			SmbFile smbFile = new SmbFile("smb://WORKGROUP/");
			files = smbFile.listFiles();
			NetworkScan ns = new NetworkScan();
			ns.Scan(files.length, files);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
