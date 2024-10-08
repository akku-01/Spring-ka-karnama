package com.cntmgr.contactmanager.helper;

public class Message {
    private String content;
    private String type;
    public String getContent() {
        return content;
    }
    @Override
    public String toString() {
        return "Message [content=" + content + ", type=" + type + "]";
    }
    public void setContent(String content) {
        this.content = content;
    }
    public Message(String content, String type) {
        this.content = content;
        this.type = type;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Message(){
        super();
    }
}
