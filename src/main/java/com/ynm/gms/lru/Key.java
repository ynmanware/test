package com.ynm.gms.lru;

import java.util.Objects;

/**
 * @auther Yogesh Manware
 */
public class Key {
    private String account;
    private String cmd;

    public Key(String fnn, String cmd) {
        this.account = fnn;
        this.cmd = cmd;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key key = (Key) o;
        return Objects.equals(account, key.account) &&
                Objects.equals(cmd, key.cmd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(account, cmd);
    }
}
