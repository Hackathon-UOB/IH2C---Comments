package com.uob.comment.tobeDeleted.dto.Request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.uob.comment.tobeDeleted.dbmodel.User;
import com.uob.comment.tobeDeleted.dto.Common.TagSelected;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;
import java.util.List;

@Data
@Setter
@Getter
public class PrecaptureRequestDto {
    @JsonProperty("username")
    private String Username;
    @JsonProperty("password")
    private String Password;
    @JsonProperty("selectedTag")
    private List<BigInteger> selected_tag;
    @JsonIgnore
    private User user;
    private List<TagSelected> selected_list;
}
