package com.example.azielinska.takapplication.data_model;

import java.text.DateFormat;

/**
 * Created by azielinska on 11/05/2017.
 */
public class Task
{
    private int _Id;
    private int _CategoryId;
    private int _StatusId;
    private DateFormat _TimeFrom;
    private DateFormat _TimeTo;
    private int _CreatorId;
    private DateFormat _CreationTime;
    private Integer _ExecutorId;
    private DateFormat _ExecutionTime;
    private int _IsApproved;

    public int get_Id() {
        return _Id;
    }

    public void set_Id(int _Id) {
        this._Id = _Id;
    }

    public int get_CategoryId() {
        return _CategoryId;
    }

    public void set_CategoryId(int _CategoryId) {
        this._CategoryId = _CategoryId;
    }

    public int get_StatusId() {
        return _StatusId;
    }

    public void set_StatusId(int _StatusId) {
        this._StatusId = _StatusId;
    }

    public DateFormat get_TimeFrom() {
        return _TimeFrom;
    }

    public void set_TimeFrom(DateFormat _TimeFrom) {
        this._TimeFrom = _TimeFrom;
    }

    public DateFormat get_TimeTo() {
        return _TimeTo;
    }

    public void set_TimeTo(DateFormat _TimeTo) {
        this._TimeTo = _TimeTo;
    }

    public int get_CreatorId() {
        return _CreatorId;
    }

    public void set_CreatorId(int _CreatorId) {
        this._CreatorId = _CreatorId;
    }

    public DateFormat get_CreationTime() {
        return _CreationTime;
    }

    public void set_CreationTime(DateFormat _CreationTime) {
        this._CreationTime = _CreationTime;
    }

    public Integer get_ExecutorId() {
        return _ExecutorId;
    }

    public void set_ExecutorId(Integer _ExecutorId) {
        this._ExecutorId = _ExecutorId;
    }

    public DateFormat get_ExecutionTime() {
        return _ExecutionTime;
    }

    public void set_ExecutionTime(DateFormat _ExecutionTime) {
        this._ExecutionTime = _ExecutionTime;
    }

    public int get_IsApproved() {
        return _IsApproved;
    }

    public void set_IsApproved(int _IsApproved) {
        this._IsApproved = _IsApproved;
    }
}
