package com.example.pojo;

import java.io.OutputStream;

public class InterviewRecordingInfo {
    String questiontitle;
    String recordingTime;
    int replaceableCount;
    String replaceCountClearFlg;
    String interiewId;
    String questionId;
    OutputStream movie;

    public String getQuestiontitle() {
        return questiontitle;
    }

    public void setQuestiontitle(String questiontitle) {
        this.questiontitle = questiontitle;
    }

    public String getRecordingTime() {
        return recordingTime;
    }

    public void setRecordingTime(String recordingTime) {
        this.recordingTime = recordingTime;
    }

    public int getReplaceableCount() {
        return replaceableCount;
    }

    public void setReplaceableCount(int replaceableCount) {
        this.replaceableCount = replaceableCount;
    }

    public String getReplaceCountClearFlg() {
        return replaceCountClearFlg;
    }

    public void setReplaceCountClearFlg(String replaceCountClearFlg) {
        this.replaceCountClearFlg = replaceCountClearFlg;
    }

    public String getInteriewId() {
        return interiewId;
    }

    public void setInteriewId(String interiewId) {
        this.interiewId = interiewId;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public OutputStream getMovie() {
        return movie;
    }

    public void setMovie(OutputStream movie) {
        this.movie = movie;
    }
}
