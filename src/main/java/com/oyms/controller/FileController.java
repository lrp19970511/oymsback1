package com.oyms.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.oyms.dto.ApiDTO;
import com.oyms.provider.UCloudProvider;

@Controller
@CrossOrigin
public class FileController {

	@Autowired
	private UCloudProvider uCloudProvider;
	@Autowired
	private ApiDTO apiDTO;

	@RequestMapping("/file/upload")
	@ResponseBody
	public ApiDTO upload(HttpServletRequest request, @RequestParam("imgUpload") MultipartFile userImg) {
		try {
			String userImgUrl = uCloudProvider.upload(userImg.getInputStream(), userImg.getContentType(),
					userImg.getOriginalFilename());
			apiDTO.setIsSuccess(true);
			apiDTO.setMessage(userImgUrl);
			return apiDTO;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		apiDTO.setIsSuccess(false);
		apiDTO.setMessage(null);
		return apiDTO;
	}
}
