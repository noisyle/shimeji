package com.wishes.update;

import java.util.List;

/**
 * @Author:郑龙
 * @Date:2018-11-08 11:55
 * @Description:针对下载指示文件进行解析并下载文件
 */
public class DataAnalysis {
    /**
     * 版本
     */
    private String version;
    /**
     * 更新信息
     */
    private String message;
    /**
     * 下载地址
     */
    private String url;

    /**
     * 更新模式
     * children:仅资源文件
     * main:仅主程序
     * both:全部都有
     */
    private String updateType;

    /**
     * 需要更新的子节点
     */
    private List<Node> nodeList;

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUpdateType() {
		return updateType;
	}

	public void setUpdateType(String updateType) {
		this.updateType = updateType;
	}

	public List<Node> getNodeList() {
		return nodeList;
	}

	public void setNodeList(List<Node> nodeList) {
		this.nodeList = nodeList;
	}
    
}
