package cn.vetech.vedsb.common.entity.base;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.vetech.core.modules.mybatis.page.AbstractPageEntity;

@Table(name = "sms_mb")
public class SmsMb extends AbstractPageEntity implements Serializable{
	/**
	 * 注释内容
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator="no")
	 private String mbbh;
	 private String mbmc;
	 private String nrsz;
	 private String fssm;
	 private String sfkq;
	 private String mblx;
	 private String mbfl;
	 private String cpfl;
	 private String zdfs;
	 private String sfxt;
	 
	 
	public String getMbbh() {
		return mbbh;
	}
	public void setMbbh(String mbbh) {
		this.mbbh = mbbh;
	}
	public String getMbmc() {
		return mbmc;
	}
	public void setMbmc(String mbmc) {
		this.mbmc = mbmc;
	}
	public String getNrsz() {
		return nrsz;
	}
	public void setNrsz(String nrsz) {
		this.nrsz = nrsz;
	}
	public String getFssm() {
		return fssm;
	}
	public void setFssm(String fssm) {
		this.fssm = fssm;
	}
	public String getSfkq() {
		return sfkq;
	}
	public void setSfkq(String sfkq) {
		this.sfkq = sfkq;
	}
	public String getMblx() {
		return mblx;
	}
	public void setMblx(String mblx) {
		this.mblx = mblx;
	}
	public String getMbfl() {
		return mbfl;
	}
	public void setMbfl(String mbfl) {
		this.mbfl = mbfl;
	}
	public String getCpfl() {
		return cpfl;
	}
	public void setCpfl(String cpfl) {
		this.cpfl = cpfl;
	}
	public String getZdfs() {
		return zdfs;
	}
	public void setZdfs(String zdfs) {
		this.zdfs = zdfs;
	}
	public String getSfxt() {
		return sfxt;
	}
	public void setSfxt(String sfxt) {
		this.sfxt = sfxt;
	}
	 
	 
}
