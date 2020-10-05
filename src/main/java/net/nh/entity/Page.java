package net.nh.entity;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({"page", "size", "totalPages", "totalSize", "data"})
public class Page<T> {
    private Integer page;
    private Integer size;
    private Long totalPages;
    private Long totalSize;
    private List<T> data;
}
