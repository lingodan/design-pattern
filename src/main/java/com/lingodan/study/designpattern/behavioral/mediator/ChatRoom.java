package com.lingodan.study.designpattern.behavioral.mediator;

/**
 * @author lingodan
 * Created on 2020/6/4 22:22.
 */
public class ChatRoom {

    public static void showMsg(User user,String msg){
        System.out.println(user.getName() + ":" + msg);
    }

}
