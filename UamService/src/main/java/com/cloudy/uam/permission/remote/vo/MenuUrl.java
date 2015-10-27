package com.cloudy.uam.permission.remote.vo;

import java.io.Serializable;

public class MenuUrl implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    private String text; //资源名称
    private String url; //资源路径
    
    private String id;



    public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

	/** 
	 * @return id 
	 */
	public String getId() {
		return id;
	}

	/** 
	 * @param id 要设置的 id 
	 */
	public void setId(String id) {
		this.id = id;
	}

}
