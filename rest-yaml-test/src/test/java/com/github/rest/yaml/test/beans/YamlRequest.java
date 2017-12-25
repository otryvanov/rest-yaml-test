package com.github.rest.yaml.test.beans;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class YamlRequest {

	@JsonIgnore
	private YamlTest yamlTest;
	private String uri;
	private String method;
	private Map<String, String> headers;
	private String body;
	private Map<String, String> parameters;
	private Map<String, String> cookies;
	private boolean encodeURL;

	public YamlTest getYamlTest() {
		return yamlTest;
	}

	public void setYamlTest(YamlTest yamlTest) {
		this.yamlTest = yamlTest;
	}

	public String getUri() {
		uri = getYamlTest().getYamlTestGroup().getYamlInitGroup().replaceVariable(uri);
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public Map<String, String> getHeaders() {
		headers = getYamlTest().getYamlTestGroup().getYamlInitGroup().replaceVariable(headers);
		return headers;
	}

	public void setHeaders(Map<String, String> headers) {
		this.headers = headers;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public Map<String, String> getParameters() {
		parameters = getYamlTest().getYamlTestGroup().getYamlInitGroup().replaceVariable(parameters);
		return parameters;
	}

	public void setParameters(Map<String, String> parameters) {
		this.parameters = parameters;
	}

	public Map<String, String> getCookies() {
		cookies = getYamlTest().getYamlTestGroup().getYamlInitGroup().replaceVariable(cookies);
		return cookies;
	}

	public void setCookies(Map<String, String> cookies) {
		this.cookies = cookies;
	}

	public boolean isEncodeURL() {
		return encodeURL;
	}

	public void setEncodeURL(boolean encodeURL) {
		this.encodeURL = encodeURL;
	}

}
