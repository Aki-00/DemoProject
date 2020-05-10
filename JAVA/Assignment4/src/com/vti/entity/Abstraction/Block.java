package com.vti.entity.Abstraction;

public enum Block {
	A, B, C;
	
	public static Block setBlock(String block) {
		if (block.equals(A)){
			return A;
		}else if (block.equals(B)){
			return B;
		}else if (block.equals(C)) {
			return C;
		}else System.out.println("Moi nhap lai!");
		return null;
	}
}
