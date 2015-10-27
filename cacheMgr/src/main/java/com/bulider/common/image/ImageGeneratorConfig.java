package com.bulider.common.image;

import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 生成图片配制信息
 * User: lxd
 * Date: 11-2-16
 * Time: 上午10:20
 */
public class ImageGeneratorConfig implements Iterable<ImageGeneratorConfig.Size> {
	
	public static final String IMAGE_SPEC_NUM_SPLIT_CHAR = "X";
	public static final int DEFAULT_PICT_WIDTH = 90;
	public static final int DEFAULT_PICT_HEIGHT = 90;
	private boolean ignoreExists;

	public boolean isIgnoreExists() {
		return ignoreExists;
	}

	public static class Size{
		private int width;
		private int height;
		
		public Size(String specStr){
			Assert.isTrue(specStr.contains(IMAGE_SPEC_NUM_SPLIT_CHAR));
			String[] values = specStr.split(IMAGE_SPEC_NUM_SPLIT_CHAR);
			this.width = Integer.parseInt(values[0]);
			this.height = Integer.parseInt(values[1]);
		}

		public Size(int width, int height){
			this.width = width;
			this.height = height;
		}

		public int getWidth() {
			return width;
		}
		public int getHeight() {
			return height;
		}

		@Override
		public String toString(){
			return width + IMAGE_SPEC_NUM_SPLIT_CHAR + height;
		}
	}
	
    private List<Size> picSpecList = new ArrayList<Size>();

    public ImageGeneratorConfig(){
    	this(true);
    }

    public ImageGeneratorConfig(boolean ignoreExists,boolean isAddDefaultPict){
        this.ignoreExists = ignoreExists;
        if(isAddDefaultPict){
            this.addSpec(DEFAULT_PICT_WIDTH, DEFAULT_PICT_HEIGHT);
        }
    }
    
    public ImageGeneratorConfig(boolean ignoreExists){
    	this.ignoreExists = ignoreExists;
    	this.addSpec(DEFAULT_PICT_WIDTH, DEFAULT_PICT_HEIGHT);
    }

    public void addSpec(String specStr){
    	picSpecList.add(new Size(specStr));
    }

    public void addSpec(int width, int height){
    	picSpecList.add(new Size(width, height));
    }
    
	@Override
	public Iterator<Size> iterator() {
		return picSpecList.iterator();
	}
}
