package com.redq.latte.controller.api;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.redq.latte.service.FileService;

import io.swagger.annotations.Api;

@Api(value = "file")
@RestController
@RequestMapping(value = "/file")
public class FileController {
	
	@Autowired
	private FileService fileService;
	
	@RequestMapping(value = "/upload", method=RequestMethod.POST)
    public  String upload(@RequestParam("name") String name, @RequestParam("file") MultipartFile file){  
        if (!file.isEmpty()) {
            try {
                byte[] bytes = file.getBytes();  
                BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(new File(name + "-uploaded")));  
                stream.write(bytes);
                stream.close();
                
                fileService.uploadImg(name, bytes);
                return "You successfully uploaded " + name + " into " + name + "-uploaded !";  
            } catch (Exception e) {
                return "You failed to upload " + name + " => " + e.getMessage();  
            }  
        } else {
            return "You failed to upload " + name + " because the file was empty.";  
        }  
    }  
	
	@RequestMapping(value = "/fetch", method = RequestMethod.GET)
    public String fetch(String url) {
		try {
            fileService.fetchImg(url);
            return "You successfully uploaded " + url; 
        } catch (Exception e) {
            return "You failed to upload " + url + " => " + e.getMessage();  
        }  
    }
	
}
