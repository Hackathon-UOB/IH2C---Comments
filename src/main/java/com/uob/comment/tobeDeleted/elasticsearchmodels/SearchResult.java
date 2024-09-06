package com.uob.comment.tobeDeleted.elasticsearchmodels;

import lombok.Data;

import java.util.List;


@Data
public class SearchResult {
    private List<SearchResponse> results;

}