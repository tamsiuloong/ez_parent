package com.yaorange.jk.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * @Description:	笔记
 * @Author:			Coach tam
 * @Company:		坚持灵活  灵活坚持
 * @CreateDate:		2018-4-7 9:43:35
 */
public class Note extends BaseEntity {
	private static final long serialVersionUID = 1L;
	private String id;
	private String title;			//标题
	private String mind;			//思维导图总结
	private Integer feelings;			//学习感受
	private String difficulties;			//难点
	private String advice;			//学习建议
	private String code;    //代码

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}	
	public String getMind() {
		return this.mind;
	}
	public void setMind(String mind) {
		this.mind = mind;
	}	
	public String getDifficulties() {
		return this.difficulties;
	}
	public void setDifficulties(String difficulties) {
		this.difficulties = difficulties;
	}	
	public String getAdvice() {
		return this.advice;
	}
	public void setAdvice(String advice) {
		this.advice = advice;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getFeelings() {
		return feelings;
	}

	public void setFeelings(Integer feelings) {
		this.feelings = feelings;
	}
}
