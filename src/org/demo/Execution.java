package org.demo;

import java.io.IOException;

public class Execution {
public static void main(String[] args) throws IOException {
	HdfchomePage h = new HdfchomePage();
	h.setCustomerId("Ravi");
	h.setPAssword(111);
	h.getCustomerId();
	System.out.println("Work done by QA");
}
}
