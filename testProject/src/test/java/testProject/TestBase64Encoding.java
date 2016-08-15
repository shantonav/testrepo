package testProject;

import static org.junit.Assert.*;

import org.junit.Test;

import com.test.shantonav.Base64Test;

public class TestBase64Encoding {

	@Test
	public void testBase64Encoding() {
		Base64Test subject = new Base64Test();
		String cavv = "AAABAxFpJwAABBADNmknEMCoNh+=";
		System.out.println(cavv.getBytes());
		System.out.println(subject.getBase64EncodedString(cavv.getBytes()));
		assertNotNull(subject.getBase64EncodedString(cavv.getBytes()));
	}

}
