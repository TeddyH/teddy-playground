package com.teddy.designpattern.decorator;

import com.teddy.designpattern.decorator.abstraction.Decorator;

public class EncryptionOut extends Decorator {
	// 기능의 확장
	
	public EncryptionOut(FileOut delegate) {
		super(delegate);
	}

	@Override
	public void write(byte[] data) {
		byte[] encryptedData = encrypt(data);
		super.doDelegate(encryptedData);
	}
	
	private byte[] encrypt(byte[] data) {
		// TODO : do something...
		return data;
	}

}
