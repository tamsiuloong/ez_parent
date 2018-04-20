package com.yaorange.jk.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadCtrl {

    @RequestMapping("/upload")
    public @ResponseBody
    String upload(@RequestParam("file")MultipartFile file){
        return "1";
    }
}
