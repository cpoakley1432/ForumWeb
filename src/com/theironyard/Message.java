package com.theironyard;

/**
 * Created by cameronoakley on 10/28/15.
 */
public class Message {
    int id;
    int replyid;
    String username;
    String text;

    public Message(int id, int replyid, String username, String text) {
        this.id = id;
        this.replyid = replyid;
        this.username = username;
        this.text = text;
    }
}
