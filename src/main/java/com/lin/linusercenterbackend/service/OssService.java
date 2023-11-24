package com.lin.linusercenterbackend.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author lin
 */
public interface OssService {
    /**
     * 上传头像到OSS
     *
     * @param file
     * @return
     */
    String uploadFileAvatar(MultipartFile file);

}
