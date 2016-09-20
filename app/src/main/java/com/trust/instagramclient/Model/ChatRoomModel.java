package com.trust.instagramclient.Model;

/**
 채팅방 모델
 */
public class ChatRoomModel {
    private int roomId;
    private String user;
    private String mqtt_topic;
    private int status;

    public ChatRoomModel(int roomId, String user, String mqtt_topic, int status) {
        this.roomId = roomId;
        this.user = user;
        this.mqtt_topic = mqtt_topic;
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMqttTopic() {
        return mqtt_topic;
    }

    public void setMqttTopic(String mqtt_topic) {
        this.mqtt_topic = mqtt_topic;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }
}
