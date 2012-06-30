package jp.itacademy.samples.api.collection;

import java.util.ArrayList;
import java.util.List;

public class ListSample {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("Taro");
		names.add("Jiro");
		names.add("Saburo");

		for (String name : names) {
			System.out.println(name);
		}
		System.out.println("�P����: " + names.get(0));
		System.out.println("�Q����: " + names.get(1));
		System.out.println("���X�g�̃T�C�Y: " + names.size());
		System.out.println("���X�g���󂩂ǂ���: " + names.isEmpty());
		names.remove(0);
		for (String name : names) {
			System.out.println(name);
		}
	}

}
