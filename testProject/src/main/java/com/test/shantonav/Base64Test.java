package com.test.shantonav;

import org.apache.commons.codec.binary.Base64;

public class Base64Test {
	public String getBase64EncodedString(byte[] binaryData){
		System.out.println("Is string Base64 ? "+Base64.isBase64(binaryData));
		return Base64.encodeBase64String(binaryData);
	}
}
