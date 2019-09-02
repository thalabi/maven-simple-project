package com.kerneldc.msp;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	private void run() {
		MspService mspService = new MspService();
		System.out.println(mspService.isAvailable());
	}
}
