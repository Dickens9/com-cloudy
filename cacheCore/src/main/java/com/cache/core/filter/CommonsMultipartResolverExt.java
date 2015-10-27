package com.cache.core.filter;

import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.multipart.MultipartException;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
public class CommonsMultipartResolverExt extends CommonsMultipartResolver {
    private String[] allowTypes;

    public MultipartHttpServletRequest resolveMultipart(final HttpServletRequest request) throws MultipartException {
        MultipartHttpServletRequest multipartRequest = super.resolveMultipart(request);
        Iterator<String> iter = multipartRequest.getFileNames();

        while (iter.hasNext()) {
            MultipartFile uploadFile = multipartRequest.getFile(iter.next());
            String fileName = uploadFile.getOriginalFilename();
            String fileType = fileName.substring(fileName.lastIndexOf('.')+1);
            if(!isAllow(fileType)){
                throw new RuntimeException("您上传的文件已被拒绝");
            }
        }
        return multipartRequest;
    }

    private boolean isAllow(String fileType){
        for (String type:allowTypes){
            if(StringUtils.isNotBlank(type) && StringUtils.equalsIgnoreCase(type, fileType)){
                return true;
            }
        }
        return false;
    }

    public void setAllowTypes(String types) {
        if(StringUtils.isNotBlank(types)){
            allowTypes = StringUtils.split(types, ";");
        }
    }

}
