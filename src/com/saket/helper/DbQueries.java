package com.saket.helper;

public class DbQueries {
 private String insertQuery = "";
 private String searchQuery = "";	
 private String changePasswordQuery = "";

public String getChangePasswordQuery() {
	return changePasswordQuery;
}

public void setChangePasswordQuery(String changePasswordQuery) {
	this.changePasswordQuery = changePasswordQuery;
}

public String getSearchQuery() {
	return searchQuery;
}

public void setSearchQuery(String searchQuery) {
	this.searchQuery = searchQuery;
}

public String getInsertQuery() {
	return insertQuery;
}

public void setInsertQuery(String insertQuery) {
	this.insertQuery = insertQuery;
}


}
