package com.application.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes
@RequestMapping("/fileupload_controller")
public class FileuploadController {

	@Autowired
	 ServletContext context;

	 @RequestMapping(method = RequestMethod.POST)
	 public ModelAndView upload(HttpServletRequest request, HttpServletResponse response)
	   throws Exception {

	  boolean isMultipart = ServletFileUpload.isMultipartContent(request);
	 
	  System.out.println(isMultipart);
	  List fileNames = new ArrayList();
	  if (isMultipart) {
	   // Create a factory for disk-based file items
	   FileItemFactory factory = new DiskFileItemFactory();
	   System.out.println(1);
	   
	   // Create a new file upload handler
	   ServletFileUpload upload = new ServletFileUpload(factory);
	   System.out.println(2);
	   
	   try {
	    // Parse the request
	    List items = upload.parseRequest(request);
	    Iterator iterator = items.iterator();
	    System.out.println(3);
	    while (iterator.hasNext()) {
	     FileItem item = (FileItem) iterator.next();
	     System.out.println(4);
	     if (!item.isFormField() && !item.getName().equals("")) {
	      String fileName = item.getName();
	      System.out.println(fileName);
	      System.out.println(5);
	      String root = context.getRealPath("/");
	      File path = new File(root + "/uploads");
	      if (!path.exists()) {
	       boolean status = path.mkdirs();
	      }
	      	System.out.println(path);
	      File uploadedFile = new File(path + "/" + fileName);
	      fileNames.add(fileName);
	      
	      System.out.println("File Path:-"
	        + uploadedFile.getAbsolutePath());

	      item.write(uploadedFile);
	     }
	     System.out.println("in try");
	    }
	   } catch (FileUploadException e) {
	    System.out.println("FileUploadException:- " + e.getMessage());
	   } catch (Exception e) {
	    System.out.println("Exception:- " + e.getMessage());
	   }
	  }

	  ModelAndView modelAndView = new ModelAndView("fileuploadsuccess");
	  modelAndView.addObject("files", fileNames);
	  return modelAndView;

	 }
	
	
}
