package com.mat.zip.board.service;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class ReviewSentimentService {
    public JSONObject analyze(String requestBody) {
        // requestBody 디코딩 부분 제거
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        
        // NAVER Clover Sentiment 요청 헤더 
        headers.set("X-NCP-APIGW-API-KEY-ID", "3uzmdwnb3e");
        headers.set("X-NCP-APIGW-API-KEY", "cfeIcnHDzQ5A9vq2Bj7ulYNqDnr7sLVw6MsxTBzO");
        headers.setContentType(new MediaType("application", "json", StandardCharsets.UTF_8));

        HttpEntity<String> entity = new HttpEntity<>(requestBody, headers);

        String url = "https://naveropenapi.apigw.ntruss.com/sentiment-analysis/v1/analyze";
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);
        String responseBody = response.getBody();
        
        try {
            responseBody = new String(responseBody.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new JSONObject(responseBody);
    }
}
