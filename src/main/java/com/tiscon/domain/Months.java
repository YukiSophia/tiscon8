package com.tiscon.domain;

import java.io.Serializable;

public class Months implements Serializable {

    private String MonthsId;

    private String MonthsName;

    public String getMonthsId() {
        return MonthsId;
    }

    public void setMonthsId(String MonthsId) {
        this.MonthsId = MonthsId;
    }

    public String getMonthsName() {
        return MonthsName;
    }

    public void setMonthsName(String MonthsName) {
        this.MonthsName = MonthsName;
    }
}
