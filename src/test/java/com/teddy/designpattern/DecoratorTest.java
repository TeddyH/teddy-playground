package com.teddy.designpattern;

import org.junit.Before;
import org.junit.Test;

import com.teddy.designpattern.decorator.EncryptionOut;
import com.teddy.designpattern.decorator.FileOut;
import com.teddy.designpattern.decorator.FileOutImpl;
import com.teddy.designpattern.decorator.ZipOut;

/**
 * @author Teddy
 *
 */
public class DecoratorTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testDecoratorEncryption() {
		
		byte[] data = null;
		
		FileOut delegate = new FileOutImpl();
		FileOut fileOut = new EncryptionOut(delegate);
		fileOut.write(data);
	}
	
	@Test
	public void testDecoratorZipAndEncryption() {
		
		byte[] data = null;
		
		FileOut delegate = new FileOutImpl();
		FileOut fileOut = new EncryptionOut(new ZipOut(delegate));
		fileOut.write(data);
	}

	// 버퍼 -> 암호화 -> 압축 -> 파일쓰기
	// FileOut fileOut = new BufferedOut(new EncryptionOut(new ZipOut(delegate));
	// 암호화 -> 압축 -> 버퍼 -> 파일쓰기
	// FileOut fileOut = new EncryptionOut(new ZipOut(delegate));
}
