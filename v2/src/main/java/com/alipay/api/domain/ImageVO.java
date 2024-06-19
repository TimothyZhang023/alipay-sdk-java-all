package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 图片vo
 *
 * @author auto create
 * @since 1.0, 2024-02-29 20:12:50
 */
public class ImageVO extends AlipayObject {

	private static final long serialVersionUID = 8553434926445654364L;

	/**
	 * 创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 图文件名
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 图归属目录id
	 */
	@ApiField("image_directory_id")
	private String imageDirectoryId;

	/**
	 * 图资源id
	 */
	@ApiField("image_id")
	private String imageId;

	/**
	 * 图索引id
	 */
	@ApiField("image_index_id")
	private String imageIndexId;

	/**
	 * 图片链接
	 */
	@ApiField("image_url")
	private String imageUrl;

	/**
	 * 更新时间
	 */
	@ApiField("modify_time")
	private Date modifyTime;

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getImageDirectoryId() {
		return this.imageDirectoryId;
	}
	public void setImageDirectoryId(String imageDirectoryId) {
		this.imageDirectoryId = imageDirectoryId;
	}

	public String getImageId() {
		return this.imageId;
	}
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public String getImageIndexId() {
		return this.imageIndexId;
	}
	public void setImageIndexId(String imageIndexId) {
		this.imageIndexId = imageIndexId;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Date getModifyTime() {
		return this.modifyTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

}
