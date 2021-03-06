package com.wolves.demo.service.impl.product;

import org.springframework.stereotype.Service;

import com.wolves.demo.fdfs.FastDFSUtils;
import com.wolves.demo.service.product.UploadService;

@Service("uploadService")
public class UploadServiceImpl implements UploadService{

	
	//上传图片
	public String uploadPic(byte[] pic ,String name,long size){
		return FastDFSUtils.uploadPic(pic, name, size);
	}
}
