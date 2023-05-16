package com.example.javaproject2.week4.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReadFileEx {
    public List<String> getLine(String fileName) { // 주어진 파일의 경로를 받고 해당 파일을 한줄씩 읽은 후 리스트에 저장
        List<String> lines = new LinkedList<>();

        try (BufferedReader br = Files.newBufferedReader(
                Paths.get("C:\\Users\\sunba\\Downloads\\hospital_info_0920_utf8\\hospital_info_0920_utf8.csv"), StandardCharsets.UTF_8)) {
            //paths.get() -> 파일 경로 지정. / StandardCharsets.UTF_8 로 인코딩 지정
            String line; // 문자열 변수 line 선언
            while ((line = br.readLine()) != null) { //파일에서 한줄씩 읽는다 , line이 null이 아닐떄까지
                lines.add(line); // 출력
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lines;
    }

    public Hospital parse(String str){ // 주어진 문자열을 파싱하여 Hospital 객체로 변환 / , 로 분리된 형태 / 각 필드를 적절한 인덱스로 접근하여 Hospital 객체를 생성하고 반환
        System.out.println(str);
        String[] splitted = str.split(",");
        Address address = new Address(splitted[10], splitted[5], splitted[7]);
        Hospital hospital = new Hospital(splitted[1], splitted[11], address);

        return hospital;
    }

    public List<Hospital> getHospitals(List<String> lines) { //문자열 리스트를 받아 parse / 이후 Hospital 객체들을 리스트에 저장
        List<Hospital> hospitals = new ArrayList<>();
        for (String line : lines){
            hospitals.add(parse(line));
        }
        return hospitals;
    }

    public static void main(String[] args) throws IOException {
        ReadFileEx readFileEx = new ReadFileEx();
        List<String> result = readFileEx.getLine("C:\\Users\\sunba\\Downloads\\hospital_info_0920_utf8\\hospital_info_0920_utf8.csv");
        List<Hospital> parsedHospital = readFileEx.getHospitals(result);
        for (int i = 0; i < parsedHospital.size(); i++) {
            Hospital hospital = parsedHospital.get(i); // get(i)로 현재 인덱스에 해당하는 Hospital 객체를 가져온다.
            System.out.printf("%s %s %s\n", hospital.getName(), hospital.getWebsiteAddr(),
                    hospital.getAddress().getFullAddr());
        }
    }
}
