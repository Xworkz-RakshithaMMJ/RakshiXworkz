package com.xworkz.chatsUtil;

import com.xworkz.chats.Chats;

public class ChatsUtil {
public static void main(String[] args) {
	Chats chats = new Chats("Pani puri",20);
	System.out.println(chats.getTypeOfChat()+" "+chats.getPrice());
}
}
