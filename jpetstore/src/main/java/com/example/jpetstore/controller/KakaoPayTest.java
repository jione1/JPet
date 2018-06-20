package com.example.jpetstore.controller;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import java.util.List;

import com.example.jpetstore.domain.KakaoPayRequest;
import com.example.jpetstore.domain.KakaoPayResponse;

public class KakaoPayTest {
    private static final String HOST = "https://kapi.kakao.com";

//		HttpClient httpClient = new DefaultHttpClient();
//		String url = "https://kapi.kakao.com/v1/payment/ready";
//		HttpPost httpPost = new HttpPost(url);
//		httpPost.setHeader("Accept", "application/json");
//		httpPost.setHeader("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");
//		httpPost.setHeader("Authorization", "KakaoAK eb8c19bbcb9d4176ff28f3a8a2f55174");
//		
//		HttpEntity httpEntity = new ByteArrayEntity(sendObject.toString().getBytes("utf-8"));
//		httpPost.setEntity(httpEntity);
//		HttpResponse httpResponse = httpClient.execute(httpPost);
//		
//    	public static void main(String[] args) throws RestClientException, URISyntaxException {
//    	    paymentReady(KakaoPayRequest kakaoPayRequest);
//        }
//    	
    	private static void paymentReady(KakaoPayRequest kakaoPayRequest) throws RestClientException, URISyntaxException {

    	    RestTemplate restTemplate = new RestTemplate();
  
		    // 서버로 요청할 Body
		    MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
		    params.add("cid", "TC0ONETIME");
		    params.add("partner_order_id", "1001");
		    params.add("partner_user_id", "jyy");
		    params.add("item_name", "초코파이");
		    params.add("quantity", "1");
		    params.add("total_amount", "3800");
		    params.add("tax_free_amount", "0");
		    params.add("approval_url", "http://localhost:8080/kakao/kakaoPay.do");
		    params.add("cancel_url", "http://localhost:8080/kakao/kakaoPay.do");
		    params.add("fail_url", "http://localhost:8082/kakao/kakaoPay.do");
		    
		    // 서버로 요청할 Header
		    HttpHeaders headers = new HttpHeaders();
		    headers.add("Authorization", "KakaoAK " + "eb8c19bbcb9d4176ff28f3a8a2f55174");
		    headers.add("Accept", MediaType.APPLICATION_JSON_UTF8_VALUE);
		    headers.add("Content-Type", MediaType.APPLICATION_FORM_URLENCODED_VALUE + ";charset=UTF-8");
 
		    HttpEntity<MultiValueMap<String, String>> request = new HttpEntity(params, headers);
		    String response = restTemplate.postForObject(new URI(HOST + "/v1/payment/ready"), request, String.class);
		    System.out.println(response);
    	}
//	

//		KakaoPayResponse responseDomain =new ObjectMapper().readValue(EntityUtils.toString(httpResponse.getEntity()), KakaoPayResponse.class);
//		System.out.println("¿©±â : "+responseDomain);
//		return responseDomain;
		
	
	public void connectPay() {
		
	}
	
	public void allowPay() {
		
	}


	public static Object readyPay(KakaoPayRequest kakaoPayRequest) {
		
		RestTemplate restTemplate = new RestTemplate();
		  
	    // 서버로 요청할 Body
	    MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
	    params.add("cid", "TC0ONETIME");
	    params.add("partner_order_id", "1001");
	    params.add("partner_user_id", "jyy");
	    params.add("item_name", "초코파이");
	    params.add("quantity", "1");
	    params.add("total_amount", "3800");
	    params.add("tax_free_amount", "0");
	    params.add("approval_url", "http://localhost:8080/kakao/kakaoPay.do");
	    params.add("cancel_url", "http://localhost:8080/kakao/kakaoPay.do");
	    params.add("fail_url", "http://localhost:8082/kakao/kakaoPay.do");
	    
	    // 서버로 요청할 Header
	    HttpHeaders headers = new HttpHeaders();
	    headers.add("Authorization", "KakaoAK " + "eb8c19bbcb9d4176ff28f3a8a2f55174");
	    headers.add("Accept", MediaType.APPLICATION_JSON_UTF8_VALUE);
	    headers.add("Content-Type", MediaType.APPLICATION_FORM_URLENCODED_VALUE + ";charset=UTF-8");

	    HttpEntity<MultiValueMap<String, String>> request = new HttpEntity(params, headers);
	    String response = restTemplate.postForObject(new URI(HOST + "/v1/payment/ready"), request, String.class);
	    System.out.println(response);
	    
	    return response;
	}
}