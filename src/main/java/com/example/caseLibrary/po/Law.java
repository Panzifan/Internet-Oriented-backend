package com.example.caseLibrary.po;

import com.example.caseLibrary.enums.Department;
import com.example.caseLibrary.enums.Level;
import com.example.caseLibrary.enums.LawType;
import com.example.caseLibrary.enums.LawState;

public class Law {
    private Integer id;
    private String title;
    private String lawNumber;
    private LawType lawType;
    private Department publicDepartment;
    private Level level;
    private String publicDate;
    private String executeDate;
    private Department explainDepartment;
    private String operator;
    private String entryTime;
    private String content;
    private LawState state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLawNumber() {
        return lawNumber;
    }

    public void setLawNumber(String lawNumber) {
        this.lawNumber = lawNumber;
    }

    public LawType getLawType() {
        return lawType;
    }

    public void setLawType(LawType lawType) {
        this.lawType = lawType;
    }

    public Department getPublicDepartment() {
        return publicDepartment;
    }

    public void setPublicDepartment(Department publicDepartment) {
        this.publicDepartment = publicDepartment;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public String getPublicDate() {
        return publicDate;
    }

    public void setPublicDate(String publicDate) {
        this.publicDate = publicDate;
    }

    public String getExecuteDate() {
        return executeDate;
    }

    public void setExecuteDate(String executeDate) {
        this.executeDate = executeDate;
    }

    public Department getExplainDepartment() {
        return explainDepartment;
    }

    public void setExplainDepartment(Department explainDepartment) {
        this.explainDepartment = explainDepartment;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LawState getState() {
        return state;
    }

    public void setState(LawState state) {
        this.state = state;
    }
}
