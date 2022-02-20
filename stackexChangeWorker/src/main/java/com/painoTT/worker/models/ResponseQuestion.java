package com.painoTT.worker.models;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.io.Serializable;
import java.util.ArrayList;

/**
 * Ответ полученный с stackexchange
 */
public class ResponseQuestion implements Serializable {

    @JsonProperty("items")
    public ArrayList<Question> items;

    @JsonProperty("has_more")
    public boolean hasMore;

    @JsonProperty("quota_max")
    public int quotaMax;

    @JsonProperty("quota_remaining")
    public int quotaRemaining;

    public ArrayList<Question> getItems() {
        return items;
    }

    public void setItems(ArrayList<Question> items) {
        this.items = items;
    }

    public boolean isHasMore() {
        return hasMore;
    }

    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }

    public int getQuotaMax() {
        return quotaMax;
    }

    public void setQuotaMax(int quotaMax) {
        this.quotaMax = quotaMax;
    }

    public int getQuotaRemaining() {
        return quotaRemaining;
    }

    public void setQuotaRemaining(int quotaRemaining) {
        this.quotaRemaining = quotaRemaining;
    }
}
