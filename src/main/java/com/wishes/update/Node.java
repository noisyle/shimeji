package com.wishes.update;

/**
 * @Author:郑龙
 * @Date:2018-11-09 10:08
 * @Description:更新时子文件节点
 */
public class Node {
    /**
     * 文件名
     */
    private String name;
    
    /**
     * 下载地址
     */
    private String downLoadURL;

    /**
     * 部署地址
     */
    private String deployPath;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDownLoadURL() {
		return downLoadURL;
	}

	public void setDownLoadURL(String downLoadURL) {
		this.downLoadURL = downLoadURL;
	}

	public String getDeployPath() {
		return deployPath;
	}

	public void setDeployPath(String deployPath) {
		this.deployPath = deployPath;
	}
    
}
