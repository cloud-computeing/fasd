package com.gzu.bbs.util;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

public class Global {
	// 获取用户登录id
	public static String getUserId(HttpServletRequest request) {
		return (String) request.getSession().getAttribute("userid");
	}

	// 获取用户名字
	public static String getUserName(HttpServletRequest request) {
		return (String) request.getSession().getAttribute("userName");
	}

	// 上传图片
	public static String upload(MultipartFile pictureFile) {
		String newFileName="";
		String originalFilename = pictureFile.getOriginalFilename();
		// 上传图片
		if (pictureFile != null && originalFilename != null
				&& originalFilename.length() > 0) {

			// 存储图片的物理路径
			String pic_path = "D:\\develop\\upload\\temp\\";
			// String
			// pic_path1="D:"+File.separator+"develop"+File.separator+"upload"+File.separator+"temp"+File.separator;
			// 新的图片名称
			newFileName = UUID.randomUUID()
					+ originalFilename.substring(originalFilename
							.lastIndexOf("."));
			// 新图片
			File newFile = new File(pic_path + newFileName);

			// 将内存中的数据写入磁盘
			try {
				pictureFile.transferTo(newFile);
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return newFileName;
	}
}
