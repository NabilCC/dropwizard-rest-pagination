package net.nh.entity;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@JsonPropertyOrder({"page", "size", "totalPages", "totalSize", "data"})
public class Page<T> {
    private Integer page;
    private Integer size;
    private Long totalPages;
    private Long totalSize;
    private List<T> data;

    public Page(int page, int size, long totalPages, long totalSize, List<T> data) {
        this.page = page;
        this.size = size;
        this.totalPages = totalPages;
        this.totalSize = totalSize;
        this.data = data;
    }

    public Page() {
    }

    public int getPage() {
        return page;
    }

    public int getSize() {
        return size;
    }

    public long getTotalPages() {
        return totalPages;
    }

    public long getTotalSize() {
        return totalSize;
    }

    public List<T> getData() {
        return data;
    }
}
