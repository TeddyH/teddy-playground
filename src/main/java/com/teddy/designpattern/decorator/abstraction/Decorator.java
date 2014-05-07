package com.teddy.designpattern.decorator.abstraction;

import com.teddy.designpattern.decorator.FileOut;

public abstract class Decorator implements FileOut {
	
	private FileOut delegate;	// 위임대상
	public Decorator(FileOut delegate) {
		this.delegate = delegate;
	}

	protected void doDelegate(byte[] data) {
		delegate.write(data);	// delegate에 쓰기 위임
	}
	
}
