package com.praticaspring.cursomc.resources.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class URL {
	
	public static List<Integer> decodeIntList(String string){
//		String [] vet = string.split(",");
//		List<Integer> list = new ArrayList<>();
//		for(int i=0; i<vet.length; i++) {
//			list.add(Integer.parseInt(vet[i]));
//		}
//		return list;
		return Arrays.asList(string.split(",")).stream().map(x -> Integer.parseInt(x)).collect(Collectors.toList());
	}
	
	public static String decodeParam(String string) {
		try {
			return URLDecoder.decode(string, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			return "";
		}
	}

}
