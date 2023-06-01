package com.api.prog4td1p1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public enum ClassUniqueInstance {

    INSTANCE(29);

    private Number click;

    public ClassUniqueInstance getInstance() {
        return INSTANCE;
    }

    public void setClick(Number click) {
        this.click = click;
    }

    public Number getClick() {
        return click;
    }
}