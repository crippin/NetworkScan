package test;

import java.util.ArrayList;

import jcifs.smb.SmbFile;

public class NetworkScan {
	public NetworkScan() {

	}

	public void Scan(int n, final SmbFile[] f) {
		Thread[] ts = new Thread[n];
		for (int i = 0; i < n; i++) {
			final int fooi = i;
			ts[i] = new Thread(new Runnable() {
				public void run() {
					try {
						ArrayList<String> s = new ArrayList<>();

						/*
						 * System.out.println("------------------");
						 * System.out.println(f[fooi].getName());
						 */
						for (int j = 0; j < f[fooi].listFiles().length; j++) {
							s.add(f[fooi].listFiles()[j].getName());
							// System.out.println(f[fooi].listFiles()[j].getName());

						}
						Pc pc = new Pc(f[fooi].getName(), s);
						pc.printOut();
						pc.writeOut();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						// e.printStackTrace();
					}
				}
			});
			ts[i].start();

		}
	}
}