package com.teddy.designpattern.decorator;

import com.teddy.designpattern.decorator.abstraction.Decorator;

public class BufferedOut extends Decorator {
	// 기능의 확장
	
	public BufferedOut(FileOut delegate) {
		super(delegate);
	}

	@Override
	public void write(byte[] data) {
		byte[] bufferedData = buffering(data);
		super.doDelegate(bufferedData);
	}

	private byte[] buffering(byte[] data) {
		// TODO : do something..
		return data;
	}

}
