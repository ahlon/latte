package com.redq.latte.service;

public interface FileService {
	
	String uploadImg(String fileName, byte[] contents);
	
	String fetchImg(String url);

}
