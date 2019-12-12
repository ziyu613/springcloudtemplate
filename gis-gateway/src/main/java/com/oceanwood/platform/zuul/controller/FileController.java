package com.oceanwood.platform.zuul.controller;

import com.oceanwood.platform.zuul.utils.ResponseData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;

@RestController
@RequestMapping("/rest/filehandler")
public class FileController {
	
	@RequestMapping(value="/upload", method = RequestMethod.POST)
    public ResponseData uploadImg(@RequestParam("file") MultipartFile file,
                                  HttpServletRequest request) {
        String contentType = file.getContentType();
        String fileName = file.getOriginalFilename();
        System.out.println("fileName-->" + fileName);
        System.out.println("getContentType-->" + contentType);
        String filePath = "/Users/TianF/Downloads/vue-devtools-master/";
        try {
            uploadFile(file.getBytes(), filePath, fileName);
        } catch (Exception e) {
        	e.printStackTrace();
        }
        return ResponseData.ok("success");
    }
	
	public static void uploadFile(byte[] file, String filePath, String fileName) throws Exception { 
        File targetFile = new File(filePath);  
        if(!targetFile.exists()){    
            targetFile.mkdirs();    
        }       
        FileOutputStream out = new FileOutputStream(filePath+fileName);
        out.write(file);
        out.flush();
        out.close();
    }
	
}
