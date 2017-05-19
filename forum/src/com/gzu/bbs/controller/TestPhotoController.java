package com.gzu.bbs.controller;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.gzu.bbs.util.Global;
@Controller
public class TestPhotoController {
	@RequestMapping(value="/photo")
	public String editItemsSubmit(
			Model model,
			HttpServletRequest request,
			MultipartFile pictureFile//接收商品图片
			) throws Exception {
		String newFile;
		//原始名称
		/*String originalFilename = pictureFile.getOriginalFilename();
		//上传图片
		if(pictureFile!=null && originalFilename!=null && originalFilename.length()>0){
			
			//存储图片的物理路径
			String pic_path = "D:\\develop\\upload\\temp\\";
			//String pic_path1="D:"+File.separator+"develop"+File.separator+"upload"+File.separator+"temp"+File.separator;
			//新的图片名称
			String newFileName = UUID.randomUUID() + originalFilename.substring(originalFilename.lastIndexOf("."));
			//新图片
			File newFile = new File(pic_path+newFileName);
			
			//将内存中的数据写入磁盘
			pictureFile.transferTo(newFile);
			
			//将新图片名称写到itemsCustom中
			//itemsCustom.setPic(newFileName);
			
		}*/
		newFile=Global.upload(pictureFile);
		
	 return "test";
	}

}