package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class PhoneApp {
	
	public static void main(String[] args) throws IOException {
		
		
		//Input --> FileInput (Read)
		Reader is = new FileReader("C:\\javaStudy\\file\\PhoneDB.txt");

		//Input Stream Reader --> Input Stream Reader (사실 파일이 UTF-8이기 때문에 ISR 사용 안해도 괜찮음)
//		InputStreamReader isr = new InputStreamReader(is, "UTF-8");
		//BufferedReader --> BufferedReader
		
		BufferedReader br = new BufferedReader(is);
	
		List<Person> pList = new ArrayList<Person>();
		
		String file;
		
		while (true) {
			file = br.readLine();
			if (file == null) {
				break;
			}
			//짜르는 코드
			String[] iInfo = file.split(","); //new String[3]
			
			String name = iInfo[0];
			String hp = iInfo[1];
			String company = iInfo[2];
			
			Person p = new Person(name, hp, company);
			pList.add(p);
			
		}
		
		for(int i = 0; i <pList.size(); i++) {
			System.out.println("이름: " + pList.get(i).getName());
			System.out.println("핸드폰: " + pList.get(i).getHp());
			System.out.println("회사: " + pList.get(i).getCompany());
			System.out.println();
		}
		
		
		br.close();
	}

}
