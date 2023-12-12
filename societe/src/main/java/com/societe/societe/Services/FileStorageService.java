package com.societe.societe.Services;

 

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface FileStorageService {

    public void init();
    public void save(MultipartFile file);
    public Resource load(String filename);
 }