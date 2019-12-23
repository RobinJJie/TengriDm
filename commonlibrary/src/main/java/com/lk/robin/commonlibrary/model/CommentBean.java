package com.lk.robin.commonlibrary.model;

import java.util.List;

/**
 * author: li xiao
 * created on: 2019/12/9
 */
public class CommentBean {
    public String id;
    public String classId;
    public String fatherClassId;
    public String userId;
    public String userName;
    public String userPic;
    public String phone;
    public String location;
    public long createTime;
    public String content;
    public long updateTime;
    public String updateBy;
    public int source;
    public String mediaType;
    public String backgroundImage;
    public String domainTitle;
    public int type;
    public String picUrl;
    public String videoUrl;
    public String videoImageUrl;
    public String voiceUrl;
    public float voiceLength;
    public String maxId;
    public int like;
    public int isLike;
    public String replayCount;
    public List<String> thumpsUpDetailsList; //TODO
    public List<String> picUrls;// TODO  格式问题
    public String className;
    public int lockState;
    public String lockLength;

    public List<CommentReplayBean> replayList;

    public static class CommentReplayBean {
        private String id;
        private String commentId;
        private String userPic;
        private String userId;
        private String parentUserId;
        private String userNickname;
        private String content;
        private String commentTime;
        private String parentUserNickname;
    }

    public CommentBean(String userName, String userPic, long createTime, String content, String picUrl, String videoUrl, String videoImageUrl) {
        this.userName = userName;
        this.userPic = userPic;
        this.createTime = createTime;
        this.content = content;
        this.picUrl = picUrl;
        this.videoUrl = videoUrl;
        this.videoImageUrl = videoImageUrl;
    }
}
