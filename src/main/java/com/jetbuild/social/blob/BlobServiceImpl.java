package com.jetbuild.social.blob;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("blob-service")
public class BlobServiceImpl implements BlobService {
    @Autowired
    private BlobDAO blobDAO;
}
