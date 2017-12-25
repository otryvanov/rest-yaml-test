package com.github.rest.yaml.test.beans;

import java.util.Arrays;
import java.util.List;

import com.github.rest.yaml.test.beans.YamlBodyAssert.ExpressionType;

public class YamlBodyAssert {

	String jsonPath;
	String regex;
	String select;
	String match;
	String value;
	
	public static enum ExpressionType {
		regex_match("regex.match"), // return match count
		regex_find("regex.find"), // return match values
		jsonpath("jsonpath"),
		string("string");
		
		private String value;
		
		private ExpressionType(String value) {
			this.value = value;
		}
		
		public static boolean exist(String string) {
			for(ExpressionType exp: ExpressionType.values()) {
				if(exp.toString().equalsIgnoreCase(string)) {
					return true;
				}
			}
			return false;
		}
		
		@Override
		public String toString() {
			return value;
		}
	}
	
	public String getJsonPath() {
		return jsonPath;
	}

	public void setJsonPath(String jsonPath) {
		this.jsonPath = jsonPath;
	}

	public String getMatch() {
		return match;
	}

	public void setMatch(String match) {
		this.match = match;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getSelect() {
		if(select == null) {
			if(regex != null) {
				select = ExpressionType.regex_find + " " + regex;
			}
			if(jsonPath != null) {
				select = ExpressionType.jsonpath +" " + jsonPath;
			}
		}
		return select;
	}

	public void setSelect(String select) {
		this.select = select;
	}

	public String getRegex() {
		return regex;
	}

	public void setRegex(String regex) {
		this.regex = regex;
	}
}
