package com.xworkz.KeyUtil;

import com.xworkz.Keys.Keys;

public class KeysUtil {
public static void main(String[] args) {
	Keys key = new Keys();
	key.price=50.00;
	key.noOfKeys=4;
	System.out.println(key.price);
	System.out.println(key.noOfKeys);
	Keys.toLock();
	Keys.toUnlock();

}
}
