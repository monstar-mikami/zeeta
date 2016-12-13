 package jp.tokyo.selj.dao;

import java.io.Serializable;

import org.seasar.dao.annotation.tiger.Bean;

@Bean(table = "usertbl")
public class User implements Serializable {

    private String userName;
    private String org;

    public User() {
    }
	public void check(){
    	if(userName == null || "".equals(userName.trim()) ){
    		throw new ModelCheckException("nameを入力してください");
    	}
	}

    public String toString() {
    	return userName;
    }
//    public String toString() {
//        StringBuffer buf = new StringBuffer();
//        buf.append(作業者名).append(", ");
//        buf.append(所属);
//        return buf.toString();
//    }

    public int hashCode() {
        return (int) this.userName.hashCode();
    }

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
	}



}