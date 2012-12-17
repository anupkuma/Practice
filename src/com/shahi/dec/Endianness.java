package com.shahi.dec;

import java.nio.ByteOrder;

public class Endianness {
	public static void main(String[] args) {
		
		// ByteOrder constant denoting big-endian byte order.
		// nativeOrder()Retrieves the native byte order of the underlying platform.
		if (ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN)) {
			  System.out.println("Big-endian");
			} else {
			  System.out.println("Little-endian");
			}
	}
}
