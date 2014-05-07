package com.teddy.designpattern.decorator;

import com.teddy.designpattern.decorator.abstraction.Decorator;

public class ZipOut extends Decorator {
	// 기능의 확장
	
	public ZipOut(FileOut delegate) {
		super(delegate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void write(byte[] data) {
		byte[] zipedData = zip(data);
		super.doDelegate(zipedData);
	}

	private byte[] zip(byte[] data) {
		// do something..
		return data;
	}
}
